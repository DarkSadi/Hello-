package model;
// Generated 7 Sep, 2017 7:26:20 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * University generated by hbm2java
 */
public class University  implements java.io.Serializable {


     private Integer universityId;
     private Division division;
     private String universityName;
     private Date mouDate;
     private Boolean tup;
     private Boolean fs;
     private String type;
     private BigDecimal lat;
     private BigDecimal lng;
     private Set batches = new HashSet(0);

    public University() {
    }

	
    public University(Division division, String universityName) {
        this.division = division;
        this.universityName = universityName;
    }
    public University(Division division, String universityName, Date mouDate, Boolean tup, Boolean fs, String type, BigDecimal lat, BigDecimal lng, Set batches) {
       this.division = division;
       this.universityName = universityName;
       this.mouDate = mouDate;
       this.tup = tup;
       this.fs = fs;
       this.type = type;
       this.lat = lat;
       this.lng = lng;
       this.batches = batches;
    }
   
    public Integer getUniversityId() {
        return this.universityId;
    }
    
    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }
    public Division getDivision() {
        return this.division;
    }
    
    public void setDivision(Division division) {
        this.division = division;
    }
    public String getUniversityName() {
        return this.universityName;
    }
    
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public Date getMouDate() {
        return this.mouDate;
    }
    
    public void setMouDate(Date mouDate) {
        this.mouDate = mouDate;
    }
    public Boolean getTup() {
        return this.tup;
    }
    
    public void setTup(Boolean tup) {
        this.tup = tup;
    }
    public Boolean getFs() {
        return this.fs;
    }
    
    public void setFs(Boolean fs) {
        this.fs = fs;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public BigDecimal getLat() {
        return this.lat;
    }
    
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }
    public BigDecimal getLng() {
        return this.lng;
    }
    
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }
    public Set getBatches() {
        return this.batches;
    }
    
    public void setBatches(Set batches) {
        this.batches = batches;
    }




}


