package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_INDEXES", schema = "information_schema", catalog = "")
public class InnodbIndexesEntity {

  @Basic
  @Column(name = "INDEX_ID")
  private Object indexId;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "TABLE_ID")
  private Object tableId;
  @Basic
  @Column(name = "TYPE")
  private int type;
  @Basic
  @Column(name = "N_FIELDS")
  private int nFields;
  @Basic
  @Column(name = "PAGE_NO")
  private int pageNo;
  @Basic
  @Column(name = "SPACE")
  private int space;
  @Basic
  @Column(name = "MERGE_THRESHOLD")
  private int mergeThreshold;

  public Object getIndexId() {
    return indexId;
  }

  public void setIndexId(Object indexId) {
    this.indexId = indexId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getTableId() {
    return tableId;
  }

  public void setTableId(Object tableId) {
    this.tableId = tableId;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getnFields() {
    return nFields;
  }

  public void setnFields(int nFields) {
    this.nFields = nFields;
  }

  public int getPageNo() {
    return pageNo;
  }

  public void setPageNo(int pageNo) {
    this.pageNo = pageNo;
  }

  public int getSpace() {
    return space;
  }

  public void setSpace(int space) {
    this.space = space;
  }

  public int getMergeThreshold() {
    return mergeThreshold;
  }

  public void setMergeThreshold(int mergeThreshold) {
    this.mergeThreshold = mergeThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbIndexesEntity that = (InnodbIndexesEntity) o;
    return type == that.type && nFields == that.nFields && pageNo == that.pageNo
        && space == that.space && mergeThreshold == that.mergeThreshold && Objects.equals(
        indexId, that.indexId) && Objects.equals(name, that.name)
        && Objects.equals(tableId, that.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexId, name, tableId, type, nFields, pageNo, space, mergeThreshold);
  }
}
