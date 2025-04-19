package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICABLE_ROLES", schema = "information_schema", catalog = "")
public class ApplicableRolesEntity {

  @Basic
  @Column(name = "USER")
  private String user;
  @Basic
  @Column(name = "HOST")
  private String host;
  @Basic
  @Column(name = "GRANTEE")
  private String grantee;
  @Basic
  @Column(name = "GRANTEE_HOST")
  private String granteeHost;
  @Basic
  @Column(name = "ROLE_NAME")
  private String roleName;
  @Basic
  @Column(name = "ROLE_HOST")
  private String roleHost;
  @Basic
  @Column(name = "IS_GRANTABLE")
  private String isGrantable;
  @Basic
  @Column(name = "IS_DEFAULT")
  private String isDefault;
  @Basic
  @Column(name = "IS_MANDATORY")
  private String isMandatory;

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
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

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getRoleHost() {
    return roleHost;
  }

  public void setRoleHost(String roleHost) {
    this.roleHost = roleHost;
  }

  public String getIsGrantable() {
    return isGrantable;
  }

  public void setIsGrantable(String isGrantable) {
    this.isGrantable = isGrantable;
  }

  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  public String getIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(String isMandatory) {
    this.isMandatory = isMandatory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicableRolesEntity that = (ApplicableRolesEntity) o;
    return Objects.equals(user, that.user) && Objects.equals(host, that.host)
        && Objects.equals(grantee, that.grantee) && Objects.equals(granteeHost,
        that.granteeHost) && Objects.equals(roleName, that.roleName)
        && Objects.equals(roleHost, that.roleHost) && Objects.equals(isGrantable,
        that.isGrantable) && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(isMandatory, that.isMandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, host, grantee, granteeHost, roleName, roleHost, isGrantable,
        isDefault,
        isMandatory);
  }
}
