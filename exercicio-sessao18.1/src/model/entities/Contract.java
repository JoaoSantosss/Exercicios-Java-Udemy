package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Contract {
	
	private Integer contractNumber;
	private LocalDateTime contractDate;
	private Double totalContractValue;
	
	private List<Installment> installments;   
	
	public Contract() {
	}

	public Contract(Integer contractNumber, LocalDateTime contractDate, Double totalContractValue) {
		this.contractNumber = contractNumber;
		this.contractDate = contractDate;
		this.totalContractValue = totalContractValue;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public LocalDateTime getContractDate() {
		return contractDate;
	}

	public void setContractDate(LocalDateTime contractDate) {
		this.contractDate = contractDate;
	}

	public Double getTotalContractValue() {
		return totalContractValue;
	}

	public void setTotalContractValue(Double totalContractValue) {
		this.totalContractValue = totalContractValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}

}
