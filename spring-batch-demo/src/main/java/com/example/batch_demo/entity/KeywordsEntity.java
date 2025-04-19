package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KEYWORDS", schema = "information_schema", catalog = "")
public class KeywordsEntity {

  @Basic
  @Column(name = "WORD")
  private String word;
  @Basic
  @Column(name = "RESERVED")
  private Integer reserved;

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Integer getReserved() {
    return reserved;
  }

  public void setReserved(Integer reserved) {
    this.reserved = reserved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordsEntity that = (KeywordsEntity) o;
    return Objects.equals(word, that.word) && Objects.equals(reserved,
        that.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, reserved);
  }
}
