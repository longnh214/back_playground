package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLLATIONS", schema = "information_schema", catalog = "")
public class CollationsEntity {

  @Basic
  @Column(name = "COLLATION_NAME")
  private String collationName;
  @Basic
  @Column(name = "CHARACTER_SET_NAME")
  private String characterSetName;
  @Basic
  @Column(name = "ID")
  private Object id;
  @Basic
  @Column(name = "IS_DEFAULT")
  private String isDefault;
  @Basic
  @Column(name = "IS_COMPILED")
  private String isCompiled;
  @Basic
  @Column(name = "SORTLEN")
  private Object sortlen;
  @Basic
  @Column(name = "PAD_ATTRIBUTE")
  private Object padAttribute;

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

  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

  public String getIsCompiled() {
    return isCompiled;
  }

  public void setIsCompiled(String isCompiled) {
    this.isCompiled = isCompiled;
  }

  public Object getSortlen() {
    return sortlen;
  }

  public void setSortlen(Object sortlen) {
    this.sortlen = sortlen;
  }

  public Object getPadAttribute() {
    return padAttribute;
  }

  public void setPadAttribute(Object padAttribute) {
    this.padAttribute = padAttribute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollationsEntity that = (CollationsEntity) o;
    return Objects.equals(collationName, that.collationName) && Objects.equals(
        characterSetName, that.characterSetName) && Objects.equals(id, that.id)
        && Objects.equals(isDefault, that.isDefault) && Objects.equals(isCompiled,
        that.isCompiled) && Objects.equals(sortlen, that.sortlen)
        && Objects.equals(padAttribute, that.padAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collationName, characterSetName, id, isDefault, isCompiled, sortlen,
        padAttribute);
  }
}
