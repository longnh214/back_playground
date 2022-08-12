package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CHECK_CONSTRAINTS", schema = "information_schema", catalog = "")
public class CheckConstraintsEntity {

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
  @Column(name = "CHECK_CLAUSE")
  private String checkClause;

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

  public String getCheckClause() {
    return checkClause;
  }

  public void setCheckClause(String checkClause) {
    this.checkClause = checkClause;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckConstraintsEntity that = (CheckConstraintsEntity) o;
    return Objects.equals(constraintCatalog, that.constraintCatalog)
        && Objects.equals(constraintSchema, that.constraintSchema)
        && Objects.equals(constraintName, that.constraintName) && Objects.equals(
        checkClause, that.checkClause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintCatalog, constraintSchema, constraintName, checkClause);
  }
}
