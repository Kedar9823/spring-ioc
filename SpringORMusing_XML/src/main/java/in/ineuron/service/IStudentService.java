package in.ineuron.service;

import java.util.List;

import in.ineuron.dto.StudentDTO;

public interface IStudentService {
	
	public int insert(StudentDTO s);
	
	public void delete(int id);
	
	public void update(StudentDTO s);
	
	public StudentDTO getStudentBO(int id);
	
	public List<StudentDTO> getAllStudentBO();
}
