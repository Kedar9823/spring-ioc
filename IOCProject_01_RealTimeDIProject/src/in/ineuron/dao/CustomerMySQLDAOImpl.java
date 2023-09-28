package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.cj.xdevapi.PreparableStatement;

import in.ineuron.bo.CustomerBO;

public class CustomerMySQLDAOImpl implements ICustomerDAO{

	private static final String REALTIMEDI_CUSTOMER_INSERTSTATEMENT = "insert into customer(`cname`,`caddress`,`pamt`,`rate`,`time`,`intrAmt`) values(?,?,?,?,?,?)" ;
	private DataSource dataSource;
	
	
	public CustomerMySQLDAOImpl(DataSource dataSource) {
		System.out.println("CustomerMySQLDAOImpl 1 param constructor instantiated ----> "+dataSource.getClass().getName());
		this.dataSource = dataSource;
	}


	@Override
	public int save(CustomerBO customerBO) throws Exception {
		DriverManagerDataSource driverSouce = new DriverManagerDataSource();
		int count;
		try(Connection connection = dataSource.getConnection(); PreparedStatement prepare = connection.prepareStatement(REALTIMEDI_CUSTOMER_INSERTSTATEMENT);){

			prepare.setString(1, customerBO.getCustomerName());
			prepare.setString(2, customerBO.getCustomerAddress());
			prepare.setFloat(3, customerBO.getpAmt());
			prepare.setFloat(4, customerBO.getRate());
			prepare.setFloat(5, customerBO.getTime());
			prepare.setFloat(6, customerBO.getInterestAmount());
			
			count = prepare.executeUpdate();
		}
		return count;
	}

}
