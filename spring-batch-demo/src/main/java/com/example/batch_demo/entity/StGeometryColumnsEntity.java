package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ST_GEOMETRY_COLUMNS", schema = "information_schema", catalog = "")
public class StGeometryColumnsEntity {

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
  @Column(name = "SRS_NAME")
  private String srsName;
  @Basic
  @Column(name = "SRS_ID")
  private Object srsId;
  @Basic
  @Column(name = "GEOMETRY_TYPE_NAME")
  private String geometryTypeName;

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

  public String getSrsName() {
    return srsName;
  }

  public void setSrsName(String srsName) {
    this.srsName = srsName;
  }

  public Object getSrsId() {
    return srsId;
  }

  public void setSrsId(Object srsId) {
    this.srsId = srsId;
  }

  public String getGeometryTypeName() {
    return geometryTypeName;
  }

  public void setGeometryTypeName(String geometryTypeName) {
    this.geometryTypeName = geometryTypeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StGeometryColumnsEntity that = (StGeometryColumnsEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(columnName, that.columnName) && Objects.equals(srsName,
        that.srsName) && Objects.equals(srsId, that.srsId) && Objects.equals(
        geometryTypeName, that.geometryTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, columnName, srsName, srsId,
        geometryTypeName);
  }
}
