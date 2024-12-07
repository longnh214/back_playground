package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EVENTS", schema = "information_schema", catalog = "")
public class EventsEntity {

  @Basic
  @Column(name = "EVENT_CATALOG")
  private String eventCatalog;
  @Basic
  @Column(name = "EVENT_SCHEMA")
  private String eventSchema;
  @Basic
  @Column(name = "EVENT_NAME")
  private String eventName;
  @Basic
  @Column(name = "DEFINER")
  private String definer;
  @Basic
  @Column(name = "TIME_ZONE")
  private String timeZone;
  @Basic
  @Column(name = "EVENT_BODY")
  private String eventBody;
  @Basic
  @Column(name = "EVENT_DEFINITION")
  private String eventDefinition;
  @Basic
  @Column(name = "EVENT_TYPE")
  private String eventType;
  @Basic
  @Column(name = "EXECUTE_AT")
  private Timestamp executeAt;
  @Basic
  @Column(name = "INTERVAL_VALUE")
  private String intervalValue;
  @Basic
  @Column(name = "INTERVAL_FIELD")
  private Object intervalField;
  @Basic
  @Column(name = "SQL_MODE")
  private Object sqlMode;
  @Basic
  @Column(name = "STARTS")
  private Timestamp starts;
  @Basic
  @Column(name = "ENDS")
  private Timestamp ends;
  @Basic
  @Column(name = "STATUS")
  private Object status;
  @Basic
  @Column(name = "ON_COMPLETION")
  private String onCompletion;
  @Basic
  @Column(name = "CREATED")
  private Timestamp created;
  @Basic
  @Column(name = "LAST_ALTERED")
  private Timestamp lastAltered;
  @Basic
  @Column(name = "LAST_EXECUTED")
  private Timestamp lastExecuted;
  @Basic
  @Column(name = "EVENT_COMMENT")
  private String eventComment;
  @Basic
  @Column(name = "ORIGINATOR")
  private Object originator;
  @Basic
  @Column(name = "CHARACTER_SET_CLIENT")
  private String characterSetClient;
  @Basic
  @Column(name = "COLLATION_CONNECTION")
  private String collationConnection;
  @Basic
  @Column(name = "DATABASE_COLLATION")
  private String databaseCollation;

  public String getEventCatalog() {
    return eventCatalog;
  }

  public void setEventCatalog(String eventCatalog) {
    this.eventCatalog = eventCatalog;
  }

  public String getEventSchema() {
    return eventSchema;
  }

  public void setEventSchema(String eventSchema) {
    this.eventSchema = eventSchema;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getDefiner() {
    return definer;
  }

  public void setDefiner(String definer) {
    this.definer = definer;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getEventBody() {
    return eventBody;
  }

  public void setEventBody(String eventBody) {
    this.eventBody = eventBody;
  }

  public String getEventDefinition() {
    return eventDefinition;
  }

  public void setEventDefinition(String eventDefinition) {
    this.eventDefinition = eventDefinition;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Timestamp getExecuteAt() {
    return executeAt;
  }

  public void setExecuteAt(Timestamp executeAt) {
    this.executeAt = executeAt;
  }

  public String getIntervalValue() {
    return intervalValue;
  }

  public void setIntervalValue(String intervalValue) {
    this.intervalValue = intervalValue;
  }

  public Object getIntervalField() {
    return intervalField;
  }

  public void setIntervalField(Object intervalField) {
    this.intervalField = intervalField;
  }

  public Object getSqlMode() {
    return sqlMode;
  }

  public void setSqlMode(Object sqlMode) {
    this.sqlMode = sqlMode;
  }

  public Timestamp getStarts() {
    return starts;
  }

  public void setStarts(Timestamp starts) {
    this.starts = starts;
  }

  public Timestamp getEnds() {
    return ends;
  }

  public void setEnds(Timestamp ends) {
    this.ends = ends;
  }

  public Object getStatus() {
    return status;
  }

  public void setStatus(Object status) {
    this.status = status;
  }

  public String getOnCompletion() {
    return onCompletion;
  }

  public void setOnCompletion(String onCompletion) {
    this.onCompletion = onCompletion;
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

  public Timestamp getLastExecuted() {
    return lastExecuted;
  }

  public void setLastExecuted(Timestamp lastExecuted) {
    this.lastExecuted = lastExecuted;
  }

  public String getEventComment() {
    return eventComment;
  }

  public void setEventComment(String eventComment) {
    this.eventComment = eventComment;
  }

  public Object getOriginator() {
    return originator;
  }

  public void setOriginator(Object originator) {
    this.originator = originator;
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
    EventsEntity that = (EventsEntity) o;
    return Objects.equals(eventCatalog, that.eventCatalog) && Objects.equals(
        eventSchema, that.eventSchema) && Objects.equals(eventName, that.eventName)
        && Objects.equals(definer, that.definer) && Objects.equals(timeZone,
        that.timeZone) && Objects.equals(eventBody, that.eventBody)
        && Objects.equals(eventDefinition, that.eventDefinition)
        && Objects.equals(eventType, that.eventType) && Objects.equals(executeAt,
        that.executeAt) && Objects.equals(intervalValue, that.intervalValue)
        && Objects.equals(intervalField, that.intervalField) && Objects.equals(
        sqlMode, that.sqlMode) && Objects.equals(starts, that.starts)
        && Objects.equals(ends, that.ends) && Objects.equals(status, that.status)
        && Objects.equals(onCompletion, that.onCompletion) && Objects.equals(
        created, that.created) && Objects.equals(lastAltered, that.lastAltered)
        && Objects.equals(lastExecuted, that.lastExecuted) && Objects.equals(
        eventComment, that.eventComment) && Objects.equals(originator, that.originator)
        && Objects.equals(characterSetClient, that.characterSetClient)
        && Objects.equals(collationConnection, that.collationConnection)
        && Objects.equals(databaseCollation, that.databaseCollation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCatalog, eventSchema, eventName, definer, timeZone, eventBody,
        eventDefinition, eventType, executeAt, intervalValue, intervalField, sqlMode, starts, ends,
        status, onCompletion, created, lastAltered, lastExecuted, eventComment, originator,
        characterSetClient, collationConnection, databaseCollation);
  }
}
