package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE_ROUTINE_GRANTS", schema = "information_schema", catalog = "")
public class RoleRoutineGrantsEntity {

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
  @Column(name = "SPECIFIC_CATALOG")
  private String specificCatalog;
  @Basic
  @Column(name = "SPECIFIC_SCHEMA")
  private String specificSchema;
  @Basic
  @Column(name = "SPECIFIC_NAME")
  private String specificName;
  @Basic
  @Column(name = "ROUTINE_CATALOG")
  private String routineCatalog;
  @Basic
  @Column(name = "ROUTINE_SCHEMA")
  private String routineSchema;
  @Basic
  @Column(name = "ROUTINE_NAME")
  private String routineName;
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

  public String getSpecificCatalog() {
    return specificCatalog;
  }

  public void setSpecificCatalog(String specificCatalog) {
    this.specificCatalog = specificCatalog;
  }

  public String getSpecificSchema() {
    return specificSchema;
  }

  public void setSpecificSchema(String specificSchema) {
    this.specificSchema = specificSchema;
  }

  public String getSpecificName() {
    return specificName;
  }

  public void setSpecificName(String specificName) {
    this.specificName = specificName;
  }

  public String getRoutineCatalog() {
    return routineCatalog;
  }

  public void setRoutineCatalog(String routineCatalog) {
    this.routineCatalog = routineCatalog;
  }

  public String getRoutineSchema() {
    return routineSchema;
  }

  public void setRoutineSchema(String routineSchema) {
    this.routineSchema = routineSchema;
  }

  public String getRoutineName() {
    return routineName;
  }

  public void setRoutineName(String routineName) {
    this.routineName = routineName;
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
    RoleRoutineGrantsEntity that = (RoleRoutineGrantsEntity) o;
    return Objects.equals(grantor, that.grantor) && Objects.equals(grantorHost,
        that.grantorHost) && Objects.equals(grantee, that.grantee)
        && Objects.equals(granteeHost, that.granteeHost) && Objects.equals(
        specificCatalog, that.specificCatalog) && Objects.equals(specificSchema,
        that.specificSchema) && Objects.equals(specificName, that.specificName)
        && Objects.equals(routineCatalog, that.routineCatalog) && Objects.equals(
        routineSchema, that.routineSchema) && Objects.equals(routineName, that.routineName)
        && Objects.equals(privilegeType, that.privilegeType) && Objects.equals(
        isGrantable, that.isGrantable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantor, grantorHost, grantee, granteeHost, specificCatalog, specificSchema,
        specificName, routineCatalog, routineSchema, routineName, privilegeType, isGrantable);
  }
}
