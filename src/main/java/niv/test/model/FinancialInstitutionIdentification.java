package niv.test.model;

public class FinancialInstitutionIdentification {

    protected String bicfi;

    protected ClearingSystemMemberIdentification clrSysMmbId;

    protected String nm;

    protected PostalAddress pstlAdr;
    
    protected GenericFinancialIdentification othr;

    public String getBICFI() {
        return bicfi;
    }

    public void setBICFI(String value) {
        this.bicfi = value;
    }

    public ClearingSystemMemberIdentification getClrSysMmbId() {
        return clrSysMmbId;
    }

    public void setClrSysMmbId(ClearingSystemMemberIdentification value) {
        this.clrSysMmbId = value;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String value) {
        this.nm = value;
    }

    public PostalAddress getPstlAdr() {
        return pstlAdr;
    }

    public void setPstlAdr(PostalAddress value) {
        this.pstlAdr = value;
    }

    public GenericFinancialIdentification getOthr() {
        return othr;
    }

    public void setOthr(GenericFinancialIdentification value) {
        this.othr = value;
    }

}
