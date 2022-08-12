package com.example.batch_demo.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STATISTICS", schema = "information_schema", catalog = "")
public class StatisticsEntity {

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
  @Column(name = "NON_UNIQUE")
  private int nonUnique;
  @Basic
  @Column(name = "INDEX_SCHEMA")
  private String indexSchema;
  @Basic
  @Column(name = "INDEX_NAME")
  private String indexName;
  @Basic
  @Column(name = "SEQ_IN_INDEX")
  private Object seqInIndex;
  @Basic
  @Column(name = "COLUMN_NAME")
  private String columnName;
  @Basic
  @Column(name = "COLLATION")
  private String collation;
  @Basic
  @Column(name = "CARDINALITY")
  private Long cardinality;
  @Basic
  @Column(name = "SUB_PART")
  private Long subPart;
  @Basic
  @Column(name = "PACKED")
  private byte[] packed;
  @Basic
  @Column(name = "NULLABLE")
  private String nullable;
  @Basic
  @Column(name = "INDEX_TYPE")
  private String indexType;
  @Basic
  @Column(name = "COMMENT")
  private String comment;
  @Basic
  @Column(name = "INDEX_COMMENT")
  private String indexComment;
  @Basic
  @Column(name = "IS_VISIBLE")
  private String isVisible;
  @Basic
  @Column(name = "EXPRESSION")
  private String expression;

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

  public int getNonUnique() {
    return nonUnique;
  }

  public void setNonUnique(int nonUnique) {
    this.nonUnique = nonUnique;
  }

  public String getIndexSchema() {
    return indexSchema;
  }

  public void setIndexSchema(String indexSchema) {
    this.indexSchema = indexSchema;
  }

  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public Object getSeqInIndex() {
    return seqInIndex;
  }

  public void setSeqInIndex(Object seqInIndex) {
    this.seqInIndex = seqInIndex;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public String getCollation() {
    return collation;
  }

  public void setCollation(String collation) {
    this.collation = collation;
  }

  public Long getCardinality() {
    return cardinality;
  }

  public void setCardinality(Long cardinality) {
    this.cardinality = cardinality;
  }

  public Long getSubPart() {
    return subPart;
  }

  public void setSubPart(Long subPart) {
    this.subPart = subPart;
  }

  public byte[] getPacked() {
    return packed;
  }

  public void setPacked(byte[] packed) {
    this.packed = packed;
  }

  public String getNullable() {
    return nullable;
  }

  public void setNullable(String nullable) {
    this.nullable = nullable;
  }

  public String getIndexType() {
    return indexType;
  }

  public void setIndexType(String indexType) {
    this.indexType = indexType;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getIndexComment() {
    return indexComment;
  }

  public void setIndexComment(String indexComment) {
    this.indexComment = indexComment;
  }

  public String getIsVisible() {
    return isVisible;
  }

  public void setIsVisible(String isVisible) {
    this.isVisible = isVisible;
  }

  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsEntity that = (StatisticsEntity) o;
    return nonUnique == that.nonUnique && Objects.equals(tableCatalog, that.tableCatalog)
        && Objects.equals(tableSchema, that.tableSchema) && Objects.equals(
        tableName, that.tableName) && Objects.equals(indexSchema, that.indexSchema)
        && Objects.equals(indexName, that.indexName) && Objects.equals(seqInIndex,
        that.seqInIndex) && Objects.equals(columnName, that.columnName)
        && Objects.equals(collation, that.collation) && Objects.equals(
        cardinality, that.cardinality) && Objects.equals(subPart, that.subPart)
        && Arrays.equals(packed, that.packed) && Objects.equals(nullable,
        that.nullable) && Objects.equals(indexType, that.indexType)
        && Objects.equals(comment, that.comment) && Objects.equals(indexComment,
        that.indexComment) && Objects.equals(isVisible, that.isVisible)
        && Objects.equals(expression, that.expression);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(tableCatalog, tableSchema, tableName, nonUnique, indexSchema,
        indexName,
        seqInIndex, columnName, collation, cardinality, subPart, nullable, indexType, comment,
        indexComment, isVisible, expression);
    result = 31 * result + Arrays.hashCode(packed);
    return result;
  }
}
