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

public class AltiCountrylocation  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String country = null;
  
   
   
  
  private String location = null;
  
   
   
  
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
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * {}
   **/
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
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
    AltiCountrylocation altiCountrylocation = (AltiCountrylocation) o;
    return Objects.equals(id, altiCountrylocation.id) &&
        Objects.equals(country, altiCountrylocation.country) &&
        Objects.equals(location, altiCountrylocation.location) &&
        Objects.equals(updateduser, altiCountrylocation.updateduser) &&
        Objects.equals(updatedtimestamp, altiCountrylocation.updatedtimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, country, location, updateduser, updatedtimestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiCountrylocation {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  updateduser: ").append(updateduser).append("\n");
    sb.append("  updatedtimestamp: ").append(updatedtimestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

