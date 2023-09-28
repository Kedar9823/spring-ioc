package in.ineuron.service;

import in.ineuron.dto.CustomerDTO;

public interface ICustomerManagementService {
	public String calculateSimpleInterest(CustomerDTO customerDTO) throws Exception;
}
