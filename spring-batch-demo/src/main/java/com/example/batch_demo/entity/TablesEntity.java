package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLES", schema = "information_schema", catalog = "")
public class TablesEntity {

  @Basic
  @Column(name = "TABLE_CATALOG")
  private String tableCatalog;
  @Basic
  @Column(name = "TABLE_SCHEMA")
  private String tableSchema;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "TABLE_TYPE")
  private Object tableType;
  @Basic
  @Column(name = "ENGINE")
  private String engine;
  @Basic
  @Column(name = "VERSION")
  private Integer version;
  @Basic
  @Column(name = "ROW_FORMAT")
  private Object rowFormat;
  @Basic
  @Column(name = "TABLE_ROWS")
  private Object tableRows;
  @Basic
  @Column(name = "AVG_ROW_LENGTH")
  private Object avgRowLength;
  @Basic
  @Column(name = "DATA_LENGTH")
  private Object dataLength;
  @Basic
  @Column(name = "MAX_DATA_LENGTH")
  private Object maxDataLength;
  @Basic
  @Column(name = "INDEX_LENGTH")
  private Object indexLength;
  @Basic
  @Column(name = "DATA_FREE")
  private Object dataFree;
  @Basic
  @Column(name = "AUTO_INCREMENT")
  private Object autoIncrement;
  @Basic
  @Column(name = "CREATE_TIME")
  private Timestamp createTime;
  @Basic
  @Column(name = "UPDATE_TIME")
  private Timestamp updateTime;
  @Basic
  @Column(name = "CHECK_TIME")
  private Timestamp checkTime;
  @Basic
  @Column(name = "TABLE_COLLATION")
  private String tableCollation;
  @Basic
  @Column(name = "CHECKSUM")
  private Long checksum;
  @Basic
  @Column(name = "CREATE_OPTIONS")
  private String createOptions;
  @Basic
  @Column(name = "TABLE_COMMENT")
  private String tableComment;

  public String getTableCatalog() {
    return tableCatalog;
  }

  public void setTableCatalog(String tableCatalog) {
    this.tableCatalog = tableCatalog;
  }

  public String getTableSchema() {
    return tableSchema;
  }

  public void setTableSchema(String tableSchema) {
    this.tableSchema = tableSchema;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public Object getTableType() {
    return tableType;
  }

  public void setTableType(Object tableType) {
    this.tableType = tableType;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Object getRowFormat() {
    return rowFormat;
  }

  public void setRowFormat(Object rowFormat) {
    this.rowFormat = rowFormat;
  }

  public Object getTableRows() {
    return tableRows;
  }

  public void setTableRows(Object tableRows) {
    this.tableRows = tableRows;
  }

  public Object getAvgRowLength() {
    return avgRowLength;
  }

  public void setAvgRowLength(Object avgRowLength) {
    this.avgRowLength = avgRowLength;
  }

  public Object getDataLength() {
    return dataLength;
  }

  public void setDataLength(Object dataLength) {
    this.dataLength = dataLength;
  }

  public Object getMaxDataLength() {
    return maxDataLength;
  }

  public void setMaxDataLength(Object maxDataLength) {
    this.maxDataLength = maxDataLength;
  }

  public Object getIndexLength() {
    return indexLength;
  }

  public void setIndexLength(Object indexLength) {
    this.indexLength = indexLength;
  }

  public Object getDataFree() {
    return dataFree;
  }

  public void setDataFree(Object dataFree) {
    this.dataFree = dataFree;
  }

  public Object getAutoIncrement() {
    return autoIncrement;
  }

  public void setAutoIncrement(Object autoIncrement) {
    this.autoIncrement = autoIncrement;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public Timestamp getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(Timestamp checkTime) {
    this.checkTime = checkTime;
  }

  public String getTableCollation() {
    return tableCollation;
  }

  public void setTableCollation(String tableCollation) {
    this.tableCollation = tableCollation;
  }

  public Long getChecksum() {
    return checksum;
  }

  public void setChecksum(Long checksum) {
    this.checksum = checksum;
  }

  public String getCreateOptions() {
    return createOptions;
  }

  public void setCreateOptions(String createOptions) {
    this.createOptions = createOptions;
  }

  public String getTableComment() {
    return tableComment;
  }

  public void setTableComment(String tableComment) {
    this.tableComment = tableComment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TablesEntity that = (TablesEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(tableType, that.tableType) && Objects.equals(engine,
        that.engine) && Objects.equals(version, that.version) && Objects.equals(
        rowFormat, that.rowFormat) && Objects.equals(tableRows, that.tableRows)
        && Objects.equals(avgRowLength, that.avgRowLength) && Objects.equals(
        dataLength, that.dataLength) && Objects.equals(maxDataLength, that.maxDataLength)
        && Objects.equals(indexLength, that.indexLength) && Objects.equals(
        dataFree, that.dataFree) && Objects.equals(autoIncrement, that.autoIncrement)
        && Objects.equals(createTime, that.createTime) && Objects.equals(
        updateTime, that.updateTime) && Objects.equals(checkTime, that.checkTime)
        && Objects.equals(tableCollation, that.tableCollation) && Objects.equals(
        checksum, that.checksum) && Objects.equals(createOptions, that.createOptions)
        && Objects.equals(tableComment, that.tableComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, tableType, engine, version, rowFormat,
        tableRows, avgRowLength, dataLength, maxDataLength, indexLength, dataFree, autoIncrement,
        createTime, updateTime, checkTime, tableCollation, checksum, createOptions, tableComment);
  }
}
