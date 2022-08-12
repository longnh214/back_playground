package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_ROUTINE_USAGE", schema = "information_schema", catalog = "")
public class ViewRoutineUsageEntity {

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
  @Column(name = "SPECIFIC_CATALOG")
  private String specificCatalog;
  @Basic
  @Column(name = "SPECIFIC_SCHEMA")
  private String specificSchema;
  @Basic
  @Column(name = "SPECIFIC_NAME")
  private String specificName;

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

  public String getSpecificCatalog() {
    return specificCatalog;
  }

  public void setSpecificCatalog(String specificCatalog) {
    this.specificCatalog = specificCatalog;
  }

  public String getSpecificSchema() {
    return specificSchema;
  }

  public void setSpecificSchema(String specificSchema) {
    this.specificSchema = specificSchema;
  }

  public String getSpecificName() {
    return specificName;
  }

  public void setSpecificName(String specificName) {
    this.specificName = specificName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewRoutineUsageEntity that = (ViewRoutineUsageEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(specificCatalog, that.specificCatalog)
        && Objects.equals(specificSchema, that.specificSchema) && Objects.equals(
        specificName, that.specificName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, specificCatalog, specificSchema,
        specificName);
  }
}
