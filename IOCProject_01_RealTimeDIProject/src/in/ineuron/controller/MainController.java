package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerManagementService;
import in.ineuron.vo.CustomerVO;

public class MainController {

	private ICustomerManagementService customerService;
	private CustomerDTO customerDTO;
	
	public MainController(ICustomerManagementService customerService) {
		this.customerService = customerService;
		System.out.println("MainController 1 param constructor ----> "+customerService.getClass().getName());
	}

	public String processCustomer(CustomerVO customerVO) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerAddress(customerVO.getCustomerAddress());
		customerDTO.setCustomerName(customerVO.getCustomerName());
		customerDTO.setpAmt(Float.parseFloat(customerVO.getpAmt()));
		customerDTO.setRate(Float.parseFloat(customerVO.getRate()));
		customerDTO.setTime(Float.parseFloat(customerVO.getTime()));

		String result = null;
		try {
			result = customerService.calculateSimpleInterest(customerDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
