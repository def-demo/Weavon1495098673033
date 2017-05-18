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

public class AltiColumnAccess  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private Integer memberId = null;
  
   
   
  
  private Integer columnId = null;

  
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
  public Integer getMemberId() {
    return memberId;
  }
  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  
  /**
   * {}
   **/
  public Integer getColumnId() {
    return columnId;
  }
  public void setColumnId(Integer columnId) {
    this.columnId = columnId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltiColumnAccess altiColumnAccess = (AltiColumnAccess) o;
    return Objects.equals(id, altiColumnAccess.id) &&
        Objects.equals(memberId, altiColumnAccess.memberId) &&
        Objects.equals(columnId, altiColumnAccess.columnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, memberId, columnId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiColumnAccess {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  memberId: ").append(memberId).append("\n");
    sb.append("  columnId: ").append(columnId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

