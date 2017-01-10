package niv.test.model;

import java.util.ArrayList;
import java.util.List;

public class PostalAddress {

    protected String adrTp;

    protected String dept;

    protected String subDept;

    protected String strtNm;

    protected String bldgNb;

    protected String pstCd;

    protected String twnNm;

    protected String ctrySubDvsn;

    protected String ctry;

    protected List<String> adrLine;

    public String getAdrTp() {
        return adrTp;
    }

    public void setAdrTp(String value) {
        this.adrTp = value;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String value) {
        this.dept = value;
    }

    public String getSubDept() {
        return subDept;
    }

    public void setSubDept(String value) {
        this.subDept = value;
    }

    public String getStrtNm() {
        return strtNm;
    }

    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    public String getBldgNb() {
        return bldgNb;
    }

    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    public String getPstCd() {
        return pstCd;
    }

    public void setPstCd(String value) {
        this.pstCd = value;
    }

    public String getTwnNm() {
        return twnNm;
    }

    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    public String getCtry() {
        return ctry;
    }

    public void setCtry(String value) {
        this.ctry = value;
    }

    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<String>();
        }
        return this.adrLine;
    }

}
