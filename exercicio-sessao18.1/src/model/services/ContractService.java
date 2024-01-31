package model.services;

import java.time.LocalDateTime;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	OnlinePaymentService onlinePaymentService; 
	
	public void processContract(Contract contract, int months) {
		
		for (int i = 0; i < months; i++) {
			 double monthAmount = onlinePaymentService.interest(contract.getTotalContractValue(), months);
			 monthAmount = onlinePaymentService.paymentFee(monthAmount);
			 
			 LocalDateTime dueDate = contract.getContractDate().plusMonths(i);
			 
			 contract.addInstallment(new Installment(dueDate, monthAmount));
		}
		
	}

}
