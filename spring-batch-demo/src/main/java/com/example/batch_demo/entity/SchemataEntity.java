package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEMATA", schema = "information_schema", catalog = "")
public class SchemataEntity {

  @Basic
  @Column(name = "CATALOG_NAME")
  private String catalogName;
  @Basic
  @Column(name = "SCHEMA_NAME")
  private String schemaName;
  @Basic
  @Column(name = "DEFAULT_CHARACTER_SET_NAME")
  private String defaultCharacterSetName;
  @Basic
  @Column(name = "DEFAULT_COLLATION_NAME")
  private String defaultCollationName;
  @Basic
  @Column(name = "SQL_PATH")
  private byte[] sqlPath;
  @Basic
  @Column(name = "DEFAULT_ENCRYPTION")
  private Object defaultEncryption;

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

  public String getDefaultCharacterSetName() {
    return defaultCharacterSetName;
  }

  public void setDefaultCharacterSetName(String defaultCharacterSetName) {
    this.defaultCharacterSetName = defaultCharacterSetName;
  }

  public String getDefaultCollationName() {
    return defaultCollationName;
  }

  public void setDefaultCollationName(String defaultCollationName) {
    this.defaultCollationName = defaultCollationName;
  }

  public byte[] getSqlPath() {
    return sqlPath;
  }

  public void setSqlPath(byte[] sqlPath) {
    this.sqlPath = sqlPath;
  }

  public Object getDefaultEncryption() {
    return defaultEncryption;
  }

  public void setDefaultEncryption(Object defaultEncryption) {
    this.defaultEncryption = defaultEncryption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemataEntity that = (SchemataEntity) o;
    return Objects.equals(catalogName, that.catalogName) && Objects.equals(
        schemaName, that.schemaName) && Objects.equals(defaultCharacterSetName,
        that.defaultCharacterSetName) && Objects.equals(defaultCollationName,
        that.defaultCollationName) && Arrays.equals(sqlPath, that.sqlPath)
        && Objects.equals(defaultEncryption, that.defaultEncryption);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(catalogName, schemaName, defaultCharacterSetName,
        defaultCollationName,
        defaultEncryption);
    result = 31 * result + Arrays.hashCode(sqlPath);
    return result;
  }
}
