package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_SESSION_TEMP_TABLESPACES", schema = "information_schema", catalog = "")
public class InnodbSessionTempTablespacesEntity {

  @Basic
  @Column(name = "ID")
  private Object id;
  @Basic
  @Column(name = "SPACE")
  private Object space;
  @Basic
  @Column(name = "PATH")
  private String path;
  @Basic
  @Column(name = "SIZE")
  private Object size;
  @Basic
  @Column(name = "STATE")
  private String state;
  @Basic
  @Column(name = "PURPOSE")
  private String purpose;

  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public Object getSpace() {
    return space;
  }

  public void setSpace(Object space) {
    this.space = space;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Object getSize() {
    return size;
  }

  public void setSize(Object size) {
    this.size = size;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbSessionTempTablespacesEntity that = (InnodbSessionTempTablespacesEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(space, that.space)
        && Objects.equals(path, that.path) && Objects.equals(size, that.size)
        && Objects.equals(state, that.state) && Objects.equals(purpose,
        that.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, space, path, size, state, purpose);
  }
}
