package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_CACHED_INDEXES", schema = "information_schema", catalog = "")
public class InnodbCachedIndexesEntity {

  @Basic
  @Column(name = "SPACE_ID")
  private Object spaceId;
  @Basic
  @Column(name = "INDEX_ID")
  private Object indexId;
  @Basic
  @Column(name = "N_CACHED_PAGES")
  private Object nCachedPages;

  public Object getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Object spaceId) {
    this.spaceId = spaceId;
  }

  public Object getIndexId() {
    return indexId;
  }

  public void setIndexId(Object indexId) {
    this.indexId = indexId;
  }

  public Object getnCachedPages() {
    return nCachedPages;
  }

  public void setnCachedPages(Object nCachedPages) {
    this.nCachedPages = nCachedPages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbCachedIndexesEntity that = (InnodbCachedIndexesEntity) o;
    return Objects.equals(spaceId, that.spaceId) && Objects.equals(indexId,
        that.indexId) && Objects.equals(nCachedPages, that.nCachedPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId, indexId, nCachedPages);
  }
}
