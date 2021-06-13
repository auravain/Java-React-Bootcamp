package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerDto {
	
	private String companyName;
	private String email;
	private String website;
	private String phone;
	private String confirmation;
	private String url;
	
}