package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RESOURCE_GROUPS", schema = "information_schema", catalog = "")
public class ResourceGroupsEntity {

  @Basic
  @Column(name = "RESOURCE_GROUP_NAME")
  private String resourceGroupName;
  @Basic
  @Column(name = "RESOURCE_GROUP_TYPE")
  private Object resourceGroupType;
  @Basic
  @Column(name = "RESOURCE_GROUP_ENABLED")
  private byte resourceGroupEnabled;
  @Basic
  @Column(name = "VCPU_IDS")
  private byte[] vcpuIds;
  @Basic
  @Column(name = "THREAD_PRIORITY")
  private int threadPriority;

  public String getResourceGroupName() {
    return resourceGroupName;
  }

  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }

  public Object getResourceGroupType() {
    return resourceGroupType;
  }

  public void setResourceGroupType(Object resourceGroupType) {
    this.resourceGroupType = resourceGroupType;
  }

  public byte getResourceGroupEnabled() {
    return resourceGroupEnabled;
  }

  public void setResourceGroupEnabled(byte resourceGroupEnabled) {
    this.resourceGroupEnabled = resourceGroupEnabled;
  }

  public byte[] getVcpuIds() {
    return vcpuIds;
  }

  public void setVcpuIds(byte[] vcpuIds) {
    this.vcpuIds = vcpuIds;
  }

  public int getThreadPriority() {
    return threadPriority;
  }

  public void setThreadPriority(int threadPriority) {
    this.threadPriority = threadPriority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceGroupsEntity that = (ResourceGroupsEntity) o;
    return resourceGroupEnabled == that.resourceGroupEnabled
        && threadPriority == that.threadPriority
        && Objects.equals(resourceGroupName, that.resourceGroupName)
        && Objects.equals(resourceGroupType, that.resourceGroupType)
        && Arrays.equals(vcpuIds, that.vcpuIds);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(resourceGroupName, resourceGroupType, resourceGroupEnabled,
        threadPriority);
    result = 31 * result + Arrays.hashCode(vcpuIds);
    return result;
  }
}
