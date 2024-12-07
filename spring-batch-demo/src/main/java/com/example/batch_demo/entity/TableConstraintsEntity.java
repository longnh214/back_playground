package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_CONSTRAINTS", schema = "information_schema", catalog = "")
public class TableConstraintsEntity {

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
  @Column(name = "TABLE_SCHEMA")
  private String tableSchema;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "CONSTRAINT_TYPE")
  private String constraintType;
  @Basic
  @Column(name = "ENFORCED")
  private String enforced;

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

  public String getTableSchema() {
    return tableSchema;
  }

  public void setTableSchema(String tableSchema) {
    this.tableSchema = tableSchema;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getConstraintType() {
    return constraintType;
  }

  public void setConstraintType(String constraintType) {
    this.constraintType = constraintType;
  }

  public String getEnforced() {
    return enforced;
  }

  public void setEnforced(String enforced) {
    this.enforced = enforced;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableConstraintsEntity that = (TableConstraintsEntity) o;
    return Objects.equals(constraintCatalog, that.constraintCatalog)
        && Objects.equals(constraintSchema, that.constraintSchema)
        && Objects.equals(constraintName, that.constraintName) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(constraintType, that.constraintType) && Objects.equals(
        enforced, that.enforced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintCatalog, constraintSchema, constraintName, tableSchema, tableName,
        constraintType, enforced);
  }
}
