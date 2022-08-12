package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PARTITIONS", schema = "information_schema", catalog = "")
public class PartitionsEntity {

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
  @Column(name = "PARTITION_NAME")
  private String partitionName;
  @Basic
  @Column(name = "SUBPARTITION_NAME")
  private String subpartitionName;
  @Basic
  @Column(name = "PARTITION_ORDINAL_POSITION")
  private Object partitionOrdinalPosition;
  @Basic
  @Column(name = "SUBPARTITION_ORDINAL_POSITION")
  private Object subpartitionOrdinalPosition;
  @Basic
  @Column(name = "PARTITION_METHOD")
  private String partitionMethod;
  @Basic
  @Column(name = "SUBPARTITION_METHOD")
  private String subpartitionMethod;
  @Basic
  @Column(name = "PARTITION_EXPRESSION")
  private String partitionExpression;
  @Basic
  @Column(name = "SUBPARTITION_EXPRESSION")
  private String subpartitionExpression;
  @Basic
  @Column(name = "PARTITION_DESCRIPTION")
  private String partitionDescription;
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
  @Column(name = "CREATE_TIME")
  private Timestamp createTime;
  @Basic
  @Column(name = "UPDATE_TIME")
  private Timestamp updateTime;
  @Basic
  @Column(name = "CHECK_TIME")
  private Timestamp checkTime;
  @Basic
  @Column(name = "CHECKSUM")
  private Long checksum;
  @Basic
  @Column(name = "PARTITION_COMMENT")
  private String partitionComment;
  @Basic
  @Column(name = "NODEGROUP")
  private String nodegroup;
  @Basic
  @Column(name = "TABLESPACE_NAME")
  private String tablespaceName;

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

  public String getPartitionName() {
    return partitionName;
  }

  public void setPartitionName(String partitionName) {
    this.partitionName = partitionName;
  }

  public String getSubpartitionName() {
    return subpartitionName;
  }

  public void setSubpartitionName(String subpartitionName) {
    this.subpartitionName = subpartitionName;
  }

  public Object getPartitionOrdinalPosition() {
    return partitionOrdinalPosition;
  }

  public void setPartitionOrdinalPosition(Object partitionOrdinalPosition) {
    this.partitionOrdinalPosition = partitionOrdinalPosition;
  }

  public Object getSubpartitionOrdinalPosition() {
    return subpartitionOrdinalPosition;
  }

  public void setSubpartitionOrdinalPosition(Object subpartitionOrdinalPosition) {
    this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
  }

  public String getPartitionMethod() {
    return partitionMethod;
  }

  public void setPartitionMethod(String partitionMethod) {
    this.partitionMethod = partitionMethod;
  }

  public String getSubpartitionMethod() {
    return subpartitionMethod;
  }

  public void setSubpartitionMethod(String subpartitionMethod) {
    this.subpartitionMethod = subpartitionMethod;
  }

  public String getPartitionExpression() {
    return partitionExpression;
  }

  public void setPartitionExpression(String partitionExpression) {
    this.partitionExpression = partitionExpression;
  }

  public String getSubpartitionExpression() {
    return subpartitionExpression;
  }

  public void setSubpartitionExpression(String subpartitionExpression) {
    this.subpartitionExpression = subpartitionExpression;
  }

  public String getPartitionDescription() {
    return partitionDescription;
  }

  public void setPartitionDescription(String partitionDescription) {
    this.partitionDescription = partitionDescription;
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

  public Long getChecksum() {
    return checksum;
  }

  public void setChecksum(Long checksum) {
    this.checksum = checksum;
  }

  public String getPartitionComment() {
    return partitionComment;
  }

  public void setPartitionComment(String partitionComment) {
    this.partitionComment = partitionComment;
  }

  public String getNodegroup() {
    return nodegroup;
  }

  public void setNodegroup(String nodegroup) {
    this.nodegroup = nodegroup;
  }

  public String getTablespaceName() {
    return tablespaceName;
  }

  public void setTablespaceName(String tablespaceName) {
    this.tablespaceName = tablespaceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartitionsEntity that = (PartitionsEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(partitionName, that.partitionName) && Objects.equals(
        subpartitionName, that.subpartitionName) && Objects.equals(partitionOrdinalPosition,
        that.partitionOrdinalPosition) && Objects.equals(subpartitionOrdinalPosition,
        that.subpartitionOrdinalPosition) && Objects.equals(partitionMethod,
        that.partitionMethod) && Objects.equals(subpartitionMethod, that.subpartitionMethod)
        && Objects.equals(partitionExpression, that.partitionExpression)
        && Objects.equals(subpartitionExpression, that.subpartitionExpression)
        && Objects.equals(partitionDescription, that.partitionDescription)
        && Objects.equals(tableRows, that.tableRows) && Objects.equals(
        avgRowLength, that.avgRowLength) && Objects.equals(dataLength, that.dataLength)
        && Objects.equals(maxDataLength, that.maxDataLength) && Objects.equals(
        indexLength, that.indexLength) && Objects.equals(dataFree, that.dataFree)
        && Objects.equals(createTime, that.createTime) && Objects.equals(
        updateTime, that.updateTime) && Objects.equals(checkTime, that.checkTime)
        && Objects.equals(checksum, that.checksum) && Objects.equals(
        partitionComment, that.partitionComment) && Objects.equals(nodegroup,
        that.nodegroup) && Objects.equals(tablespaceName, that.tablespaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, partitionName, subpartitionName,
        partitionOrdinalPosition, subpartitionOrdinalPosition, partitionMethod, subpartitionMethod,
        partitionExpression, subpartitionExpression, partitionDescription, tableRows, avgRowLength,
        dataLength, maxDataLength, indexLength, dataFree, createTime, updateTime, checkTime,
        checksum,
        partitionComment, nodegroup, tablespaceName);
  }
}
