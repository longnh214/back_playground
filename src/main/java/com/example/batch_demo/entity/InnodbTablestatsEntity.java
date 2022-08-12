package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLESTATS", schema = "information_schema", catalog = "")
public class InnodbTablestatsEntity {

  @Basic
  @Column(name = "TABLE_ID")
  private Object tableId;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "STATS_INITIALIZED")
  private String statsInitialized;
  @Basic
  @Column(name = "NUM_ROWS")
  private Object numRows;
  @Basic
  @Column(name = "CLUST_INDEX_SIZE")
  private Object clustIndexSize;
  @Basic
  @Column(name = "OTHER_INDEX_SIZE")
  private Object otherIndexSize;
  @Basic
  @Column(name = "MODIFIED_COUNTER")
  private Object modifiedCounter;
  @Basic
  @Column(name = "AUTOINC")
  private Object autoinc;
  @Basic
  @Column(name = "REF_COUNT")
  private int refCount;

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

  public String getStatsInitialized() {
    return statsInitialized;
  }

  public void setStatsInitialized(String statsInitialized) {
    this.statsInitialized = statsInitialized;
  }

  public Object getNumRows() {
    return numRows;
  }

  public void setNumRows(Object numRows) {
    this.numRows = numRows;
  }

  public Object getClustIndexSize() {
    return clustIndexSize;
  }

  public void setClustIndexSize(Object clustIndexSize) {
    this.clustIndexSize = clustIndexSize;
  }

  public Object getOtherIndexSize() {
    return otherIndexSize;
  }

  public void setOtherIndexSize(Object otherIndexSize) {
    this.otherIndexSize = otherIndexSize;
  }

  public Object getModifiedCounter() {
    return modifiedCounter;
  }

  public void setModifiedCounter(Object modifiedCounter) {
    this.modifiedCounter = modifiedCounter;
  }

  public Object getAutoinc() {
    return autoinc;
  }

  public void setAutoinc(Object autoinc) {
    this.autoinc = autoinc;
  }

  public int getRefCount() {
    return refCount;
  }

  public void setRefCount(int refCount) {
    this.refCount = refCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbTablestatsEntity that = (InnodbTablestatsEntity) o;
    return refCount == that.refCount && Objects.equals(tableId, that.tableId)
        && Objects.equals(name, that.name) && Objects.equals(statsInitialized,
        that.statsInitialized) && Objects.equals(numRows, that.numRows)
        && Objects.equals(clustIndexSize, that.clustIndexSize) && Objects.equals(
        otherIndexSize, that.otherIndexSize) && Objects.equals(modifiedCounter,
        that.modifiedCounter) && Objects.equals(autoinc, that.autoinc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, name, statsInitialized, numRows, clustIndexSize, otherIndexSize,
        modifiedCounter, autoinc, refCount);
  }
}
