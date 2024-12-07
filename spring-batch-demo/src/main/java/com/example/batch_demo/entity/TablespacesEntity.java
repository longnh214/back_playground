package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLESPACES", schema = "information_schema", catalog = "")
public class TablespacesEntity {

  @Basic
  @Column(name = "TABLESPACE_NAME")
  private String tablespaceName;
  @Basic
  @Column(name = "ENGINE")
  private String engine;
  @Basic
  @Column(name = "TABLESPACE_TYPE")
  private String tablespaceType;
  @Basic
  @Column(name = "LOGFILE_GROUP_NAME")
  private String logfileGroupName;
  @Basic
  @Column(name = "EXTENT_SIZE")
  private Object extentSize;
  @Basic
  @Column(name = "AUTOEXTEND_SIZE")
  private Object autoextendSize;
  @Basic
  @Column(name = "MAXIMUM_SIZE")
  private Object maximumSize;
  @Basic
  @Column(name = "NODEGROUP_ID")
  private Object nodegroupId;
  @Basic
  @Column(name = "TABLESPACE_COMMENT")
  private String tablespaceComment;

  public String getTablespaceName() {
    return tablespaceName;
  }

  public void setTablespaceName(String tablespaceName) {
    this.tablespaceName = tablespaceName;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getTablespaceType() {
    return tablespaceType;
  }

  public void setTablespaceType(String tablespaceType) {
    this.tablespaceType = tablespaceType;
  }

  public String getLogfileGroupName() {
    return logfileGroupName;
  }

  public void setLogfileGroupName(String logfileGroupName) {
    this.logfileGroupName = logfileGroupName;
  }

  public Object getExtentSize() {
    return extentSize;
  }

  public void setExtentSize(Object extentSize) {
    this.extentSize = extentSize;
  }

  public Object getAutoextendSize() {
    return autoextendSize;
  }

  public void setAutoextendSize(Object autoextendSize) {
    this.autoextendSize = autoextendSize;
  }

  public Object getMaximumSize() {
    return maximumSize;
  }

  public void setMaximumSize(Object maximumSize) {
    this.maximumSize = maximumSize;
  }

  public Object getNodegroupId() {
    return nodegroupId;
  }

  public void setNodegroupId(Object nodegroupId) {
    this.nodegroupId = nodegroupId;
  }

  public String getTablespaceComment() {
    return tablespaceComment;
  }

  public void setTablespaceComment(String tablespaceComment) {
    this.tablespaceComment = tablespaceComment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TablespacesEntity that = (TablespacesEntity) o;
    return Objects.equals(tablespaceName, that.tablespaceName) && Objects.equals(
        engine, that.engine) && Objects.equals(tablespaceType, that.tablespaceType)
        && Objects.equals(logfileGroupName, that.logfileGroupName)
        && Objects.equals(extentSize, that.extentSize) && Objects.equals(
        autoextendSize, that.autoextendSize) && Objects.equals(maximumSize,
        that.maximumSize) && Objects.equals(nodegroupId, that.nodegroupId)
        && Objects.equals(tablespaceComment, that.tablespaceComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tablespaceName, engine, tablespaceType, logfileGroupName, extentSize,
        autoextendSize, maximumSize, nodegroupId, tablespaceComment);
  }
}
