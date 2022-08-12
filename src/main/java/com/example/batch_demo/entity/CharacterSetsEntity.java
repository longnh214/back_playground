package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CHARACTER_SETS", schema = "information_schema", catalog = "")
public class CharacterSetsEntity {

  @Basic
  @Column(name = "CHARACTER_SET_NAME")
  private String characterSetName;
  @Basic
  @Column(name = "DEFAULT_COLLATE_NAME")
  private String defaultCollateName;
  @Basic
  @Column(name = "DESCRIPTION")
  private String description;
  @Basic
  @Column(name = "MAXLEN")
  private Object maxlen;

  public String getCharacterSetName() {
    return characterSetName;
  }

  public void setCharacterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
  }

  public String getDefaultCollateName() {
    return defaultCollateName;
  }

  public void setDefaultCollateName(String defaultCollateName) {
    this.defaultCollateName = defaultCollateName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Object getMaxlen() {
    return maxlen;
  }

  public void setMaxlen(Object maxlen) {
    this.maxlen = maxlen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSetsEntity that = (CharacterSetsEntity) o;
    return Objects.equals(characterSetName, that.characterSetName)
        && Objects.equals(defaultCollateName, that.defaultCollateName)
        && Objects.equals(description, that.description) && Objects.equals(maxlen,
        that.maxlen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterSetName, defaultCollateName, description, maxlen);
  }
}
