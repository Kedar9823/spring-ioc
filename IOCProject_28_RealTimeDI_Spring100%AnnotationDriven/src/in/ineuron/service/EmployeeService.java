package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IEmployeeDAO;
import in.ineuron.dto.EmployeeDTO;
import in.ineuron.vo.EmployeeVO;

@Service(value="service")
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	public IEmployeeDAO dto;

	static {
		System.out.println("EmployeeService.class file loading...");
	}

	public EmployeeService() {
		System.out.println("EmployeeService Zero param constructor");
	}

	public EmployeeVO calculateHike(EmployeeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeService [dto=" + dto + "]";
	}
}
