package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KEY_COLUMN_USAGE", schema = "information_schema", catalog = "")
public class KeyColumnUsageEntity {

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
  @Column(name = "TABLE_CATALOG")
  private String tableCatalog;
  @Basic
  @Column(name = "TABLE_SCHEMA")
  private String tableSchema;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "COLUMN_NAME")
  private String columnName;
  @Basic
  @Column(name = "ORDINAL_POSITION")
  private Object ordinalPosition;
  @Basic
  @Column(name = "POSITION_IN_UNIQUE_CONSTRAINT")
  private Object positionInUniqueConstraint;
  @Basic
  @Column(name = "REFERENCED_TABLE_SCHEMA")
  private String referencedTableSchema;
  @Basic
  @Column(name = "REFERENCED_TABLE_NAME")
  private String referencedTableName;
  @Basic
  @Column(name = "REFERENCED_COLUMN_NAME")
  private String referencedColumnName;

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

  public String getTableCatalog() {
    return tableCatalog;
  }

  public void setTableCatalog(String tableCatalog) {
    this.tableCatalog = tableCatalog;
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

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public Object getOrdinalPosition() {
    return ordinalPosition;
  }

  public void setOrdinalPosition(Object ordinalPosition) {
    this.ordinalPosition = ordinalPosition;
  }

  public Object getPositionInUniqueConstraint() {
    return positionInUniqueConstraint;
  }

  public void setPositionInUniqueConstraint(Object positionInUniqueConstraint) {
    this.positionInUniqueConstraint = positionInUniqueConstraint;
  }

  public String getReferencedTableSchema() {
    return referencedTableSchema;
  }

  public void setReferencedTableSchema(String referencedTableSchema) {
    this.referencedTableSchema = referencedTableSchema;
  }

  public String getReferencedTableName() {
    return referencedTableName;
  }

  public void setReferencedTableName(String referencedTableName) {
    this.referencedTableName = referencedTableName;
  }

  public String getReferencedColumnName() {
    return referencedColumnName;
  }

  public void setReferencedColumnName(String referencedColumnName) {
    this.referencedColumnName = referencedColumnName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyColumnUsageEntity that = (KeyColumnUsageEntity) o;
    return Objects.equals(constraintCatalog, that.constraintCatalog)
        && Objects.equals(constraintSchema, that.constraintSchema)
        && Objects.equals(constraintName, that.constraintName) && Objects.equals(
        tableCatalog, that.tableCatalog) && Objects.equals(tableSchema, that.tableSchema)
        && Objects.equals(tableName, that.tableName) && Objects.equals(columnName,
        that.columnName) && Objects.equals(ordinalPosition, that.ordinalPosition)
        && Objects.equals(positionInUniqueConstraint, that.positionInUniqueConstraint)
        && Objects.equals(referencedTableSchema, that.referencedTableSchema)
        && Objects.equals(referencedTableName, that.referencedTableName)
        && Objects.equals(referencedColumnName, that.referencedColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintCatalog, constraintSchema, constraintName, tableCatalog,
        tableSchema, tableName, columnName, ordinalPosition, positionInUniqueConstraint,
        referencedTableSchema, referencedTableName, referencedColumnName);
  }
}
