package in.ineuron.service;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.StudentBO;
import in.ineuron.dao.IStudentDAO;
import in.ineuron.dto.StudentDTO;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDAO dao;

	@Override
	public int insert(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.insert(bo);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void update(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		dao.update(bo);
	}

	@Override
	public StudentDTO getStudentBO(int id) {
		StudentBO bo = dao.getStudentBO(id);
		StudentDTO dto = null;
		if(bo != null) {
			dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
		}
		return dto;
	}

	@Override
	public List<StudentDTO> getAllStudentBO() {
		List<StudentBO> studentBO = dao.getAllStudentBOs();
		List<StudentDTO> studentdto = new ArrayList<StudentDTO>();
		studentBO.forEach(bo->{
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			studentdto.add(dto);
		});
		return studentdto;
	}

	@Override
	public String toString() {
		return "StudentServiceImpl [dao=" + dao + "]";
	}

}
