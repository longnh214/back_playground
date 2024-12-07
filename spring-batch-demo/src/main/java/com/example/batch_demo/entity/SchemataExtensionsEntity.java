package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEMATA_EXTENSIONS", schema = "information_schema", catalog = "")
public class SchemataExtensionsEntity {

  @Basic
  @Column(name = "CATALOG_NAME")
  private String catalogName;
  @Basic
  @Column(name = "SCHEMA_NAME")
  private String schemaName;
  @Basic
  @Column(name = "OPTIONS")
  private String options;

  public String getCatalogName() {
    return catalogName;
  }

  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemataExtensionsEntity that = (SchemataExtensionsEntity) o;
    return Objects.equals(catalogName, that.catalogName) && Objects.equals(
        schemaName, that.schemaName) && Objects.equals(options, that.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, schemaName, options);
  }
}
