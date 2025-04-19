package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FIELDS", schema = "information_schema", catalog = "")
public class InnodbFieldsEntity {

  @Basic
  @Column(name = "INDEX_ID")
  private byte[] indexId;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "POS")
  private Object pos;

  public byte[] getIndexId() {
    return indexId;
  }

  public void setIndexId(byte[] indexId) {
    this.indexId = indexId;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbFieldsEntity that = (InnodbFieldsEntity) o;
    return Arrays.equals(indexId, that.indexId) && Objects.equals(name, that.name)
        && Objects.equals(pos, that.pos);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(name, pos);
    result = 31 * result + Arrays.hashCode(indexId);
    return result;
  }
}
