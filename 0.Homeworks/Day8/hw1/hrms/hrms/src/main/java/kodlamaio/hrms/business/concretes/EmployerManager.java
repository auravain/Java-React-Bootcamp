package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.adapter.abstracts.EmailSendService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	

	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao,EmailSendService emailSendService) {
		super();
		this.employerDao = employerDao;
		this.emailSendService=emailSendService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Employer listed.");
	}

	@Override
	public Result login(String email, String password) {
		Result result= new ErrorResult("Login unsuccessful !");
		for (int i = 0; i < employerDao.findAll().size(); i++) {
			if(employerDao.findAll().get(i).getEmail()==email && employerDao.findAll().get(i).getPassword()==password) {
				result = new SuccessResult("Login successful !");
			}
		}
		return result;
	}

	@Override
	public Result register(Employer employer) {
		Result result=new ErrorResult("Login unsuccessful !");
		if(emailIsItUsed(employer.getEmail())) {
			emailSendService.emailSend(employer.getEmail());
			employer.setConfirmation(false); 
			this.employerDao.save(employer);
			result = new SuccessResult("Login successful !");
		}
		return result;
	}

	@Override
	public List<String> getAllEmails() {
		for (int i = 0; i < employerDao.findAll().size(); i++) {
			emails.add(employerDao.findAll().get(i).getEmail());
		}
		return emails;
	}
	
	
	public boolean emailIsItUsed(String email) {
		boolean result = true;
		if(getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}

}
