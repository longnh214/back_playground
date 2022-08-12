package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FT_INDEX_CACHE", schema = "information_schema", catalog = "")
public class InnodbFtIndexCacheEntity {

  @Basic
  @Column(name = "WORD")
  private String word;
  @Basic
  @Column(name = "FIRST_DOC_ID")
  private Object firstDocId;
  @Basic
  @Column(name = "LAST_DOC_ID")
  private Object lastDocId;
  @Basic
  @Column(name = "DOC_COUNT")
  private Object docCount;
  @Basic
  @Column(name = "DOC_ID")
  private Object docId;
  @Basic
  @Column(name = "POSITION")
  private Object position;

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Object getFirstDocId() {
    return firstDocId;
  }

  public void setFirstDocId(Object firstDocId) {
    this.firstDocId = firstDocId;
  }

  public Object getLastDocId() {
    return lastDocId;
  }

  public void setLastDocId(Object lastDocId) {
    this.lastDocId = lastDocId;
  }

  public Object getDocCount() {
    return docCount;
  }

  public void setDocCount(Object docCount) {
    this.docCount = docCount;
  }

  public Object getDocId() {
    return docId;
  }

  public void setDocId(Object docId) {
    this.docId = docId;
  }

  public Object getPosition() {
    return position;
  }

  public void setPosition(Object position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbFtIndexCacheEntity that = (InnodbFtIndexCacheEntity) o;
    return Objects.equals(word, that.word) && Objects.equals(firstDocId,
        that.firstDocId) && Objects.equals(lastDocId, that.lastDocId)
        && Objects.equals(docCount, that.docCount) && Objects.equals(docId,
        that.docId) && Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, firstDocId, lastDocId, docCount, docId, position);
  }
}
