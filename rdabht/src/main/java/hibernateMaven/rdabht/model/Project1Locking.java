package model;
// Generated 7 Sep, 2017 7:26:20 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Project1Locking generated by hbm2java
 */
public class Project1Locking  implements java.io.Serializable {


     private Integer id;
     private String table;
     private Date startdatetime;
     private Date confirmdatetime;
     private String keys;
     private String sessionid;
     private String userid;
     private Integer action;

    public Project1Locking() {
    }

	
    public Project1Locking(String table, Date startdatetime, Date confirmdatetime, String keys, String sessionid, String userid) {
        this.table = table;
        this.startdatetime = startdatetime;
        this.confirmdatetime = confirmdatetime;
        this.keys = keys;
        this.sessionid = sessionid;
        this.userid = userid;
    }
    public Project1Locking(String table, Date startdatetime, Date confirmdatetime, String keys, String sessionid, String userid, Integer action) {
       this.table = table;
       this.startdatetime = startdatetime;
       this.confirmdatetime = confirmdatetime;
       this.keys = keys;
       this.sessionid = sessionid;
       this.userid = userid;
       this.action = action;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTable() {
        return this.table;
    }
    
    public void setTable(String table) {
        this.table = table;
    }
    public Date getStartdatetime() {
        return this.startdatetime;
    }
    
    public void setStartdatetime(Date startdatetime) {
        this.startdatetime = startdatetime;
    }
    public Date getConfirmdatetime() {
        return this.confirmdatetime;
    }
    
    public void setConfirmdatetime(Date confirmdatetime) {
        this.confirmdatetime = confirmdatetime;
    }
    public String getKeys() {
        return this.keys;
    }
    
    public void setKeys(String keys) {
        this.keys = keys;
    }
    public String getSessionid() {
        return this.sessionid;
    }
    
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public Integer getAction() {
        return this.action;
    }
    
    public void setAction(Integer action) {
        this.action = action;
    }




}


