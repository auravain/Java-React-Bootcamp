import axios from 'axios';

export default class JobPostService {
	getAllJobPosts() {
		return axios.get('http://localhost:8080/api/jobPosts/getAll');
	}
	getByEmpId() {
		return axios.get('http://localhost:8080/api/jobPosts/getByEmpId');
	}
	getDataBySortedDesc() {
		return axios.get('http://localhost:8080/api/jobPosts/getDataBySortedDesc');
	}
	getDataBySortedAsc() {
		return axios.get('http://localhost:8080/api/jobPosts/getDataBySortedAsc');
	}
	add(jobPosts) {
		return axios.post('http://localhost:8080/api/jobPosts/add');
	}
	update(jobPosts) {
		return axios.put('http://localhost:8080/api/jobPosts/update');
	}
}
