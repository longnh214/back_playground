package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLES_EXTENSIONS", schema = "information_schema", catalog = "")
public class TablesExtensionsEntity {

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
  @Column(name = "ENGINE_ATTRIBUTE")
  private Object engineAttribute;
  @Basic
  @Column(name = "SECONDARY_ENGINE_ATTRIBUTE")
  private Object secondaryEngineAttribute;

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

  public Object getEngineAttribute() {
    return engineAttribute;
  }

  public void setEngineAttribute(Object engineAttribute) {
    this.engineAttribute = engineAttribute;
  }

  public Object getSecondaryEngineAttribute() {
    return secondaryEngineAttribute;
  }

  public void setSecondaryEngineAttribute(Object secondaryEngineAttribute) {
    this.secondaryEngineAttribute = secondaryEngineAttribute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TablesExtensionsEntity that = (TablesExtensionsEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(engineAttribute, that.engineAttribute)
        && Objects.equals(secondaryEngineAttribute, that.secondaryEngineAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, engineAttribute,
        secondaryEngineAttribute);
  }
}
