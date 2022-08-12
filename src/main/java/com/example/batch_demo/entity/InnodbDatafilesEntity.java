package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_DATAFILES", schema = "information_schema", catalog = "")
public class InnodbDatafilesEntity {

  @Basic
  @Column(name = "SPACE")
  private byte[] space;
  @Basic
  @Column(name = "PATH")
  private String path;

  public byte[] getSpace() {
    return space;
  }

  public void setSpace(byte[] space) {
    this.space = space;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbDatafilesEntity that = (InnodbDatafilesEntity) o;
    return Arrays.equals(space, that.space) && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(path);
    result = 31 * result + Arrays.hashCode(space);
    return result;
  }
}
