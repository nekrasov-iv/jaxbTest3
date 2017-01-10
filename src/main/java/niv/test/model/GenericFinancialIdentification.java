package niv.test.model;

public class GenericFinancialIdentification {

    protected String id;

    protected Choice schmeNm;

    protected String issr;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public Choice getSchmeNm() {
        return schmeNm;
    }

    public void setSchmeNm(Choice value) {
        this.schmeNm = value;
    }

    public String getIssr() {
        return issr;
    }

    public void setIssr(String value) {
        this.issr = value;
    }

}
