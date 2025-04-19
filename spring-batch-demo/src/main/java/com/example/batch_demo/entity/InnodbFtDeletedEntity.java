package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_FT_DELETED", schema = "information_schema", catalog = "")
public class InnodbFtDeletedEntity {

  @Basic
  @Column(name = "DOC_ID")
  private Object docId;

  public Object getDocId() {
    return docId;
  }

  public void setDocId(Object docId) {
    this.docId = docId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbFtDeletedEntity that = (InnodbFtDeletedEntity) o;
    return Objects.equals(docId, that.docId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docId);
  }
}
