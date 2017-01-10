package niv.test.model;

public class BranchData {

    protected String id;

    protected String nm;

    protected PostalAddress pstlAdr;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
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

}
