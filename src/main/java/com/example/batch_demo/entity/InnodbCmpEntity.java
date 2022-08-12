package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CMP", schema = "information_schema", catalog = "")
public class InnodbCmpEntity {

  @Basic
  @Column(name = "page_size")
  private int pageSize;
  @Basic
  @Column(name = "compress_ops")
  private int compressOps;
  @Basic
  @Column(name = "compress_ops_ok")
  private int compressOpsOk;
  @Basic
  @Column(name = "compress_time")
  private int compressTime;
  @Basic
  @Column(name = "uncompress_ops")
  private int uncompressOps;
  @Basic
  @Column(name = "uncompress_time")
  private int uncompressTime;

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCompressOps() {
    return compressOps;
  }

  public void setCompressOps(int compressOps) {
    this.compressOps = compressOps;
  }

  public int getCompressOpsOk() {
    return compressOpsOk;
  }

  public void setCompressOpsOk(int compressOpsOk) {
    this.compressOpsOk = compressOpsOk;
  }

  public int getCompressTime() {
    return compressTime;
  }

  public void setCompressTime(int compressTime) {
    this.compressTime = compressTime;
  }

  public int getUncompressOps() {
    return uncompressOps;
  }

  public void setUncompressOps(int uncompressOps) {
    this.uncompressOps = uncompressOps;
  }

  public int getUncompressTime() {
    return uncompressTime;
  }

  public void setUncompressTime(int uncompressTime) {
    this.uncompressTime = uncompressTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbCmpEntity that = (InnodbCmpEntity) o;
    return pageSize == that.pageSize && compressOps == that.compressOps
        && compressOpsOk == that.compressOpsOk && compressTime == that.compressTime
        && uncompressOps == that.uncompressOps && uncompressTime == that.uncompressTime;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, compressOps, compressOpsOk, compressTime, uncompressOps,
        uncompressTime);
  }
}
