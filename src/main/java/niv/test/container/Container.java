package niv.test.container;

import niv.test.model.BranchAndFinancialInstitutionIdentification;

public class Container {
	private BranchAndFinancialInstitutionIdentification instgAgt;
	private BranchAndFinancialInstitutionIdentification instdAgt;
	
	public Container() {
	}

	public BranchAndFinancialInstitutionIdentification getInstgAgt() {
		return instgAgt;
	}

	public void setInstgAgt(BranchAndFinancialInstitutionIdentification instgAgt) {
		this.instgAgt = instgAgt;
	}

	public BranchAndFinancialInstitutionIdentification getInstdAgt() {
		return instdAgt;
	}

	public void setInstdAgt(BranchAndFinancialInstitutionIdentification instdAgt) {
		this.instdAgt = instdAgt;
	}
	
	
}
