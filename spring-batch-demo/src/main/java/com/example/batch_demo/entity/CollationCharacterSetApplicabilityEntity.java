package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLLATION_CHARACTER_SET_APPLICABILITY", schema = "information_schema", catalog = "")
public class CollationCharacterSetApplicabilityEntity {

  @Basic
  @Column(name = "COLLATION_NAME")
  private String collationName;
  @Basic
  @Column(name = "CHARACTER_SET_NAME")
  private String characterSetName;

  public String getCollationName() {
    return collationName;
  }

  public void setCollationName(String collationName) {
    this.collationName = collationName;
  }

  public String getCharacterSetName() {
    return characterSetName;
  }

  public void setCharacterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollationCharacterSetApplicabilityEntity that = (CollationCharacterSetApplicabilityEntity) o;
    return Objects.equals(collationName, that.collationName) && Objects.equals(
        characterSetName, that.characterSetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collationName, characterSetName);
  }
}
