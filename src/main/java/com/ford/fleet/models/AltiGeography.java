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

public class AltiGeography  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String geography = null;
  
   
   
  
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
  public String getGeography() {
    return geography;
  }
  public void setGeography(String geography) {
    this.geography = geography;
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
    AltiGeography altiGeography = (AltiGeography) o;
    return Objects.equals(id, altiGeography.id) &&
        Objects.equals(geography, altiGeography.geography) &&
        Objects.equals(updateduser, altiGeography.updateduser) &&
        Objects.equals(updatedtimestamp, altiGeography.updatedtimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, geography, updateduser, updatedtimestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiGeography {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  geography: ").append(geography).append("\n");
    sb.append("  updateduser: ").append(updateduser).append("\n");
    sb.append("  updatedtimestamp: ").append(updatedtimestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

