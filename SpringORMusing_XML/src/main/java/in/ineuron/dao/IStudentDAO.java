package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.StudentBO;

public interface IStudentDAO {

	public int insert(StudentBO s);
	
	public void delete(int id);
	
	public void update(StudentBO s);
	
	public StudentBO getStudentBO(int id);
	
	public List<StudentBO> getAllStudentBOs();
}
