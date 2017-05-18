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

public class Members  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String username = null;
  
   
   
  
  private String role = null;

  
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
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * {}
   **/
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Members members = (Members) o;
    return Objects.equals(id, members.id) &&
        Objects.equals(username, members.username) &&
        Objects.equals(role, members.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, role);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Members {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

