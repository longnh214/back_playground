package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CMPMEM", schema = "information_schema", catalog = "")
public class InnodbCmpmemEntity {

  @Basic
  @Column(name = "page_size")
  private int pageSize;
  @Basic
  @Column(name = "buffer_pool_instance")
  private int bufferPoolInstance;
  @Basic
  @Column(name = "pages_used")
  private int pagesUsed;
  @Basic
  @Column(name = "pages_free")
  private int pagesFree;
  @Basic
  @Column(name = "relocation_ops")
  private long relocationOps;
  @Basic
  @Column(name = "relocation_time")
  private int relocationTime;

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getBufferPoolInstance() {
    return bufferPoolInstance;
  }

  public void setBufferPoolInstance(int bufferPoolInstance) {
    this.bufferPoolInstance = bufferPoolInstance;
  }

  public int getPagesUsed() {
    return pagesUsed;
  }

  public void setPagesUsed(int pagesUsed) {
    this.pagesUsed = pagesUsed;
  }

  public int getPagesFree() {
    return pagesFree;
  }

  public void setPagesFree(int pagesFree) {
    this.pagesFree = pagesFree;
  }

  public long getRelocationOps() {
    return relocationOps;
  }

  public void setRelocationOps(long relocationOps) {
    this.relocationOps = relocationOps;
  }

  public int getRelocationTime() {
    return relocationTime;
  }

  public void setRelocationTime(int relocationTime) {
    this.relocationTime = relocationTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbCmpmemEntity that = (InnodbCmpmemEntity) o;
    return pageSize == that.pageSize && bufferPoolInstance == that.bufferPoolInstance
        && pagesUsed == that.pagesUsed && pagesFree == that.pagesFree
        && relocationOps == that.relocationOps && relocationTime == that.relocationTime;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, bufferPoolInstance, pagesUsed, pagesFree, relocationOps,
        relocationTime);
  }
}
