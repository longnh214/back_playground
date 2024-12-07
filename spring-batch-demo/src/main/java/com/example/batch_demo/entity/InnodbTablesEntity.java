package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLES", schema = "information_schema", catalog = "")
public class InnodbTablesEntity {

  @Basic
  @Column(name = "TABLE_ID")
  private Object tableId;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "FLAG")
  private int flag;
  @Basic
  @Column(name = "N_COLS")
  private int nCols;
  @Basic
  @Column(name = "SPACE")
  private long space;
  @Basic
  @Column(name = "ROW_FORMAT")
  private String rowFormat;
  @Basic
  @Column(name = "ZIP_PAGE_SIZE")
  private Object zipPageSize;
  @Basic
  @Column(name = "SPACE_TYPE")
  private String spaceType;
  @Basic
  @Column(name = "INSTANT_COLS")
  private int instantCols;

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

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
  }

  public int getnCols() {
    return nCols;
  }

  public void setnCols(int nCols) {
    this.nCols = nCols;
  }

  public long getSpace() {
    return space;
  }

  public void setSpace(long space) {
    this.space = space;
  }

  public String getRowFormat() {
    return rowFormat;
  }

  public void setRowFormat(String rowFormat) {
    this.rowFormat = rowFormat;
  }

  public Object getZipPageSize() {
    return zipPageSize;
  }

  public void setZipPageSize(Object zipPageSize) {
    this.zipPageSize = zipPageSize;
  }

  public String getSpaceType() {
    return spaceType;
  }

  public void setSpaceType(String spaceType) {
    this.spaceType = spaceType;
  }

  public int getInstantCols() {
    return instantCols;
  }

  public void setInstantCols(int instantCols) {
    this.instantCols = instantCols;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbTablesEntity that = (InnodbTablesEntity) o;
    return flag == that.flag && nCols == that.nCols && space == that.space
        && instantCols == that.instantCols && Objects.equals(tableId, that.tableId)
        && Objects.equals(name, that.name) && Objects.equals(rowFormat,
        that.rowFormat) && Objects.equals(zipPageSize, that.zipPageSize)
        && Objects.equals(spaceType, that.spaceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, name, flag, nCols, space, rowFormat, zipPageSize, spaceType,
        instantCols);
  }
}
