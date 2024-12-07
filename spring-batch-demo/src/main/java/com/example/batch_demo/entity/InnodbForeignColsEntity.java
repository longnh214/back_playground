package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FOREIGN_COLS", schema = "information_schema", catalog = "")
public class InnodbForeignColsEntity {

  @Basic
  @Column(name = "ID")
  private String id;
  @Basic
  @Column(name = "FOR_COL_NAME")
  private String forColName;
  @Basic
  @Column(name = "REF_COL_NAME")
  private String refColName;
  @Basic
  @Column(name = "POS")
  private Object pos;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getForColName() {
    return forColName;
  }

  public void setForColName(String forColName) {
    this.forColName = forColName;
  }

  public String getRefColName() {
    return refColName;
  }

  public void setRefColName(String refColName) {
    this.refColName = refColName;
  }

  public Object getPos() {
    return pos;
  }

  public void setPos(Object pos) {
    this.pos = pos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbForeignColsEntity that = (InnodbForeignColsEntity) o;
    return Objects.equals(id, that.id) && Objects.equals(forColName,
        that.forColName) && Objects.equals(refColName, that.refColName)
        && Objects.equals(pos, that.pos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, forColName, refColName, pos);
  }
}
