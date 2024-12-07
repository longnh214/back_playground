package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TABLE_CONSTRAINTS_EXTENSIONS", schema = "information_schema", catalog = "")
public class TableConstraintsExtensionsEntity {

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
  @Column(name = "TABLE_NAME")
  private String tableName;
  @Basic
  @Column(name = "ENGINE_ATTRIBUTE")
  private Object engineAttribute;
  @Basic
  @Column(name = "SECONDARY_ENGINE_ATTRIBUTE")
  private Object secondaryEngineAttribute;

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
    TableConstraintsExtensionsEntity that = (TableConstraintsExtensionsEntity) o;
    return Objects.equals(constraintCatalog, that.constraintCatalog)
        && Objects.equals(constraintSchema, that.constraintSchema)
        && Objects.equals(constraintName, that.constraintName) && Objects.equals(
        tableName, that.tableName) && Objects.equals(engineAttribute, that.engineAttribute)
        && Objects.equals(secondaryEngineAttribute, that.secondaryEngineAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintCatalog, constraintSchema, constraintName, tableName,
        engineAttribute, secondaryEngineAttribute);
  }
}
