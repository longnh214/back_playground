package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ATTRIBUTES", schema = "information_schema", catalog = "")
public class UserAttributesEntity {

  @Basic
  @Column(name = "USER")
  private String user;
  @Basic
  @Column(name = "HOST")
  private String host;
  @Basic
  @Column(name = "ATTRIBUTE")
  private String attribute;

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

  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAttributesEntity that = (UserAttributesEntity) o;
    return Objects.equals(user, that.user) && Objects.equals(host, that.host)
        && Objects.equals(attribute, that.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, host, attribute);
  }
}
