package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_COLUMNS", schema = "information_schema", catalog = "")
public class InnodbColumnsEntity {

  @Basic
  @Column(name = "TABLE_ID")
  private Object tableId;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "POS")
  private Object pos;
  @Basic
  @Column(name = "MTYPE")
  private int mtype;
  @Basic
  @Column(name = "PRTYPE")
  private int prtype;
  @Basic
  @Column(name = "LEN")
  private int len;
  @Basic
  @Column(name = "HAS_DEFAULT")
  private int hasDefault;
  @Basic
  @Column(name = "DEFAULT_VALUE")
  private String defaultValue;

  public Object getTableId() {
    return tableId;
  }

  public void setTableId(Object tableId) {
    this.tableId = tableId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getPos() {
    return pos;
  }

  public void setPos(Object pos) {
    this.pos = pos;
  }

  public int getMtype() {
    return mtype;
  }

  public void setMtype(int mtype) {
    this.mtype = mtype;
  }

  public int getPrtype() {
    return prtype;
  }

  public void setPrtype(int prtype) {
    this.prtype = prtype;
  }

  public int getLen() {
    return len;
  }

  public void setLen(int len) {
    this.len = len;
  }

  public int getHasDefault() {
    return hasDefault;
  }

  public void setHasDefault(int hasDefault) {
    this.hasDefault = hasDefault;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbColumnsEntity that = (InnodbColumnsEntity) o;
    return mtype == that.mtype && prtype == that.prtype && len == that.len
        && hasDefault == that.hasDefault && Objects.equals(tableId, that.tableId)
        && Objects.equals(name, that.name) && Objects.equals(pos, that.pos)
        && Objects.equals(defaultValue, that.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, name, pos, mtype, prtype, len, hasDefault, defaultValue);
  }
}
