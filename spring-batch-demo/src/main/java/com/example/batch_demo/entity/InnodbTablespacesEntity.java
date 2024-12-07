package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLESPACES", schema = "information_schema", catalog = "")
public class InnodbTablespacesEntity {

  @Basic
  @Column(name = "SPACE")
  private Object space;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "FLAG")
  private Object flag;
  @Basic
  @Column(name = "ROW_FORMAT")
  private String rowFormat;
  @Basic
  @Column(name = "PAGE_SIZE")
  private Object pageSize;
  @Basic
  @Column(name = "ZIP_PAGE_SIZE")
  private Object zipPageSize;
  @Basic
  @Column(name = "SPACE_TYPE")
  private String spaceType;
  @Basic
  @Column(name = "FS_BLOCK_SIZE")
  private Object fsBlockSize;
  @Basic
  @Column(name = "FILE_SIZE")
  private Object fileSize;
  @Basic
  @Column(name = "ALLOCATED_SIZE")
  private Object allocatedSize;
  @Basic
  @Column(name = "AUTOEXTEND_SIZE")
  private Object autoextendSize;
  @Basic
  @Column(name = "SERVER_VERSION")
  private String serverVersion;
  @Basic
  @Column(name = "SPACE_VERSION")
  private Object spaceVersion;
  @Basic
  @Column(name = "ENCRYPTION")
  private String encryption;
  @Basic
  @Column(name = "STATE")
  private String state;

  public Object getSpace() {
    return space;
  }

  public void setSpace(Object space) {
    this.space = space;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getFlag() {
    return flag;
  }

  public void setFlag(Object flag) {
    this.flag = flag;
  }

  public String getRowFormat() {
    return rowFormat;
  }

  public void setRowFormat(String rowFormat) {
    this.rowFormat = rowFormat;
  }

  public Object getPageSize() {
    return pageSize;
  }

  public void setPageSize(Object pageSize) {
    this.pageSize = pageSize;
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

  public Object getFsBlockSize() {
    return fsBlockSize;
  }

  public void setFsBlockSize(Object fsBlockSize) {
    this.fsBlockSize = fsBlockSize;
  }

  public Object getFileSize() {
    return fileSize;
  }

  public void setFileSize(Object fileSize) {
    this.fileSize = fileSize;
  }

  public Object getAllocatedSize() {
    return allocatedSize;
  }

  public void setAllocatedSize(Object allocatedSize) {
    this.allocatedSize = allocatedSize;
  }

  public Object getAutoextendSize() {
    return autoextendSize;
  }

  public void setAutoextendSize(Object autoextendSize) {
    this.autoextendSize = autoextendSize;
  }

  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public Object getSpaceVersion() {
    return spaceVersion;
  }

  public void setSpaceVersion(Object spaceVersion) {
    this.spaceVersion = spaceVersion;
  }

  public String getEncryption() {
    return encryption;
  }

  public void setEncryption(String encryption) {
    this.encryption = encryption;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbTablespacesEntity that = (InnodbTablespacesEntity) o;
    return Objects.equals(space, that.space) && Objects.equals(name, that.name)
        && Objects.equals(flag, that.flag) && Objects.equals(rowFormat,
        that.rowFormat) && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(zipPageSize, that.zipPageSize) && Objects.equals(
        spaceType, that.spaceType) && Objects.equals(fsBlockSize, that.fsBlockSize)
        && Objects.equals(fileSize, that.fileSize) && Objects.equals(
        allocatedSize, that.allocatedSize) && Objects.equals(autoextendSize,
        that.autoextendSize) && Objects.equals(serverVersion, that.serverVersion)
        && Objects.equals(spaceVersion, that.spaceVersion) && Objects.equals(
        encryption, that.encryption) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(space, name, flag, rowFormat, pageSize, zipPageSize, spaceType, fsBlockSize,
        fileSize, allocatedSize, autoextendSize, serverVersion, spaceVersion, encryption, state);
  }
}
