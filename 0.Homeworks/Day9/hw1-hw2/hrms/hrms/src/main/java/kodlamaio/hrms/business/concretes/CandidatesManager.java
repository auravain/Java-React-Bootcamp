package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidatesService;
import kodlamaio.hrms.core.adapter.abstracts.CheckEmailService;
import kodlamaio.hrms.core.adapter.abstracts.EmailSendService;
import kodlamaio.hrms.core.adapter.abstracts.MernisCheckService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaio.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private CheckEmailService emailCheckService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private List<String> identificationNumbers = new ArrayList<>();

	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, CheckEmailService emailCheckService,
			MernisCheckService mernisCheckService, EmailSendService emailSendService) {
		super();
		this.candidatesDao = candidatesDao;
		this.emailCheckService = emailCheckService;
		this.mernisCheckService = mernisCheckService;
		this.emailSendService = emailSendService;
	}

	@Override
	public Result login(String email, String password) {
		Result result = new ErrorResult("Login unsuccessful !");
		for (int i = 0; i < candidatesDao.findAll().size(); i++) {
			if (candidatesDao.findAll().get(i).getEmail() == email
					&& candidatesDao.findAll().get(i).getPassword() == password) {
				result = new SuccessResult("Login successful !");
			}
		}
		return result;
	}

	@Override
	public Result register(Candidates candidates) {
		Result result = new ErrorResult("Login unsuccessful !");
		if (emailCheckService.mailCheck(candidates.getEmail()) && emailIsItUsed(candidates.getEmail())
				&& nationalIdIsItUsed(candidates.getNationalId()) && mernisCheckService.checkIfRealPerson(candidates)) {
			emailSendService.emailSend(candidates.getEmail());
			this.candidatesDao.save(candidates);
			result = new SuccessResult("Login successful !");
		}
		return result;
	}

	public boolean emailIsItUsed(String email) {
		boolean result = true;
		if (getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}

	public boolean nationalIdIsItUsed(String NationalId) {
		boolean result = true;
		if (getAllNationalId().contains(NationalId)) {
			result = false;
		}
		return result;

	}

	@Override
	public List<String> getAllEmails() {
		for (int i = 0; i < getAll().size(); i++) {
			emails.add(getAll().get(i).getEmail());
		}
		return emails;
	}

	
	@Override
	public List<String> getAllNationalId() {
		for (int i = 0; i < getAll().size(); i++) {
			identificationNumbers.add(getAll().get(i).getNationalId());
		}
		return identificationNumbers;
	}

	@Override
	public List<Candidates> getAll() {
		return this.candidatesDao.findAll();
	}

}
