package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FILES", schema = "information_schema", catalog = "")
public class FilesEntity {

  @Basic
  @Column(name = "FILE_ID")
  private Long fileId;
  @Basic
  @Column(name = "FILE_NAME")
  private String fileName;
  @Basic
  @Column(name = "FILE_TYPE")
  private String fileType;
  @Basic
  @Column(name = "TABLESPACE_NAME")
  private String tablespaceName;
  @Basic
  @Column(name = "TABLE_CATALOG")
  private String tableCatalog;
  @Basic
  @Column(name = "TABLE_SCHEMA")
  private byte[] tableSchema;
  @Basic
  @Column(name = "TABLE_NAME")
  private byte[] tableName;
  @Basic
  @Column(name = "LOGFILE_GROUP_NAME")
  private String logfileGroupName;
  @Basic
  @Column(name = "LOGFILE_GROUP_NUMBER")
  private Long logfileGroupNumber;
  @Basic
  @Column(name = "ENGINE")
  private String engine;
  @Basic
  @Column(name = "FULLTEXT_KEYS")
  private byte[] fulltextKeys;
  @Basic
  @Column(name = "DELETED_ROWS")
  private byte[] deletedRows;
  @Basic
  @Column(name = "UPDATE_COUNT")
  private byte[] updateCount;
  @Basic
  @Column(name = "FREE_EXTENTS")
  private Long freeExtents;
  @Basic
  @Column(name = "TOTAL_EXTENTS")
  private Long totalExtents;
  @Basic
  @Column(name = "EXTENT_SIZE")
  private Long extentSize;
  @Basic
  @Column(name = "INITIAL_SIZE")
  private Long initialSize;
  @Basic
  @Column(name = "MAXIMUM_SIZE")
  private Long maximumSize;
  @Basic
  @Column(name = "AUTOEXTEND_SIZE")
  private Long autoextendSize;
  @Basic
  @Column(name = "CREATION_TIME")
  private byte[] creationTime;
  @Basic
  @Column(name = "LAST_UPDATE_TIME")
  private byte[] lastUpdateTime;
  @Basic
  @Column(name = "LAST_ACCESS_TIME")
  private byte[] lastAccessTime;
  @Basic
  @Column(name = "RECOVER_TIME")
  private byte[] recoverTime;
  @Basic
  @Column(name = "TRANSACTION_COUNTER")
  private byte[] transactionCounter;
  @Basic
  @Column(name = "VERSION")
  private Long version;
  @Basic
  @Column(name = "ROW_FORMAT")
  private String rowFormat;
  @Basic
  @Column(name = "TABLE_ROWS")
  private byte[] tableRows;
  @Basic
  @Column(name = "AVG_ROW_LENGTH")
  private byte[] avgRowLength;
  @Basic
  @Column(name = "DATA_LENGTH")
  private byte[] dataLength;
  @Basic
  @Column(name = "MAX_DATA_LENGTH")
  private byte[] maxDataLength;
  @Basic
  @Column(name = "INDEX_LENGTH")
  private byte[] indexLength;
  @Basic
  @Column(name = "DATA_FREE")
  private Long dataFree;
  @Basic
  @Column(name = "CREATE_TIME")
  private byte[] createTime;
  @Basic
  @Column(name = "UPDATE_TIME")
  private byte[] updateTime;
  @Basic
  @Column(name = "CHECK_TIME")
  private byte[] checkTime;
  @Basic
  @Column(name = "CHECKSUM")
  private byte[] checksum;
  @Basic
  @Column(name = "STATUS")
  private String status;
  @Basic
  @Column(name = "EXTRA")
  private String extra;

  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getTablespaceName() {
    return tablespaceName;
  }

  public void setTablespaceName(String tablespaceName) {
    this.tablespaceName = tablespaceName;
  }

  public String getTableCatalog() {
    return tableCatalog;
  }

  public void setTableCatalog(String tableCatalog) {
    this.tableCatalog = tableCatalog;
  }

  public byte[] getTableSchema() {
    return tableSchema;
  }

  public void setTableSchema(byte[] tableSchema) {
    this.tableSchema = tableSchema;
  }

  public byte[] getTableName() {
    return tableName;
  }

  public void setTableName(byte[] tableName) {
    this.tableName = tableName;
  }

  public String getLogfileGroupName() {
    return logfileGroupName;
  }

  public void setLogfileGroupName(String logfileGroupName) {
    this.logfileGroupName = logfileGroupName;
  }

  public Long getLogfileGroupNumber() {
    return logfileGroupNumber;
  }

  public void setLogfileGroupNumber(Long logfileGroupNumber) {
    this.logfileGroupNumber = logfileGroupNumber;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public byte[] getFulltextKeys() {
    return fulltextKeys;
  }

  public void setFulltextKeys(byte[] fulltextKeys) {
    this.fulltextKeys = fulltextKeys;
  }

  public byte[] getDeletedRows() {
    return deletedRows;
  }

  public void setDeletedRows(byte[] deletedRows) {
    this.deletedRows = deletedRows;
  }

  public byte[] getUpdateCount() {
    return updateCount;
  }

  public void setUpdateCount(byte[] updateCount) {
    this.updateCount = updateCount;
  }

  public Long getFreeExtents() {
    return freeExtents;
  }

  public void setFreeExtents(Long freeExtents) {
    this.freeExtents = freeExtents;
  }

  public Long getTotalExtents() {
    return totalExtents;
  }

  public void setTotalExtents(Long totalExtents) {
    this.totalExtents = totalExtents;
  }

  public Long getExtentSize() {
    return extentSize;
  }

  public void setExtentSize(Long extentSize) {
    this.extentSize = extentSize;
  }

  public Long getInitialSize() {
    return initialSize;
  }

  public void setInitialSize(Long initialSize) {
    this.initialSize = initialSize;
  }

  public Long getMaximumSize() {
    return maximumSize;
  }

  public void setMaximumSize(Long maximumSize) {
    this.maximumSize = maximumSize;
  }

  public Long getAutoextendSize() {
    return autoextendSize;
  }

  public void setAutoextendSize(Long autoextendSize) {
    this.autoextendSize = autoextendSize;
  }

  public byte[] getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(byte[] creationTime) {
    this.creationTime = creationTime;
  }

  public byte[] getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(byte[] lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public byte[] getLastAccessTime() {
    return lastAccessTime;
  }

  public void setLastAccessTime(byte[] lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
  }

  public byte[] getRecoverTime() {
    return recoverTime;
  }

  public void setRecoverTime(byte[] recoverTime) {
    this.recoverTime = recoverTime;
  }

  public byte[] getTransactionCounter() {
    return transactionCounter;
  }

  public void setTransactionCounter(byte[] transactionCounter) {
    this.transactionCounter = transactionCounter;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public String getRowFormat() {
    return rowFormat;
  }

  public void setRowFormat(String rowFormat) {
    this.rowFormat = rowFormat;
  }

  public byte[] getTableRows() {
    return tableRows;
  }

  public void setTableRows(byte[] tableRows) {
    this.tableRows = tableRows;
  }

  public byte[] getAvgRowLength() {
    return avgRowLength;
  }

  public void setAvgRowLength(byte[] avgRowLength) {
    this.avgRowLength = avgRowLength;
  }

  public byte[] getDataLength() {
    return dataLength;
  }

  public void setDataLength(byte[] dataLength) {
    this.dataLength = dataLength;
  }

  public byte[] getMaxDataLength() {
    return maxDataLength;
  }

  public void setMaxDataLength(byte[] maxDataLength) {
    this.maxDataLength = maxDataLength;
  }

  public byte[] getIndexLength() {
    return indexLength;
  }

  public void setIndexLength(byte[] indexLength) {
    this.indexLength = indexLength;
  }

  public Long getDataFree() {
    return dataFree;
  }

  public void setDataFree(Long dataFree) {
    this.dataFree = dataFree;
  }

  public byte[] getCreateTime() {
    return createTime;
  }

  public void setCreateTime(byte[] createTime) {
    this.createTime = createTime;
  }

  public byte[] getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(byte[] updateTime) {
    this.updateTime = updateTime;
  }

  public byte[] getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(byte[] checkTime) {
    this.checkTime = checkTime;
  }

  public byte[] getChecksum() {
    return checksum;
  }

  public void setChecksum(byte[] checksum) {
    this.checksum = checksum;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesEntity that = (FilesEntity) o;
    return Objects.equals(fileId, that.fileId) && Objects.equals(fileName,
        that.fileName) && Objects.equals(fileType, that.fileType)
        && Objects.equals(tablespaceName, that.tablespaceName) && Objects.equals(
        tableCatalog, that.tableCatalog) && Arrays.equals(tableSchema, that.tableSchema)
        && Arrays.equals(tableName, that.tableName) && Objects.equals(
        logfileGroupName, that.logfileGroupName) && Objects.equals(logfileGroupNumber,
        that.logfileGroupNumber) && Objects.equals(engine, that.engine)
        && Arrays.equals(fulltextKeys, that.fulltextKeys) && Arrays.equals(
        deletedRows, that.deletedRows) && Arrays.equals(updateCount, that.updateCount)
        && Objects.equals(freeExtents, that.freeExtents) && Objects.equals(
        totalExtents, that.totalExtents) && Objects.equals(extentSize, that.extentSize)
        && Objects.equals(initialSize, that.initialSize) && Objects.equals(
        maximumSize, that.maximumSize) && Objects.equals(autoextendSize,
        that.autoextendSize) && Arrays.equals(creationTime, that.creationTime)
        && Arrays.equals(lastUpdateTime, that.lastUpdateTime) && Arrays.equals(
        lastAccessTime, that.lastAccessTime) && Arrays.equals(recoverTime, that.recoverTime)
        && Arrays.equals(transactionCounter, that.transactionCounter)
        && Objects.equals(version, that.version) && Objects.equals(rowFormat,
        that.rowFormat) && Arrays.equals(tableRows, that.tableRows)
        && Arrays.equals(avgRowLength, that.avgRowLength) && Arrays.equals(
        dataLength, that.dataLength) && Arrays.equals(maxDataLength, that.maxDataLength)
        && Arrays.equals(indexLength, that.indexLength) && Objects.equals(
        dataFree, that.dataFree) && Arrays.equals(createTime, that.createTime)
        && Arrays.equals(updateTime, that.updateTime) && Arrays.equals(checkTime,
        that.checkTime) && Arrays.equals(checksum, that.checksum)
        && Objects.equals(status, that.status) && Objects.equals(extra,
        that.extra);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(fileId, fileName, fileType, tablespaceName, tableCatalog,
        logfileGroupName, logfileGroupNumber, engine, freeExtents, totalExtents, extentSize,
        initialSize, maximumSize, autoextendSize, version, rowFormat, dataFree, status, extra);
    result = 31 * result + Arrays.hashCode(tableSchema);
    result = 31 * result + Arrays.hashCode(tableName);
    result = 31 * result + Arrays.hashCode(fulltextKeys);
    result = 31 * result + Arrays.hashCode(deletedRows);
    result = 31 * result + Arrays.hashCode(updateCount);
    result = 31 * result + Arrays.hashCode(creationTime);
    result = 31 * result + Arrays.hashCode(lastUpdateTime);
    result = 31 * result + Arrays.hashCode(lastAccessTime);
    result = 31 * result + Arrays.hashCode(recoverTime);
    result = 31 * result + Arrays.hashCode(transactionCounter);
    result = 31 * result + Arrays.hashCode(tableRows);
    result = 31 * result + Arrays.hashCode(avgRowLength);
    result = 31 * result + Arrays.hashCode(dataLength);
    result = 31 * result + Arrays.hashCode(maxDataLength);
    result = 31 * result + Arrays.hashCode(indexLength);
    result = 31 * result + Arrays.hashCode(createTime);
    result = 31 * result + Arrays.hashCode(updateTime);
    result = 31 * result + Arrays.hashCode(checkTime);
    result = 31 * result + Arrays.hashCode(checksum);
    return result;
  }
}
