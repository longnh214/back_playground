package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE_TABLE_GRANTS", schema = "information_schema", catalog = "")
public class RoleTableGrantsEntity {

  @Basic
  @Column(name = "GRANTOR")
  private String grantor;
  @Basic
  @Column(name = "GRANTOR_HOST")
  private String grantorHost;
  @Basic
  @Column(name = "GRANTEE")
  private String grantee;
  @Basic
  @Column(name = "GRANTEE_HOST")
  private String granteeHost;
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
  private Object privilegeType;
  @Basic
  @Column(name = "IS_GRANTABLE")
  private String isGrantable;

  public String getGrantor() {
    return grantor;
  }

  public void setGrantor(String grantor) {
    this.grantor = grantor;
  }

  public String getGrantorHost() {
    return grantorHost;
  }

  public void setGrantorHost(String grantorHost) {
    this.grantorHost = grantorHost;
  }

  public String getGrantee() {
    return grantee;
  }

  public void setGrantee(String grantee) {
    this.grantee = grantee;
  }

  public String getGranteeHost() {
    return granteeHost;
  }

  public void setGranteeHost(String granteeHost) {
    this.granteeHost = granteeHost;
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

  public Object getPrivilegeType() {
    return privilegeType;
  }

  public void setPrivilegeType(Object privilegeType) {
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
    RoleTableGrantsEntity that = (RoleTableGrantsEntity) o;
    return Objects.equals(grantor, that.grantor) && Objects.equals(grantorHost,
        that.grantorHost) && Objects.equals(grantee, that.grantee)
        && Objects.equals(granteeHost, that.granteeHost) && Objects.equals(
        tableCatalog, that.tableCatalog) && Objects.equals(tableSchema, that.tableSchema)
        && Objects.equals(tableName, that.tableName) && Objects.equals(
        privilegeType, that.privilegeType) && Objects.equals(isGrantable, that.isGrantable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantor, grantorHost, grantee, granteeHost, tableCatalog, tableSchema,
        tableName, privilegeType, isGrantable);
  }
}
