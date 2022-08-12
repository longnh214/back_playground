package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ENABLED_ROLES", schema = "information_schema", catalog = "")
public class EnabledRolesEntity {

  @Basic
  @Column(name = "ROLE_NAME")
  private String roleName;
  @Basic
  @Column(name = "ROLE_HOST")
  private String roleHost;
  @Basic
  @Column(name = "IS_DEFAULT")
  private String isDefault;
  @Basic
  @Column(name = "IS_MANDATORY")
  private String isMandatory;

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
    EnabledRolesEntity that = (EnabledRolesEntity) o;
    return Objects.equals(roleName, that.roleName) && Objects.equals(roleHost,
        that.roleHost) && Objects.equals(isDefault, that.isDefault)
        && Objects.equals(isMandatory, that.isMandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, roleHost, isDefault, isMandatory);
  }
}
