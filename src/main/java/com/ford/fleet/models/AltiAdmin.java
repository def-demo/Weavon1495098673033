package com.ford.fleet.models;


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

public class AltiAdmin  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String key = null;
  
   
   
  
  private String value = null;

  
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
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * {}
   **/
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltiAdmin altiAdmin = (AltiAdmin) o;
    return Objects.equals(id, altiAdmin.id) &&
        Objects.equals(key, altiAdmin.key) &&
        Objects.equals(value, altiAdmin.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiAdmin {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

