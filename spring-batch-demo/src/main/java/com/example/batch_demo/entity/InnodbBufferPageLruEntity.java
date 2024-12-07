package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_BUFFER_PAGE_LRU", schema = "information_schema", catalog = "")
public class InnodbBufferPageLruEntity {

  @Basic
  @Column(name = "POOL_ID")
  private Object poolId;
  @Basic
  @Column(name = "LRU_POSITION")
  private Object lruPosition;
  @Basic
  @Column(name = "SPACE")
  private Object space;
  @Basic
  @Column(name = "PAGE_NUMBER")
  private Object pageNumber;
  @Basic
  @Column(name = "PAGE_TYPE")
  private String pageType;
  @Basic
  @Column(name = "FLUSH_TYPE")
  private Object flushType;
  @Basic
  @Column(name = "FIX_COUNT")
  private Object fixCount;
  @Basic
  @Column(name = "IS_HASHED")
  private String isHashed;
  @Basic
  @Column(name = "NEWEST_MODIFICATION")
  private Object newestModification;
  @Basic
  @Column(name = "OLDEST_MODIFICATION")
  private Object oldestModification;
  @Basic
  @Column(name = "ACCESS_TIME")
  private Object accessTime;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "INDEX_NAME")
  private String indexName;
  @Basic
  @Column(name = "NUMBER_RECORDS")
  private Object numberRecords;
  @Basic
  @Column(name = "DATA_SIZE")
  private Object dataSize;
  @Basic
  @Column(name = "COMPRESSED_SIZE")
  private Object compressedSize;
  @Basic
  @Column(name = "COMPRESSED")
  private String compressed;
  @Basic
  @Column(name = "IO_FIX")
  private String ioFix;
  @Basic
  @Column(name = "IS_OLD")
  private String isOld;
  @Basic
  @Column(name = "FREE_PAGE_CLOCK")
  private Object freePageClock;

  public Object getPoolId() {
    return poolId;
  }

  public void setPoolId(Object poolId) {
    this.poolId = poolId;
  }

  public Object getLruPosition() {
    return lruPosition;
  }

  public void setLruPosition(Object lruPosition) {
    this.lruPosition = lruPosition;
  }

  public Object getSpace() {
    return space;
  }

  public void setSpace(Object space) {
    this.space = space;
  }

  public Object getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Object pageNumber) {
    this.pageNumber = pageNumber;
  }

  public String getPageType() {
    return pageType;
  }

  public void setPageType(String pageType) {
    this.pageType = pageType;
  }

  public Object getFlushType() {
    return flushType;
  }

  public void setFlushType(Object flushType) {
    this.flushType = flushType;
  }

  public Object getFixCount() {
    return fixCount;
  }

  public void setFixCount(Object fixCount) {
    this.fixCount = fixCount;
  }

  public String getIsHashed() {
    return isHashed;
  }

  public void setIsHashed(String isHashed) {
    this.isHashed = isHashed;
  }

  public Object getNewestModification() {
    return newestModification;
  }

  public void setNewestModification(Object newestModification) {
    this.newestModification = newestModification;
  }

  public Object getOldestModification() {
    return oldestModification;
  }

  public void setOldestModification(Object oldestModification) {
    this.oldestModification = oldestModification;
  }

  public Object getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(Object accessTime) {
    this.accessTime = accessTime;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public Object getNumberRecords() {
    return numberRecords;
  }

  public void setNumberRecords(Object numberRecords) {
    this.numberRecords = numberRecords;
  }

  public Object getDataSize() {
    return dataSize;
  }

  public void setDataSize(Object dataSize) {
    this.dataSize = dataSize;
  }

  public Object getCompressedSize() {
    return compressedSize;
  }

  public void setCompressedSize(Object compressedSize) {
    this.compressedSize = compressedSize;
  }

  public String getCompressed() {
    return compressed;
  }

  public void setCompressed(String compressed) {
    this.compressed = compressed;
  }

  public String getIoFix() {
    return ioFix;
  }

  public void setIoFix(String ioFix) {
    this.ioFix = ioFix;
  }

  public String getIsOld() {
    return isOld;
  }

  public void setIsOld(String isOld) {
    this.isOld = isOld;
  }

  public Object getFreePageClock() {
    return freePageClock;
  }

  public void setFreePageClock(Object freePageClock) {
    this.freePageClock = freePageClock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbBufferPageLruEntity that = (InnodbBufferPageLruEntity) o;
    return Objects.equals(poolId, that.poolId) && Objects.equals(lruPosition,
        that.lruPosition) && Objects.equals(space, that.space) && Objects.equals(
        pageNumber, that.pageNumber) && Objects.equals(pageType, that.pageType)
        && Objects.equals(flushType, that.flushType) && Objects.equals(fixCount,
        that.fixCount) && Objects.equals(isHashed, that.isHashed)
        && Objects.equals(newestModification, that.newestModification)
        && Objects.equals(oldestModification, that.oldestModification)
        && Objects.equals(accessTime, that.accessTime) && Objects.equals(
        tableName, that.tableName) && Objects.equals(indexName, that.indexName)
        && Objects.equals(numberRecords, that.numberRecords) && Objects.equals(
        dataSize, that.dataSize) && Objects.equals(compressedSize, that.compressedSize)
        && Objects.equals(compressed, that.compressed) && Objects.equals(ioFix,
        that.ioFix) && Objects.equals(isOld, that.isOld) && Objects.equals(
        freePageClock, that.freePageClock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, lruPosition, space, pageNumber, pageType, flushType, fixCount,
        isHashed, newestModification, oldestModification, accessTime, tableName, indexName,
        numberRecords, dataSize, compressedSize, compressed, ioFix, isOld, freePageClock);
  }
}
