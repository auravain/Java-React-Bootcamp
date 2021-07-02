import axios from 'axios';

export default class EmployerService {
	getAllEmployers() {
		return axios.get('http://localhost:8080/api/employers/getAll');
	}
	register(employers) {
		return axios.post("http://localhost:8080/api/employers/register'");
	}
}
