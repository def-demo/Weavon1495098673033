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

public class AltiResourceColumn  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String name = null;
  
   
   
  
  private Boolean required = null;
  
   
   
  
  private String type = null;
  
   
   
  
  private Integer columnorder = null;
  
   
   
  
  private Integer frontend = null;
  
   
   
  
  private Integer upload = null;
  
   
   
  
  private Integer download = null;
  
   
   
  
  private Integer uploaderr = null;
  
   
   
  
  private Integer validate = null;
  
   
   
  
  private String regex = null;

  
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
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   * {}
   **/
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * {}
   **/
  public Integer getColumnorder() {
    return columnorder;
  }
  public void setColumnorder(Integer columnorder) {
    this.columnorder = columnorder;
  }

  
  /**
   * {}
   **/
  public Integer getFrontend() {
    return frontend;
  }
  public void setFrontend(Integer frontend) {
    this.frontend = frontend;
  }

  
  /**
   * {}
   **/
  public Integer getUpload() {
    return upload;
  }
  public void setUpload(Integer upload) {
    this.upload = upload;
  }

  
  /**
   * {}
   **/
  public Integer getDownload() {
    return download;
  }
  public void setDownload(Integer download) {
    this.download = download;
  }

  
  /**
   * {}
   **/
  public Integer getUploaderr() {
    return uploaderr;
  }
  public void setUploaderr(Integer uploaderr) {
    this.uploaderr = uploaderr;
  }

  
  /**
   * {}
   **/
  public Integer getValidate() {
    return validate;
  }
  public void setValidate(Integer validate) {
    this.validate = validate;
  }

  
  /**
   * {}
   **/
  public String getRegex() {
    return regex;
  }
  public void setRegex(String regex) {
    this.regex = regex;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltiResourceColumn altiResourceColumn = (AltiResourceColumn) o;
    return Objects.equals(id, altiResourceColumn.id) &&
        Objects.equals(name, altiResourceColumn.name) &&
        Objects.equals(required, altiResourceColumn.required) &&
        Objects.equals(type, altiResourceColumn.type) &&
        Objects.equals(columnorder, altiResourceColumn.columnorder) &&
        Objects.equals(frontend, altiResourceColumn.frontend) &&
        Objects.equals(upload, altiResourceColumn.upload) &&
        Objects.equals(download, altiResourceColumn.download) &&
        Objects.equals(uploaderr, altiResourceColumn.uploaderr) &&
        Objects.equals(validate, altiResourceColumn.validate) &&
        Objects.equals(regex, altiResourceColumn.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, required, type, columnorder, frontend, upload, download, uploaderr, validate, regex);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltiResourceColumn {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  columnorder: ").append(columnorder).append("\n");
    sb.append("  frontend: ").append(frontend).append("\n");
    sb.append("  upload: ").append(upload).append("\n");
    sb.append("  download: ").append(download).append("\n");
    sb.append("  uploaderr: ").append(uploaderr).append("\n");
    sb.append("  validate: ").append(validate).append("\n");
    sb.append("  regex: ").append(regex).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

