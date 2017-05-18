package com.ford.fleet.models;

import java.util.Date;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class AltiResourcetransfers  {
  
  
   
  
  @Id
   
  
  private Long recno = null;
  
   
   
  
  private String employeeid = null;
  
   
   
  
  private String employeename = null;
  
   
   
  
  private Integer accountid = null;
  
   
   
  
  private String project = null;
  
   
   
  
  private String targetplacement = null;
  
   
   
  
  private Integer basecategoryid = null;
  
   
   
  
  private Integer locationid = null;
  
   
   
  
  private Date benchdate = null;
  
   
   
  
  private Date assignmentstartdate = null;
  
   
   
  
  private Date assignmentenddate = null;
  
   
   
  
  private String remarks = null;
  
   
   
  
  private String engagedin = null;
  
   
   
  
  private Date engagedstartdate = null;
  
   
   
  
  private Date engagedenddate = null;
  
   
   
  
  private Float headcount = null;
  
   
   
  
  private Integer status = null;
  
   
   
  
  private String updateduser = null;
  
   
   
  
  private Date updatedtimestamp = null;
  
   
   
  
  private Date inserttimestamp = null;
  
   
   
  
  private String prevrecno = null;
  
   
   
  
  private Integer capabilitycenterid = null;
  
   
   
  
  private Integer assignmentstatusid = null;
  
   
   
  
  private Integer reportingmanageradminid = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getRecno() {
    return recno;
  }
  public void setRecno(Long recno) {
    this.recno = recno;
  }

  
  /**
   * {}
   **/
  public String getEmployeeid() {
    return employeeid;
  }
  public void setEmployeeid(String employeeid) {
    this.employeeid = employeeid;
  }

  
  /**
   * {}
   **/
  public String getEmployeename() {
    return employeename;
  }
  public void setEmployeename(String employeename) {
    this.employeename = employeename;
  }

  
  /**
   * {}
   **/
  public Integer getAccountid() {
    return accountid;
  }
  public void setAccountid(Integer accountid) {
    this.accountid = accountid;
  }

  
  /**
   * {}
   **/
  public String getProject() {
    return project;
  }
  public void setProject(String project) {
    this.project = project;
  }

  
  /**
   * {}
   **/
  public String getTargetplacement() {
    return targetplacement;
  }
  public void setTargetplacement(String targetplacement) {
    this.targetplacement = targetplacement;
  }

  
  /**
   * {}
   **/
  public Integer getBasecategoryid() {
    return basecategoryid;
  }
  public void setBasecategoryid(Integer basecategoryid) {
    this.basecategoryid = basecategoryid;
  }

  
  /**
   * {}
   **/
  public Integer getLocationid() {
    return locationid;
  }
  public void setLocationid(Integer locationid) {
    this.locationid = locationid;
  }

  
  /**
   * {}
   **/
  public Date getBenchdate() {
    return benchdate;
  }
  public void setBenchdate(Date benchdate) {
    this.benchdate = benchdate;
  }

  
  /**
   * {}
   **/
  public Date getAssignmentstartdate() {
    return assignmentstartdate;
  }
  public void setAssignmentstartdate(Date assignmentstartdate) {
    this.assignmentstartdate = assignmentstartdate;
  }

  
  /**
   * {}
   **/
  public Date getAssignmentenddate() {
    return assignmentenddate;
  }
  public void setAssignmentenddate(Date assignmentenddate) {
    this.assignmentenddate = assignmentenddate;
  }

  
  /**
   * {}
   **/
  public String getRemarks() {
    return remarks;
  }
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  
  /**
   * {}
   **/
  public String getEngagedin() {
    return engagedin;
  }
  public void setEngagedin(String engagedin) {
    this.engagedin = engagedin;
  }

  
  /**
   * {}
   **/
  public Date getEngagedstartdate() {
    return engagedstartdate;
  }
  public void setEngagedstartdate(Date engagedstartdate) {
    this.engagedstartdate = engagedstartdate;
  }

  
  /**
   * {}
   **/
  public Date getEngagedenddate() {
    return engagedenddate;
  }
  public void setEngagedenddate(Date engagedenddate) {
    this.engagedenddate = engagedenddate;
  }

  
  /**
   * {}
   **/
  public Float getHeadcount() {
    return headcount;
  }
  public void setHeadcount(Float headcount) {
    this.headcount = headcount;
  }

  
  /**
   * {}
   **/
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {}
   **/
  public String getUpdateduser() {
    return updateduser;
  }
  public void setUpdateduser(String updateduser) {
    this.updateduser = updateduser;
  }

  
  /**
   * {}
   **/
  public Date getUpdatedtimestamp() {
    return updatedtimestamp;
  }
  public void setUpdatedtimestamp(Date updatedtimestamp) {
    this.updatedtimestamp = updatedtimestamp;
  }

  
  /**
   * {}
   **/
  public Date getInserttimestamp() {
    return inserttimestamp;
  }
  public void setInserttimestamp(Date inserttimestamp) {
    this.inserttimestamp = inserttimestamp;
  }

  
  /**
   * {}
   **/
  public String getPrevrecno() {
    return prevrecno;
  }
  public void setPrevrecno(String prevrecno) {
    this.prevrecno = prevrecno;
  }

  
  /**
   * {}
   **/
  public Integer getCapabilitycenterid() {
    return capabilitycenterid;
  }
  public void setCapabilitycenterid(Integer capabilitycenterid) {
    this.capabilitycenterid = capabilitycenterid;
  }

  
  /**
   * {}
   **/
  public Integer getAssignmentstatusid() {
    return assignmentstatusid;
  }
  public void setAssignmentstatusid(Integer assignmentstatusid) {
    this.assignmentstatusid = assignmentstatusid;
  }

  
  /**
   * {}
   **/
  public Integer getReportingmanageradminid() {
    return reportingmanageradminid;
  }
  public void setReportingmanageradminid(Integer reportingmanageradminid) {
    this.reportingmanageradminid = reportingmanageradminid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltiResourcetransfers altiResourcetransfers = (AltiResourcetransfers) o;
    return Objects.equals(recno, altiResourcetransfers.recno) &&
        Objects.equals(employeeid, altiResourcetransfers.employeeid) &&
        Objects.equals(employeename, altiResourcetransfers.employeename) &&
        Objects.equals(accountid, altiResourcetransfers.accountid) &&
        Objects.equals(project, altiResourcetransfers.project) &&
        Objects.equals(targetplacement, altiResourcetransfers.targetplacement) &&
        Objects.equals(basecategoryid, altiResourcetransfers.basecategoryid) &&
        Objects.equals(locationid, altiResourcetransfers.locationid) &&
        Objects.equals(benchdate, altiResourcetransfers.benchdate) &&
        Objects.equals(assignmentstartdate, altiResourcetransfers.assignmentstartdate) &&
        Objects.equals(assignmentenddate, altiResourcetransfers.assignmentenddate) &&
        Objects.equals(remarks, altiResourcetransfers.remarks) &&
        Objects.equals(engagedin, altiResourcetransfers.engagedin) &&
        Objects.equals(engagedstartdate, altiResourcetransfers.engagedstartdate) &&
        Objects.equals(engagedenddate, altiResourcetransfers.engagedenddate) &&
        Objects.equals(headcount, altiResourcetransfers.headcount) &&
        Objects.equals(status, altiResourcetransfers.status) &&
        Objects.equals(updateduser, altiResourcetransfers.updateduser) &&
        Objects.equals(updatedtimestamp, altiResourcetransfers.updatedtimestamp) &&
        Objects.equals(inserttimestamp, altiResourcetransfers.inserttimestamp) &&
        Objects.equals(prevrecno, altiResourcetransfers.prevrecno) &&
        Objects.equals(capabilitycenterid, altiResourcetransfers.capabilitycenterid) &&
        Objects.equals(assignmentstatusid, altiResourcetransfers.assignmentstatusid) &&
        Objects.equals(reportingmanageradminid, altiResourcetransfers.reportingmanageradminid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recno, employeeid, employeename, accountid, project, targetplacement, basecategoryid, locationid, benchdate, assignmentstartdate, assignmentenddate, remarks, engagedin, engagedstartdate, engagedenddate, headcount, status, updateduser, updatedtimestamp, inserttimestamp, prevrecno, capabilitycenterid, assignmentstatusid, reportingmanageradminid);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiResourcetransfers {\n");
    
    sb.append("  recno: ").append(recno).append("\n");
    sb.append("  employeeid: ").append(employeeid).append("\n");
    sb.append("  employeename: ").append(employeename).append("\n");
    sb.append("  accountid: ").append(accountid).append("\n");
    sb.append("  project: ").append(project).append("\n");
    sb.append("  targetplacement: ").append(targetplacement).append("\n");
    sb.append("  basecategoryid: ").append(basecategoryid).append("\n");
    sb.append("  locationid: ").append(locationid).append("\n");
    sb.append("  benchdate: ").append(benchdate).append("\n");
    sb.append("  assignmentstartdate: ").append(assignmentstartdate).append("\n");
    sb.append("  assignmentenddate: ").append(assignmentenddate).append("\n");
    sb.append("  remarks: ").append(remarks).append("\n");
    sb.append("  engagedin: ").append(engagedin).append("\n");
    sb.append("  engagedstartdate: ").append(engagedstartdate).append("\n");
    sb.append("  engagedenddate: ").append(engagedenddate).append("\n");
    sb.append("  headcount: ").append(headcount).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  updateduser: ").append(updateduser).append("\n");
    sb.append("  updatedtimestamp: ").append(updatedtimestamp).append("\n");
    sb.append("  inserttimestamp: ").append(inserttimestamp).append("\n");
    sb.append("  prevrecno: ").append(prevrecno).append("\n");
    sb.append("  capabilitycenterid: ").append(capabilitycenterid).append("\n");
    sb.append("  assignmentstatusid: ").append(assignmentstatusid).append("\n");
    sb.append("  reportingmanageradminid: ").append(reportingmanageradminid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

