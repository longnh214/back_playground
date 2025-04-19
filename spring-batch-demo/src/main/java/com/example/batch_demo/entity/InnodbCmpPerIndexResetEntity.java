package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CMP_PER_INDEX_RESET", schema = "information_schema", catalog = "")
public class InnodbCmpPerIndexResetEntity {

  @Basic
  @Column(name = "database_name")
  private String databaseName;
  @Basic
  @Column(name = "table_name")
  private String tableName;
  @Basic
  @Column(name = "index_name")
  private String indexName;
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

  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
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
    InnodbCmpPerIndexResetEntity that = (InnodbCmpPerIndexResetEntity) o;
    return compressOps == that.compressOps && compressOpsOk == that.compressOpsOk
        && compressTime == that.compressTime && uncompressOps == that.uncompressOps
        && uncompressTime == that.uncompressTime && Objects.equals(databaseName,
        that.databaseName) && Objects.equals(tableName, that.tableName)
        && Objects.equals(indexName, that.indexName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, tableName, indexName, compressOps, compressOpsOk,
        compressTime,
        uncompressOps, uncompressTime);
  }
}
