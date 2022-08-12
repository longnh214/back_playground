package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PRIVILEGES", schema = "information_schema", catalog = "")
public class UserPrivilegesEntity {

  @Basic
  @Column(name = "GRANTEE")
  private String grantee;
  @Basic
  @Column(name = "TABLE_CATALOG")
  private String tableCatalog;
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
    UserPrivilegesEntity that = (UserPrivilegesEntity) o;
    return Objects.equals(grantee, that.grantee) && Objects.equals(tableCatalog,
        that.tableCatalog) && Objects.equals(privilegeType, that.privilegeType)
        && Objects.equals(isGrantable, that.isGrantable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantee, tableCatalog, privilegeType, isGrantable);
  }
}
