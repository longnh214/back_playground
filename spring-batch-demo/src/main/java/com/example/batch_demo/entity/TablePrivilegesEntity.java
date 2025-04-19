package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_PRIVILEGES", schema = "information_schema", catalog = "")
public class TablePrivilegesEntity {

  @Basic
  @Column(name = "GRANTEE")
  private String grantee;
  @Basic
  @Column(name = "TABLE_CATALOG")
  private String tableCatalog;
  @Basic
  @Column(name = "TABLE_SCHEMA")
  private String tableSchema;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "PRIVILEGE_TYPE")
  private String privilegeType;
  @Basic
  @Column(name = "IS_GRANTABLE")
  private String isGrantable;

  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  public String getTableCatalog() {
    return tableCatalog;
  }

  public void setTableCatalog(String tableCatalog) {
    this.tableCatalog = tableCatalog;
  }

  public String getTableSchema() {
    return tableSchema;
  }

  public void setTableSchema(String tableSchema) {
    this.tableSchema = tableSchema;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getPrivilegeType() {
    return privilegeType;
  }

  public void setPrivilegeType(String privilegeType) {
    this.privilegeType = privilegeType;
  }

  public String getIsGrantable() {
    return isGrantable;
  }

  public void setIsGrantable(String isGrantable) {
    this.isGrantable = isGrantable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TablePrivilegesEntity that = (TablePrivilegesEntity) o;
    return Objects.equals(grantee, that.grantee) && Objects.equals(tableCatalog,
        that.tableCatalog) && Objects.equals(tableSchema, that.tableSchema)
        && Objects.equals(tableName, that.tableName) && Objects.equals(
        privilegeType, that.privilegeType) && Objects.equals(isGrantable, that.isGrantable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantee, tableCatalog, tableSchema, tableName, privilegeType, isGrantable);
  }
}
