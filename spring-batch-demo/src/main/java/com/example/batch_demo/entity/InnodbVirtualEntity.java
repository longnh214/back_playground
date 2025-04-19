package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_VIRTUAL", schema = "information_schema", catalog = "")
public class InnodbVirtualEntity {

  @Basic
  @Column(name = "TABLE_ID")
  private Object tableId;
  @Basic
  @Column(name = "POS")
  private Object pos;
  @Basic
  @Column(name = "BASE_POS")
  private Object basePos;

  public Object getTableId() {
    return tableId;
  }

  public void setTableId(Object tableId) {
    this.tableId = tableId;
  }

  public Object getPos() {
    return pos;
  }

  public void setPos(Object pos) {
    this.pos = pos;
  }

  public Object getBasePos() {
    return basePos;
  }

  public void setBasePos(Object basePos) {
    this.basePos = basePos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbVirtualEntity that = (InnodbVirtualEntity) o;
    return Objects.equals(tableId, that.tableId) && Objects.equals(pos, that.pos)
        && Objects.equals(basePos, that.basePos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, pos, basePos);
  }
}
