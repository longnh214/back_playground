package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ROUTINES", schema = "information_schema", catalog = "")
public class RoutinesEntity {

  @Basic
  @Column(name = "SPECIFIC_NAME")
  private String specificName;
  @Basic
  @Column(name = "ROUTINE_CATALOG")
  private String routineCatalog;
  @Basic
  @Column(name = "ROUTINE_SCHEMA")
  private String routineSchema;
  @Basic
  @Column(name = "ROUTINE_NAME")
  private String routineName;
  @Basic
  @Column(name = "ROUTINE_TYPE")
  private Object routineType;
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
  @Column(name = "DTD_IDENTIFIER")
  private String dtdIdentifier;
  @Basic
  @Column(name = "ROUTINE_BODY")
  private String routineBody;
  @Basic
  @Column(name = "ROUTINE_DEFINITION")
  private String routineDefinition;
  @Basic
  @Column(name = "EXTERNAL_NAME")
  private byte[] externalName;
  @Basic
  @Column(name = "EXTERNAL_LANGUAGE")
  private String externalLanguage;
  @Basic
  @Column(name = "PARAMETER_STYLE")
  private String parameterStyle;
  @Basic
  @Column(name = "IS_DETERMINISTIC")
  private String isDeterministic;
  @Basic
  @Column(name = "SQL_DATA_ACCESS")
  private Object sqlDataAccess;
  @Basic
  @Column(name = "SQL_PATH")
  private byte[] sqlPath;
  @Basic
  @Column(name = "SECURITY_TYPE")
  private Object securityType;
  @Basic
  @Column(name = "CREATED")
  private Timestamp created;
  @Basic
  @Column(name = "LAST_ALTERED")
  private Timestamp lastAltered;
  @Basic
  @Column(name = "SQL_MODE")
  private Object sqlMode;
  @Basic
  @Column(name = "ROUTINE_COMMENT")
  private String routineComment;
  @Basic
  @Column(name = "DEFINER")
  private String definer;
  @Basic
  @Column(name = "CHARACTER_SET_CLIENT")
  private String characterSetClient;
  @Basic
  @Column(name = "COLLATION_CONNECTION")
  private String collationConnection;
  @Basic
  @Column(name = "DATABASE_COLLATION")
  private String databaseCollation;

  public String getSpecificName() {
    return specificName;
  }

  public void setSpecificName(String specificName) {
    this.specificName = specificName;
  }

  public String getRoutineCatalog() {
    return routineCatalog;
  }

  public void setRoutineCatalog(String routineCatalog) {
    this.routineCatalog = routineCatalog;
  }

  public String getRoutineSchema() {
    return routineSchema;
  }

  public void setRoutineSchema(String routineSchema) {
    this.routineSchema = routineSchema;
  }

  public String getRoutineName() {
    return routineName;
  }

  public void setRoutineName(String routineName) {
    this.routineName = routineName;
  }

  public Object getRoutineType() {
    return routineType;
  }

  public void setRoutineType(Object routineType) {
    this.routineType = routineType;
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

  public String getDtdIdentifier() {
    return dtdIdentifier;
  }

  public void setDtdIdentifier(String dtdIdentifier) {
    this.dtdIdentifier = dtdIdentifier;
  }

  public String getRoutineBody() {
    return routineBody;
  }

  public void setRoutineBody(String routineBody) {
    this.routineBody = routineBody;
  }

  public String getRoutineDefinition() {
    return routineDefinition;
  }

  public void setRoutineDefinition(String routineDefinition) {
    this.routineDefinition = routineDefinition;
  }

  public byte[] getExternalName() {
    return externalName;
  }

  public void setExternalName(byte[] externalName) {
    this.externalName = externalName;
  }

  public String getExternalLanguage() {
    return externalLanguage;
  }

  public void setExternalLanguage(String externalLanguage) {
    this.externalLanguage = externalLanguage;
  }

  public String getParameterStyle() {
    return parameterStyle;
  }

  public void setParameterStyle(String parameterStyle) {
    this.parameterStyle = parameterStyle;
  }

  public String getIsDeterministic() {
    return isDeterministic;
  }

  public void setIsDeterministic(String isDeterministic) {
    this.isDeterministic = isDeterministic;
  }

  public Object getSqlDataAccess() {
    return sqlDataAccess;
  }

  public void setSqlDataAccess(Object sqlDataAccess) {
    this.sqlDataAccess = sqlDataAccess;
  }

  public byte[] getSqlPath() {
    return sqlPath;
  }

  public void setSqlPath(byte[] sqlPath) {
    this.sqlPath = sqlPath;
  }

  public Object getSecurityType() {
    return securityType;
  }

  public void setSecurityType(Object securityType) {
    this.securityType = securityType;
  }

  public Timestamp getCreated() {
    return created;
  }

  public void setCreated(Timestamp created) {
    this.created = created;
  }

  public Timestamp getLastAltered() {
    return lastAltered;
  }

  public void setLastAltered(Timestamp lastAltered) {
    this.lastAltered = lastAltered;
  }

  public Object getSqlMode() {
    return sqlMode;
  }

  public void setSqlMode(Object sqlMode) {
    this.sqlMode = sqlMode;
  }

  public String getRoutineComment() {
    return routineComment;
  }

  public void setRoutineComment(String routineComment) {
    this.routineComment = routineComment;
  }

  public String getDefiner() {
    return definer;
  }

  public void setDefiner(String definer) {
    this.definer = definer;
  }

  public String getCharacterSetClient() {
    return characterSetClient;
  }

  public void setCharacterSetClient(String characterSetClient) {
    this.characterSetClient = characterSetClient;
  }

  public String getCollationConnection() {
    return collationConnection;
  }

  public void setCollationConnection(String collationConnection) {
    this.collationConnection = collationConnection;
  }

  public String getDatabaseCollation() {
    return databaseCollation;
  }

  public void setDatabaseCollation(String databaseCollation) {
    this.databaseCollation = databaseCollation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutinesEntity that = (RoutinesEntity) o;
    return Objects.equals(specificName, that.specificName) && Objects.equals(
        routineCatalog, that.routineCatalog) && Objects.equals(routineSchema,
        that.routineSchema) && Objects.equals(routineName, that.routineName)
        && Objects.equals(routineType, that.routineType) && Objects.equals(
        dataType, that.dataType) && Objects.equals(characterMaximumLength,
        that.characterMaximumLength) && Objects.equals(characterOctetLength,
        that.characterOctetLength) && Objects.equals(numericPrecision,
        that.numericPrecision) && Objects.equals(numericScale, that.numericScale)
        && Objects.equals(datetimePrecision, that.datetimePrecision)
        && Objects.equals(characterSetName, that.characterSetName)
        && Objects.equals(collationName, that.collationName) && Objects.equals(
        dtdIdentifier, that.dtdIdentifier) && Objects.equals(routineBody, that.routineBody)
        && Objects.equals(routineDefinition, that.routineDefinition)
        && Arrays.equals(externalName, that.externalName) && Objects.equals(
        externalLanguage, that.externalLanguage) && Objects.equals(parameterStyle,
        that.parameterStyle) && Objects.equals(isDeterministic, that.isDeterministic)
        && Objects.equals(sqlDataAccess, that.sqlDataAccess) && Arrays.equals(
        sqlPath, that.sqlPath) && Objects.equals(securityType, that.securityType)
        && Objects.equals(created, that.created) && Objects.equals(lastAltered,
        that.lastAltered) && Objects.equals(sqlMode, that.sqlMode)
        && Objects.equals(routineComment, that.routineComment) && Objects.equals(
        definer, that.definer) && Objects.equals(characterSetClient,
        that.characterSetClient) && Objects.equals(collationConnection,
        that.collationConnection) && Objects.equals(databaseCollation,
        that.databaseCollation);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(specificName, routineCatalog, routineSchema, routineName, routineType,
        dataType, characterMaximumLength, characterOctetLength, numericPrecision, numericScale,
        datetimePrecision, characterSetName, collationName, dtdIdentifier, routineBody,
        routineDefinition, externalLanguage, parameterStyle, isDeterministic, sqlDataAccess,
        securityType, created, lastAltered, sqlMode, routineComment, definer, characterSetClient,
        collationConnection, databaseCollation);
    result = 31 * result + Arrays.hashCode(externalName);
    result = 31 * result + Arrays.hashCode(sqlPath);
    return result;
  }
}
