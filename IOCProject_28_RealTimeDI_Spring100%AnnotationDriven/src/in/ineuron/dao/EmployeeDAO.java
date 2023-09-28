package in.ineuron.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;

@Repository(value="dao")
public class EmployeeDAO implements IEmployeeDAO{
	
	@Autowired
	public DataSource dataSource;
	
	static {
		System.out.println("EmployeeDAO.class file loading...");
	}

	public EmployeeDAO() {
		System.out.println("EmployeeDAO Zero param constructor");
	}

	@Override
	public EmployeeBO save(EmployeeBO bo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [dataSource=" + dataSource + "]";
	}
}
