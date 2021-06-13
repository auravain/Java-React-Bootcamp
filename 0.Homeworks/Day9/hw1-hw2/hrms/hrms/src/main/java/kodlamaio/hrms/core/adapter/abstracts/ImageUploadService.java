package kodlamaio.hrms.core.adapter.abstracts;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;

public interface ImageUploadService {

	@SuppressWarnings("rawtypes")
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
	
}