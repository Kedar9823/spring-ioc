package in.ineuron.service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

public class CustomerManagementServiceImpl implements ICustomerManagementService {

	private ICustomerDAO customerDAO;
	
	
	
	public CustomerManagementServiceImpl(ICustomerDAO customerDAO) {
		System.out.println("CustomerManagementServiceImpl 1 param constructor Instantiated ----> "+customerDAO.getClass().getName());
		this.customerDAO = customerDAO;
	}



	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		
		Float interestAmount = (dto.getpAmt() * dto.getRate() * dto.getTime()) / 100.0f ;
		
		CustomerBO customerBO = new CustomerBO(); 
		customerBO.setCustomerName(dto.getCustomerName());
		customerBO.setCustomerAddress(dto.getCustomerAddress());
		customerBO.setInterestAmount(interestAmount);
		customerBO.setpAmt(dto.getpAmt());
		customerBO.setRate(dto.getRate());
		customerBO.setTime(dto.getTime());
		
		int result = customerDAO.save(customerBO);
		return result==0?"Customer registration failed":"customer registration got successfull with interestAmount:: "+interestAmount;
	}

}
