package niv.test.model;

public class BranchAndFinancialInstitutionIdentification {

    protected FinancialInstitutionIdentification finInstnId;

    protected BranchData brnchId;

    public FinancialInstitutionIdentification getFinInstnId() {
        return finInstnId;
    }

    public void setFinInstnId(FinancialInstitutionIdentification value) {
        this.finInstnId = value;
    }

    public BranchData getBrnchId() {
        return brnchId;
    }

    public void setBrnchId(BranchData value) {
        this.brnchId = value;
    }

}
