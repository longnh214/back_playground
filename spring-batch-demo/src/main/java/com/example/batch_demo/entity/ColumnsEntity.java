package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COLUMNS", schema = "information_schema", catalog = "")
public class ColumnsEntity {

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
  @Column(name = "ORDINAL_POSITION")
  private Object ordinalPosition;
  @Basic
  @Column(name = "COLUMN_DEFAULT")
  private String columnDefault;
  @Basic
  @Column(name = "IS_NULLABLE")
  private String isNullable;
  @Basic
  @Column(name = "DATA_TYPE")
  private String dataType;
  @Basic
  @Column(name = "CHARACTER_MAXIMUM_LENGTH")
  private Long characterMaximumLength;
  @Basic
  @Column(name = "CHARACTER_OCTET_LENGTH")
  private Long characterOctetLength;
  @Basic
  @Column(name = "NUMERIC_PRECISION")
  private Object numericPrecision;
  @Basic
  @Column(name = "NUMERIC_SCALE")
  private Object numericScale;
  @Basic
  @Column(name = "DATETIME_PRECISION")
  private Object datetimePrecision;
  @Basic
  @Column(name = "CHARACTER_SET_NAME")
  private String characterSetName;
  @Basic
  @Column(name = "COLLATION_NAME")
  private String collationName;
  @Basic
  @Column(name = "COLUMN_TYPE")
  private String columnType;
  @Basic
  @Column(name = "COLUMN_KEY")
  private Object columnKey;
  @Basic
  @Column(name = "EXTRA")
  private String extra;
  @Basic
  @Column(name = "PRIVILEGES")
  private String privileges;
  @Basic
  @Column(name = "COLUMN_COMMENT")
  private String columnComment;
  @Basic
  @Column(name = "GENERATION_EXPRESSION")
  private String generationExpression;
  @Basic
  @Column(name = "SRS_ID")
  private Object srsId;

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

  public Object getOrdinalPosition() {
    return ordinalPosition;
  }

  public void setOrdinalPosition(Object ordinalPosition) {
    this.ordinalPosition = ordinalPosition;
  }

  public String getColumnDefault() {
    return columnDefault;
  }

  public void setColumnDefault(String columnDefault) {
    this.columnDefault = columnDefault;
  }

  public String getIsNullable() {
    return isNullable;
  }

  public void setIsNullable(String isNullable) {
    this.isNullable = isNullable;
  }

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public Long getCharacterMaximumLength() {
    return characterMaximumLength;
  }

  public void setCharacterMaximumLength(Long characterMaximumLength) {
    this.characterMaximumLength = characterMaximumLength;
  }

  public Long getCharacterOctetLength() {
    return characterOctetLength;
  }

  public void setCharacterOctetLength(Long characterOctetLength) {
    this.characterOctetLength = characterOctetLength;
  }

  public Object getNumericPrecision() {
    return numericPrecision;
  }

  public void setNumericPrecision(Object numericPrecision) {
    this.numericPrecision = numericPrecision;
  }

  public Object getNumericScale() {
    return numericScale;
  }

  public void setNumericScale(Object numericScale) {
    this.numericScale = numericScale;
  }

  public Object getDatetimePrecision() {
    return datetimePrecision;
  }

  public void setDatetimePrecision(Object datetimePrecision) {
    this.datetimePrecision = datetimePrecision;
  }

  public String getCharacterSetName() {
    return characterSetName;
  }

  public void setCharacterSetName(String characterSetName) {
    this.characterSetName = characterSetName;
  }

  public String getCollationName() {
    return collationName;
  }

  public void setCollationName(String collationName) {
    this.collationName = collationName;
  }

  public String getColumnType() {
    return columnType;
  }

  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }

  public Object getColumnKey() {
    return columnKey;
  }

  public void setColumnKey(Object columnKey) {
    this.columnKey = columnKey;
  }

  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public String getPrivileges() {
    return privileges;
  }

  public void setPrivileges(String privileges) {
    this.privileges = privileges;
  }

  public String getColumnComment() {
    return columnComment;
  }

  public void setColumnComment(String columnComment) {
    this.columnComment = columnComment;
  }

  public String getGenerationExpression() {
    return generationExpression;
  }

  public void setGenerationExpression(String generationExpression) {
    this.generationExpression = generationExpression;
  }

  public Object getSrsId() {
    return srsId;
  }

  public void setSrsId(Object srsId) {
    this.srsId = srsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnsEntity that = (ColumnsEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(columnName, that.columnName) && Objects.equals(
        ordinalPosition, that.ordinalPosition) && Objects.equals(columnDefault,
        that.columnDefault) && Objects.equals(isNullable, that.isNullable)
        && Objects.equals(dataType, that.dataType) && Objects.equals(
        characterMaximumLength, that.characterMaximumLength) && Objects.equals(
        characterOctetLength, that.characterOctetLength) && Objects.equals(numericPrecision,
        that.numericPrecision) && Objects.equals(numericScale, that.numericScale)
        && Objects.equals(datetimePrecision, that.datetimePrecision)
        && Objects.equals(characterSetName, that.characterSetName)
        && Objects.equals(collationName, that.collationName) && Objects.equals(
        columnType, that.columnType) && Objects.equals(columnKey, that.columnKey)
        && Objects.equals(extra, that.extra) && Objects.equals(privileges,
        that.privileges) && Objects.equals(columnComment, that.columnComment)
        && Objects.equals(generationExpression, that.generationExpression)
        && Objects.equals(srsId, that.srsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, columnName, ordinalPosition,
        columnDefault, isNullable, dataType, characterMaximumLength, characterOctetLength,
        numericPrecision, numericScale, datetimePrecision, characterSetName, collationName,
        columnType, columnKey, extra, privileges, columnComment, generationExpression, srsId);
  }
}
