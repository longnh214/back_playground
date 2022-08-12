package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRIGGERS", schema = "information_schema", catalog = "")
public class TriggersEntity {

  @Basic
  @Column(name = "TRIGGER_CATALOG")
  private String triggerCatalog;
  @Basic
  @Column(name = "TRIGGER_SCHEMA")
  private String triggerSchema;
  @Basic
  @Column(name = "TRIGGER_NAME")
  private String triggerName;
  @Basic
  @Column(name = "EVENT_MANIPULATION")
  private Object eventManipulation;
  @Basic
  @Column(name = "EVENT_OBJECT_CATALOG")
  private String eventObjectCatalog;
  @Basic
  @Column(name = "EVENT_OBJECT_SCHEMA")
  private String eventObjectSchema;
  @Basic
  @Column(name = "EVENT_OBJECT_TABLE")
  private String eventObjectTable;
  @Basic
  @Column(name = "ACTION_ORDER")
  private Object actionOrder;
  @Basic
  @Column(name = "ACTION_CONDITION")
  private byte[] actionCondition;
  @Basic
  @Column(name = "ACTION_STATEMENT")
  private String actionStatement;
  @Basic
  @Column(name = "ACTION_ORIENTATION")
  private String actionOrientation;
  @Basic
  @Column(name = "ACTION_TIMING")
  private Object actionTiming;
  @Basic
  @Column(name = "ACTION_REFERENCE_OLD_TABLE")
  private byte[] actionReferenceOldTable;
  @Basic
  @Column(name = "ACTION_REFERENCE_NEW_TABLE")
  private byte[] actionReferenceNewTable;
  @Basic
  @Column(name = "ACTION_REFERENCE_OLD_ROW")
  private String actionReferenceOldRow;
  @Basic
  @Column(name = "ACTION_REFERENCE_NEW_ROW")
  private String actionReferenceNewRow;
  @Basic
  @Column(name = "CREATED")
  private Timestamp created;
  @Basic
  @Column(name = "SQL_MODE")
  private Object sqlMode;
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

  public String getTriggerCatalog() {
    return triggerCatalog;
  }

  public void setTriggerCatalog(String triggerCatalog) {
    this.triggerCatalog = triggerCatalog;
  }

  public String getTriggerSchema() {
    return triggerSchema;
  }

  public void setTriggerSchema(String triggerSchema) {
    this.triggerSchema = triggerSchema;
  }

  public String getTriggerName() {
    return triggerName;
  }

  public void setTriggerName(String triggerName) {
    this.triggerName = triggerName;
  }

  public Object getEventManipulation() {
    return eventManipulation;
  }

  public void setEventManipulation(Object eventManipulation) {
    this.eventManipulation = eventManipulation;
  }

  public String getEventObjectCatalog() {
    return eventObjectCatalog;
  }

  public void setEventObjectCatalog(String eventObjectCatalog) {
    this.eventObjectCatalog = eventObjectCatalog;
  }

  public String getEventObjectSchema() {
    return eventObjectSchema;
  }

  public void setEventObjectSchema(String eventObjectSchema) {
    this.eventObjectSchema = eventObjectSchema;
  }

  public String getEventObjectTable() {
    return eventObjectTable;
  }

  public void setEventObjectTable(String eventObjectTable) {
    this.eventObjectTable = eventObjectTable;
  }

  public Object getActionOrder() {
    return actionOrder;
  }

  public void setActionOrder(Object actionOrder) {
    this.actionOrder = actionOrder;
  }

  public byte[] getActionCondition() {
    return actionCondition;
  }

  public void setActionCondition(byte[] actionCondition) {
    this.actionCondition = actionCondition;
  }

  public String getActionStatement() {
    return actionStatement;
  }

  public void setActionStatement(String actionStatement) {
    this.actionStatement = actionStatement;
  }

  public String getActionOrientation() {
    return actionOrientation;
  }

  public void setActionOrientation(String actionOrientation) {
    this.actionOrientation = actionOrientation;
  }

  public Object getActionTiming() {
    return actionTiming;
  }

  public void setActionTiming(Object actionTiming) {
    this.actionTiming = actionTiming;
  }

  public byte[] getActionReferenceOldTable() {
    return actionReferenceOldTable;
  }

  public void setActionReferenceOldTable(byte[] actionReferenceOldTable) {
    this.actionReferenceOldTable = actionReferenceOldTable;
  }

  public byte[] getActionReferenceNewTable() {
    return actionReferenceNewTable;
  }

  public void setActionReferenceNewTable(byte[] actionReferenceNewTable) {
    this.actionReferenceNewTable = actionReferenceNewTable;
  }

  public String getActionReferenceOldRow() {
    return actionReferenceOldRow;
  }

  public void setActionReferenceOldRow(String actionReferenceOldRow) {
    this.actionReferenceOldRow = actionReferenceOldRow;
  }

  public String getActionReferenceNewRow() {
    return actionReferenceNewRow;
  }

  public void setActionReferenceNewRow(String actionReferenceNewRow) {
    this.actionReferenceNewRow = actionReferenceNewRow;
  }

  public Timestamp getCreated() {
    return created;
  }

  public void setCreated(Timestamp created) {
    this.created = created;
  }

  public Object getSqlMode() {
    return sqlMode;
  }

  public void setSqlMode(Object sqlMode) {
    this.sqlMode = sqlMode;
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
    TriggersEntity that = (TriggersEntity) o;
    return Objects.equals(triggerCatalog, that.triggerCatalog) && Objects.equals(
        triggerSchema, that.triggerSchema) && Objects.equals(triggerName, that.triggerName)
        && Objects.equals(eventManipulation, that.eventManipulation)
        && Objects.equals(eventObjectCatalog, that.eventObjectCatalog)
        && Objects.equals(eventObjectSchema, that.eventObjectSchema)
        && Objects.equals(eventObjectTable, that.eventObjectTable)
        && Objects.equals(actionOrder, that.actionOrder) && Arrays.equals(
        actionCondition, that.actionCondition) && Objects.equals(actionStatement,
        that.actionStatement) && Objects.equals(actionOrientation, that.actionOrientation)
        && Objects.equals(actionTiming, that.actionTiming) && Arrays.equals(
        actionReferenceOldTable, that.actionReferenceOldTable) && Arrays.equals(
        actionReferenceNewTable, that.actionReferenceNewTable) && Objects.equals(
        actionReferenceOldRow, that.actionReferenceOldRow) && Objects.equals(
        actionReferenceNewRow, that.actionReferenceNewRow) && Objects.equals(created,
        that.created) && Objects.equals(sqlMode, that.sqlMode) && Objects.equals(
        definer, that.definer) && Objects.equals(characterSetClient,
        that.characterSetClient) && Objects.equals(collationConnection,
        that.collationConnection) && Objects.equals(databaseCollation,
        that.databaseCollation);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(triggerCatalog, triggerSchema, triggerName, eventManipulation,
        eventObjectCatalog, eventObjectSchema, eventObjectTable, actionOrder, actionStatement,
        actionOrientation, actionTiming, actionReferenceOldRow, actionReferenceNewRow, created,
        sqlMode, definer, characterSetClient, collationConnection, databaseCollation);
    result = 31 * result + Arrays.hashCode(actionCondition);
    result = 31 * result + Arrays.hashCode(actionReferenceOldTable);
    result = 31 * result + Arrays.hashCode(actionReferenceNewTable);
    return result;
  }
}
