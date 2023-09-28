package in.ineuron.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int insert(StudentBO bo) {
		int rowAffected = (int) hibernateTemplate.save(bo);
		return rowAffected;
	}

	@Override
	public void delete(int id) {
		StudentBO bo = hibernateTemplate.get(StudentBO.class, id);
		if(bo != null) {
			hibernateTemplate.delete(bo);
		}
		else {
			System.out.println("Not Found");
		}
	}

	@Override
	public void update(StudentBO bo) {
		hibernateTemplate.update(bo);
	}

	@Override
	public StudentBO getStudentBO(int id) {
		StudentBO bo = hibernateTemplate.get(StudentBO.class, id);
		return bo;
	}

	@Override
	public List<StudentBO> getAllStudentBOs() {
		List<StudentBO> student = hibernateTemplate.loadAll(StudentBO.class);
		return student;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
	}

}
