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

public class Basecategory  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String name = null;
  
   
   
  
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
    Basecategory basecategory = (Basecategory) o;
    return Objects.equals(id, basecategory.id) &&
        Objects.equals(name, basecategory.name) &&
        Objects.equals(updateduser, basecategory.updateduser) &&
        Objects.equals(updatedtimestamp, basecategory.updatedtimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, updateduser, updatedtimestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Basecategory {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  updateduser: ").append(updateduser).append("\n");
    sb.append("  updatedtimestamp: ").append(updatedtimestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

