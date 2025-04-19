package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FOREIGN", schema = "information_schema", catalog = "")
public class InnodbForeignEntity {

  @Basic
  @Column(name = "ID")
  private String id;
  @Basic
  @Column(name = "FOR_NAME")
  private String forName;
  @Basic
  @Column(name = "REF_NAME")
  private String refName;
  @Basic
  @Column(name = "N_COLS")
  private long nCols;
  @Basic
  @Column(name = "TYPE")
  private Object type;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getForName() {
    return forName;
  }

  public void setForName(String forName) {
    this.forName = forName;
  }

  public String getRefName() {
    return refName;
  }

  public void setRefName(String refName) {
    this.refName = refName;
  }

  public long getnCols() {
    return nCols;
  }

  public void setnCols(long nCols) {
    this.nCols = nCols;
  }

  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbForeignEntity that = (InnodbForeignEntity) o;
    return nCols == that.nCols && Objects.equals(id, that.id) && Objects.equals(
        forName, that.forName) && Objects.equals(refName, that.refName)
        && Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, forName, refName, nCols, type);
  }
}
