package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "REFERENTIAL_CONSTRAINTS", schema = "information_schema", catalog = "")
public class ReferentialConstraintsEntity {

  @Basic
  @Column(name = "CONSTRAINT_CATALOG")
  private String constraintCatalog;
  @Basic
  @Column(name = "CONSTRAINT_SCHEMA")
  private String constraintSchema;
  @Basic
  @Column(name = "CONSTRAINT_NAME")
  private String constraintName;
  @Basic
  @Column(name = "UNIQUE_CONSTRAINT_CATALOG")
  private String uniqueConstraintCatalog;
  @Basic
  @Column(name = "UNIQUE_CONSTRAINT_SCHEMA")
  private String uniqueConstraintSchema;
  @Basic
  @Column(name = "UNIQUE_CONSTRAINT_NAME")
  private String uniqueConstraintName;
  @Basic
  @Column(name = "MATCH_OPTION")
  private Object matchOption;
  @Basic
  @Column(name = "UPDATE_RULE")
  private Object updateRule;
  @Basic
  @Column(name = "DELETE_RULE")
  private Object deleteRule;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "REFERENCED_TABLE_NAME")
  private String referencedTableName;

  public String getConstraintCatalog() {
    return constraintCatalog;
  }

  public void setConstraintCatalog(String constraintCatalog) {
    this.constraintCatalog = constraintCatalog;
  }

  public String getConstraintSchema() {
    return constraintSchema;
  }

  public void setConstraintSchema(String constraintSchema) {
    this.constraintSchema = constraintSchema;
  }

  public String getConstraintName() {
    return constraintName;
  }

  public void setConstraintName(String constraintName) {
    this.constraintName = constraintName;
  }

  public String getUniqueConstraintCatalog() {
    return uniqueConstraintCatalog;
  }

  public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
    this.uniqueConstraintCatalog = uniqueConstraintCatalog;
  }

  public String getUniqueConstraintSchema() {
    return uniqueConstraintSchema;
  }

  public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
    this.uniqueConstraintSchema = uniqueConstraintSchema;
  }

  public String getUniqueConstraintName() {
    return uniqueConstraintName;
  }

  public void setUniqueConstraintName(String uniqueConstraintName) {
    this.uniqueConstraintName = uniqueConstraintName;
  }

  public Object getMatchOption() {
    return matchOption;
  }

  public void setMatchOption(Object matchOption) {
    this.matchOption = matchOption;
  }

  public Object getUpdateRule() {
    return updateRule;
  }

  public void setUpdateRule(Object updateRule) {
    this.updateRule = updateRule;
  }

  public Object getDeleteRule() {
    return deleteRule;
  }

  public void setDeleteRule(Object deleteRule) {
    this.deleteRule = deleteRule;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getReferencedTableName() {
    return referencedTableName;
  }

  public void setReferencedTableName(String referencedTableName) {
    this.referencedTableName = referencedTableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferentialConstraintsEntity that = (ReferentialConstraintsEntity) o;
    return Objects.equals(constraintCatalog, that.constraintCatalog)
        && Objects.equals(constraintSchema, that.constraintSchema)
        && Objects.equals(constraintName, that.constraintName) && Objects.equals(
        uniqueConstraintCatalog, that.uniqueConstraintCatalog) && Objects.equals(
        uniqueConstraintSchema, that.uniqueConstraintSchema) && Objects.equals(
        uniqueConstraintName, that.uniqueConstraintName) && Objects.equals(matchOption,
        that.matchOption) && Objects.equals(updateRule, that.updateRule)
        && Objects.equals(deleteRule, that.deleteRule) && Objects.equals(
        tableName, that.tableName) && Objects.equals(referencedTableName,
        that.referencedTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintCatalog, constraintSchema, constraintName,
        uniqueConstraintCatalog,
        uniqueConstraintSchema, uniqueConstraintName, matchOption, updateRule, deleteRule,
        tableName,
        referencedTableName);
  }
}
