package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TABLESPACES_BRIEF", schema = "information_schema", catalog = "")
public class InnodbTablespacesBriefEntity {

  @Basic
  @Column(name = "SPACE")
  private byte[] space;
  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "PATH")
  private String path;
  @Basic
  @Column(name = "FLAG")
  private byte[] flag;
  @Basic
  @Column(name = "SPACE_TYPE")
  private String spaceType;

  public byte[] getSpace() {
    return space;
  }

  public void setSpace(byte[] space) {
    this.space = space;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public byte[] getFlag() {
    return flag;
  }

  public void setFlag(byte[] flag) {
    this.flag = flag;
  }

  public String getSpaceType() {
    return spaceType;
  }

  public void setSpaceType(String spaceType) {
    this.spaceType = spaceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbTablespacesBriefEntity that = (InnodbTablespacesBriefEntity) o;
    return Arrays.equals(space, that.space) && Objects.equals(name, that.name)
        && Objects.equals(path, that.path) && Arrays.equals(flag, that.flag)
        && Objects.equals(spaceType, that.spaceType);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(name, path, spaceType);
    result = 31 * result + Arrays.hashCode(space);
    result = 31 * result + Arrays.hashCode(flag);
    return result;
  }
}
