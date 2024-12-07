package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PARAMETERS", schema = "information_schema", catalog = "")
public class ParametersEntity {

  @Basic
  @Column(name = "SPECIFIC_CATALOG")
  private String specificCatalog;
  @Basic
  @Column(name = "SPECIFIC_SCHEMA")
  private String specificSchema;
  @Basic
  @Column(name = "SPECIFIC_NAME")
  private String specificName;
  @Basic
  @Column(name = "ORDINAL_POSITION")
  private Object ordinalPosition;
  @Basic
  @Column(name = "PARAMETER_MODE")
  private String parameterMode;
  @Basic
  @Column(name = "PARAMETER_NAME")
  private String parameterName;
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
  private Long numericScale;
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
  @Column(name = "DTD_IDENTIFIER")
  private String dtdIdentifier;
  @Basic
  @Column(name = "ROUTINE_TYPE")
  private Object routineType;

  public String getSpecificCatalog() {
    return specificCatalog;
  }

  public void setSpecificCatalog(String specificCatalog) {
    this.specificCatalog = specificCatalog;
  }

  public String getSpecificSchema() {
    return specificSchema;
  }

  public void setSpecificSchema(String specificSchema) {
    this.specificSchema = specificSchema;
  }

  public String getSpecificName() {
    return specificName;
  }

  public void setSpecificName(String specificName) {
    this.specificName = specificName;
  }

  public Object getOrdinalPosition() {
    return ordinalPosition;
  }

  public void setOrdinalPosition(Object ordinalPosition) {
    this.ordinalPosition = ordinalPosition;
  }

  public String getParameterMode() {
    return parameterMode;
  }

  public void setParameterMode(String parameterMode) {
    this.parameterMode = parameterMode;
  }

  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
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

  public Long getNumericScale() {
    return numericScale;
  }

  public void setNumericScale(Long numericScale) {
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

  public String getDtdIdentifier() {
    return dtdIdentifier;
  }

  public void setDtdIdentifier(String dtdIdentifier) {
    this.dtdIdentifier = dtdIdentifier;
  }

  public Object getRoutineType() {
    return routineType;
  }

  public void setRoutineType(Object routineType) {
    this.routineType = routineType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametersEntity that = (ParametersEntity) o;
    return Objects.equals(specificCatalog, that.specificCatalog)
        && Objects.equals(specificSchema, that.specificSchema) && Objects.equals(
        specificName, that.specificName) && Objects.equals(ordinalPosition,
        that.ordinalPosition) && Objects.equals(parameterMode, that.parameterMode)
        && Objects.equals(parameterName, that.parameterName) && Objects.equals(
        dataType, that.dataType) && Objects.equals(characterMaximumLength,
        that.characterMaximumLength) && Objects.equals(characterOctetLength,
        that.characterOctetLength) && Objects.equals(numericPrecision,
        that.numericPrecision) && Objects.equals(numericScale, that.numericScale)
        && Objects.equals(datetimePrecision, that.datetimePrecision)
        && Objects.equals(characterSetName, that.characterSetName)
        && Objects.equals(collationName, that.collationName) && Objects.equals(
        dtdIdentifier, that.dtdIdentifier) && Objects.equals(routineType, that.routineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specificCatalog, specificSchema, specificName, ordinalPosition,
        parameterMode,
        parameterName, dataType, characterMaximumLength, characterOctetLength, numericPrecision,
        numericScale, datetimePrecision, characterSetName, collationName, dtdIdentifier,
        routineType);
  }
}
