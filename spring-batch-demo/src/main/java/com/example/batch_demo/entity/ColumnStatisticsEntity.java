package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLUMN_STATISTICS", schema = "information_schema", catalog = "")
public class ColumnStatisticsEntity {

  @Basic
  @Column(name = "SCHEMA_NAME")
  private String schemaName;
  @Basic
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "COLUMN_NAME")
  private String columnName;
  @Basic
  @Column(name = "HISTOGRAM")
  private Object histogram;

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
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

  public Object getHistogram() {
    return histogram;
  }

  public void setHistogram(Object histogram) {
    this.histogram = histogram;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnStatisticsEntity that = (ColumnStatisticsEntity) o;
    return Objects.equals(schemaName, that.schemaName) && Objects.equals(
        tableName, that.tableName) && Objects.equals(columnName, that.columnName)
        && Objects.equals(histogram, that.histogram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaName, tableName, columnName, histogram);
  }
}
