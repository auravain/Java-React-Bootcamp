import axios from 'axios';

export default class CandidateService {
	getAllCandidates() {
		return axios.get('http://localhost:8080/api/candidates/getall');
	}

	register(candidates) {
		return axios.post('http://localhost:8080/api/candidates/register');
	}
}
