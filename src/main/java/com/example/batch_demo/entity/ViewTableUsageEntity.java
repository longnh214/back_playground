package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_TABLE_USAGE", schema = "information_schema", catalog = "")
public class ViewTableUsageEntity {

  @Basic
  @Column(name = "VIEW_CATALOG")
  private String viewCatalog;
  @Basic
  @Column(name = "VIEW_SCHEMA")
  private String viewSchema;
  @Basic
  @Column(name = "VIEW_NAME")
  private String viewName;
  @Basic
  @Column(name = "TABLE_CATALOG")
  private String tableCatalog;
  @Basic
  @Column(name = "TABLE_SCHEMA")
  private String tableSchema;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;

  public String getViewCatalog() {
    return viewCatalog;
  }

  public void setViewCatalog(String viewCatalog) {
    this.viewCatalog = viewCatalog;
  }

  public String getViewSchema() {
    return viewSchema;
  }

  public void setViewSchema(String viewSchema) {
    this.viewSchema = viewSchema;
  }

  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewTableUsageEntity that = (ViewTableUsageEntity) o;
    return Objects.equals(viewCatalog, that.viewCatalog) && Objects.equals(
        viewSchema, that.viewSchema) && Objects.equals(viewName, that.viewName)
        && Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewCatalog, viewSchema, viewName, tableCatalog, tableSchema, tableName);
  }
}
