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

public class AltiAccounts  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer geographyid = null;
  
   
   
  
  private String accountname = null;
  
   
   
  
  private String updateduser = null;
  
   
   
  
  private Date updatedtimestamp = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public Integer getGeographyid() {
    return geographyid;
  }
  public void setGeographyid(Integer geographyid) {
    this.geographyid = geographyid;
  }

  
  /**
   * {}
   **/
  public String getAccountname() {
    return accountname;
  }
  public void setAccountname(String accountname) {
    this.accountname = accountname;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltiAccounts altiAccounts = (AltiAccounts) o;
    return Objects.equals(id, altiAccounts.id) &&
        Objects.equals(geographyid, altiAccounts.geographyid) &&
        Objects.equals(accountname, altiAccounts.accountname) &&
        Objects.equals(updateduser, altiAccounts.updateduser) &&
        Objects.equals(updatedtimestamp, altiAccounts.updatedtimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, geographyid, accountname, updateduser, updatedtimestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiAccounts {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  geographyid: ").append(geographyid).append("\n");
    sb.append("  accountname: ").append(accountname).append("\n");
    sb.append("  updateduser: ").append(updateduser).append("\n");
    sb.append("  updatedtimestamp: ").append(updatedtimestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

