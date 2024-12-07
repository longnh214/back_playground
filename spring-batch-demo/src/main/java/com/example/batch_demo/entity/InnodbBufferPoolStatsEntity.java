package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_BUFFER_POOL_STATS", schema = "information_schema", catalog = "")
public class InnodbBufferPoolStatsEntity {

  @Basic
  @Column(name = "POOL_ID")
  private Object poolId;
  @Basic
  @Column(name = "POOL_SIZE")
  private Object poolSize;
  @Basic
  @Column(name = "FREE_BUFFERS")
  private Object freeBuffers;
  @Basic
  @Column(name = "DATABASE_PAGES")
  private Object databasePages;
  @Basic
  @Column(name = "OLD_DATABASE_PAGES")
  private Object oldDatabasePages;
  @Basic
  @Column(name = "MODIFIED_DATABASE_PAGES")
  private Object modifiedDatabasePages;
  @Basic
  @Column(name = "PENDING_DECOMPRESS")
  private Object pendingDecompress;
  @Basic
  @Column(name = "PENDING_READS")
  private Object pendingReads;
  @Basic
  @Column(name = "PENDING_FLUSH_LRU")
  private Object pendingFlushLru;
  @Basic
  @Column(name = "PENDING_FLUSH_LIST")
  private Object pendingFlushList;
  @Basic
  @Column(name = "PAGES_MADE_YOUNG")
  private Object pagesMadeYoung;
  @Basic
  @Column(name = "PAGES_NOT_MADE_YOUNG")
  private Object pagesNotMadeYoung;
  @Basic
  @Column(name = "PAGES_MADE_YOUNG_RATE")
  private double pagesMadeYoungRate;
  @Basic
  @Column(name = "PAGES_MADE_NOT_YOUNG_RATE")
  private double pagesMadeNotYoungRate;
  @Basic
  @Column(name = "NUMBER_PAGES_READ")
  private Object numberPagesRead;
  @Basic
  @Column(name = "NUMBER_PAGES_CREATED")
  private Object numberPagesCreated;
  @Basic
  @Column(name = "NUMBER_PAGES_WRITTEN")
  private Object numberPagesWritten;
  @Basic
  @Column(name = "PAGES_READ_RATE")
  private double pagesReadRate;
  @Basic
  @Column(name = "PAGES_CREATE_RATE")
  private double pagesCreateRate;
  @Basic
  @Column(name = "PAGES_WRITTEN_RATE")
  private double pagesWrittenRate;
  @Basic
  @Column(name = "NUMBER_PAGES_GET")
  private Object numberPagesGet;
  @Basic
  @Column(name = "HIT_RATE")
  private Object hitRate;
  @Basic
  @Column(name = "YOUNG_MAKE_PER_THOUSAND_GETS")
  private Object youngMakePerThousandGets;
  @Basic
  @Column(name = "NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
  private Object notYoungMakePerThousandGets;
  @Basic
  @Column(name = "NUMBER_PAGES_READ_AHEAD")
  private Object numberPagesReadAhead;
  @Basic
  @Column(name = "NUMBER_READ_AHEAD_EVICTED")
  private Object numberReadAheadEvicted;
  @Basic
  @Column(name = "READ_AHEAD_RATE")
  private double readAheadRate;
  @Basic
  @Column(name = "READ_AHEAD_EVICTED_RATE")
  private double readAheadEvictedRate;
  @Basic
  @Column(name = "LRU_IO_TOTAL")
  private Object lruIoTotal;
  @Basic
  @Column(name = "LRU_IO_CURRENT")
  private Object lruIoCurrent;
  @Basic
  @Column(name = "UNCOMPRESS_TOTAL")
  private Object uncompressTotal;
  @Basic
  @Column(name = "UNCOMPRESS_CURRENT")
  private Object uncompressCurrent;

  public Object getPoolId() {
    return poolId;
  }

  public void setPoolId(Object poolId) {
    this.poolId = poolId;
  }

  public Object getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(Object poolSize) {
    this.poolSize = poolSize;
  }

  public Object getFreeBuffers() {
    return freeBuffers;
  }

  public void setFreeBuffers(Object freeBuffers) {
    this.freeBuffers = freeBuffers;
  }

  public Object getDatabasePages() {
    return databasePages;
  }

  public void setDatabasePages(Object databasePages) {
    this.databasePages = databasePages;
  }

  public Object getOldDatabasePages() {
    return oldDatabasePages;
  }

  public void setOldDatabasePages(Object oldDatabasePages) {
    this.oldDatabasePages = oldDatabasePages;
  }

  public Object getModifiedDatabasePages() {
    return modifiedDatabasePages;
  }

  public void setModifiedDatabasePages(Object modifiedDatabasePages) {
    this.modifiedDatabasePages = modifiedDatabasePages;
  }

  public Object getPendingDecompress() {
    return pendingDecompress;
  }

  public void setPendingDecompress(Object pendingDecompress) {
    this.pendingDecompress = pendingDecompress;
  }

  public Object getPendingReads() {
    return pendingReads;
  }

  public void setPendingReads(Object pendingReads) {
    this.pendingReads = pendingReads;
  }

  public Object getPendingFlushLru() {
    return pendingFlushLru;
  }

  public void setPendingFlushLru(Object pendingFlushLru) {
    this.pendingFlushLru = pendingFlushLru;
  }

  public Object getPendingFlushList() {
    return pendingFlushList;
  }

  public void setPendingFlushList(Object pendingFlushList) {
    this.pendingFlushList = pendingFlushList;
  }

  public Object getPagesMadeYoung() {
    return pagesMadeYoung;
  }

  public void setPagesMadeYoung(Object pagesMadeYoung) {
    this.pagesMadeYoung = pagesMadeYoung;
  }

  public Object getPagesNotMadeYoung() {
    return pagesNotMadeYoung;
  }

  public void setPagesNotMadeYoung(Object pagesNotMadeYoung) {
    this.pagesNotMadeYoung = pagesNotMadeYoung;
  }

  public double getPagesMadeYoungRate() {
    return pagesMadeYoungRate;
  }

  public void setPagesMadeYoungRate(double pagesMadeYoungRate) {
    this.pagesMadeYoungRate = pagesMadeYoungRate;
  }

  public double getPagesMadeNotYoungRate() {
    return pagesMadeNotYoungRate;
  }

  public void setPagesMadeNotYoungRate(double pagesMadeNotYoungRate) {
    this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
  }

  public Object getNumberPagesRead() {
    return numberPagesRead;
  }

  public void setNumberPagesRead(Object numberPagesRead) {
    this.numberPagesRead = numberPagesRead;
  }

  public Object getNumberPagesCreated() {
    return numberPagesCreated;
  }

  public void setNumberPagesCreated(Object numberPagesCreated) {
    this.numberPagesCreated = numberPagesCreated;
  }

  public Object getNumberPagesWritten() {
    return numberPagesWritten;
  }

  public void setNumberPagesWritten(Object numberPagesWritten) {
    this.numberPagesWritten = numberPagesWritten;
  }

  public double getPagesReadRate() {
    return pagesReadRate;
  }

  public void setPagesReadRate(double pagesReadRate) {
    this.pagesReadRate = pagesReadRate;
  }

  public double getPagesCreateRate() {
    return pagesCreateRate;
  }

  public void setPagesCreateRate(double pagesCreateRate) {
    this.pagesCreateRate = pagesCreateRate;
  }

  public double getPagesWrittenRate() {
    return pagesWrittenRate;
  }

  public void setPagesWrittenRate(double pagesWrittenRate) {
    this.pagesWrittenRate = pagesWrittenRate;
  }

  public Object getNumberPagesGet() {
    return numberPagesGet;
  }

  public void setNumberPagesGet(Object numberPagesGet) {
    this.numberPagesGet = numberPagesGet;
  }

  public Object getHitRate() {
    return hitRate;
  }

  public void setHitRate(Object hitRate) {
    this.hitRate = hitRate;
  }

  public Object getYoungMakePerThousandGets() {
    return youngMakePerThousandGets;
  }

  public void setYoungMakePerThousandGets(Object youngMakePerThousandGets) {
    this.youngMakePerThousandGets = youngMakePerThousandGets;
  }

  public Object getNotYoungMakePerThousandGets() {
    return notYoungMakePerThousandGets;
  }

  public void setNotYoungMakePerThousandGets(Object notYoungMakePerThousandGets) {
    this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
  }

  public Object getNumberPagesReadAhead() {
    return numberPagesReadAhead;
  }

  public void setNumberPagesReadAhead(Object numberPagesReadAhead) {
    this.numberPagesReadAhead = numberPagesReadAhead;
  }

  public Object getNumberReadAheadEvicted() {
    return numberReadAheadEvicted;
  }

  public void setNumberReadAheadEvicted(Object numberReadAheadEvicted) {
    this.numberReadAheadEvicted = numberReadAheadEvicted;
  }

  public double getReadAheadRate() {
    return readAheadRate;
  }

  public void setReadAheadRate(double readAheadRate) {
    this.readAheadRate = readAheadRate;
  }

  public double getReadAheadEvictedRate() {
    return readAheadEvictedRate;
  }

  public void setReadAheadEvictedRate(double readAheadEvictedRate) {
    this.readAheadEvictedRate = readAheadEvictedRate;
  }

  public Object getLruIoTotal() {
    return lruIoTotal;
  }

  public void setLruIoTotal(Object lruIoTotal) {
    this.lruIoTotal = lruIoTotal;
  }

  public Object getLruIoCurrent() {
    return lruIoCurrent;
  }

  public void setLruIoCurrent(Object lruIoCurrent) {
    this.lruIoCurrent = lruIoCurrent;
  }

  public Object getUncompressTotal() {
    return uncompressTotal;
  }

  public void setUncompressTotal(Object uncompressTotal) {
    this.uncompressTotal = uncompressTotal;
  }

  public Object getUncompressCurrent() {
    return uncompressCurrent;
  }

  public void setUncompressCurrent(Object uncompressCurrent) {
    this.uncompressCurrent = uncompressCurrent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbBufferPoolStatsEntity that = (InnodbBufferPoolStatsEntity) o;
    return Double.compare(that.pagesMadeYoungRate, pagesMadeYoungRate) == 0
        && Double.compare(that.pagesMadeNotYoungRate, pagesMadeNotYoungRate) == 0
        && Double.compare(that.pagesReadRate, pagesReadRate) == 0
        && Double.compare(that.pagesCreateRate, pagesCreateRate) == 0
        && Double.compare(that.pagesWrittenRate, pagesWrittenRate) == 0
        && Double.compare(that.readAheadRate, readAheadRate) == 0
        && Double.compare(that.readAheadEvictedRate, readAheadEvictedRate) == 0
        && Objects.equals(poolId, that.poolId) && Objects.equals(poolSize,
        that.poolSize) && Objects.equals(freeBuffers, that.freeBuffers)
        && Objects.equals(databasePages, that.databasePages) && Objects.equals(
        oldDatabasePages, that.oldDatabasePages) && Objects.equals(modifiedDatabasePages,
        that.modifiedDatabasePages) && Objects.equals(pendingDecompress,
        that.pendingDecompress) && Objects.equals(pendingReads, that.pendingReads)
        && Objects.equals(pendingFlushLru, that.pendingFlushLru)
        && Objects.equals(pendingFlushList, that.pendingFlushList)
        && Objects.equals(pagesMadeYoung, that.pagesMadeYoung) && Objects.equals(
        pagesNotMadeYoung, that.pagesNotMadeYoung) && Objects.equals(numberPagesRead,
        that.numberPagesRead) && Objects.equals(numberPagesCreated, that.numberPagesCreated)
        && Objects.equals(numberPagesWritten, that.numberPagesWritten)
        && Objects.equals(numberPagesGet, that.numberPagesGet) && Objects.equals(
        hitRate, that.hitRate) && Objects.equals(youngMakePerThousandGets,
        that.youngMakePerThousandGets) && Objects.equals(notYoungMakePerThousandGets,
        that.notYoungMakePerThousandGets) && Objects.equals(numberPagesReadAhead,
        that.numberPagesReadAhead) && Objects.equals(numberReadAheadEvicted,
        that.numberReadAheadEvicted) && Objects.equals(lruIoTotal, that.lruIoTotal)
        && Objects.equals(lruIoCurrent, that.lruIoCurrent) && Objects.equals(
        uncompressTotal, that.uncompressTotal) && Objects.equals(uncompressCurrent,
        that.uncompressCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolId, poolSize, freeBuffers, databasePages, oldDatabasePages,
        modifiedDatabasePages, pendingDecompress, pendingReads, pendingFlushLru, pendingFlushList,
        pagesMadeYoung, pagesNotMadeYoung, pagesMadeYoungRate, pagesMadeNotYoungRate,
        numberPagesRead,
        numberPagesCreated, numberPagesWritten, pagesReadRate, pagesCreateRate, pagesWrittenRate,
        numberPagesGet, hitRate, youngMakePerThousandGets, notYoungMakePerThousandGets,
        numberPagesReadAhead, numberReadAheadEvicted, readAheadRate, readAheadEvictedRate,
        lruIoTotal,
        lruIoCurrent, uncompressTotal, uncompressCurrent);
  }
}
