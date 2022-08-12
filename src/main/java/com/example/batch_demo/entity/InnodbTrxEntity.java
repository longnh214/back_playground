package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_TRX", schema = "information_schema", catalog = "")
public class InnodbTrxEntity {

  @Basic
  @Column(name = "trx_id")
  private Object trxId;
  @Basic
  @Column(name = "trx_state")
  private String trxState;
  @Basic
  @Column(name = "trx_started")
  private Timestamp trxStarted;
  @Basic
  @Column(name = "trx_requested_lock_id")
  private String trxRequestedLockId;
  @Basic
  @Column(name = "trx_wait_started")
  private Timestamp trxWaitStarted;
  @Basic
  @Column(name = "trx_weight")
  private Object trxWeight;
  @Basic
  @Column(name = "trx_mysql_thread_id")
  private Object trxMysqlThreadId;
  @Basic
  @Column(name = "trx_query")
  private String trxQuery;
  @Basic
  @Column(name = "trx_operation_state")
  private String trxOperationState;
  @Basic
  @Column(name = "trx_tables_in_use")
  private Object trxTablesInUse;
  @Basic
  @Column(name = "trx_tables_locked")
  private Object trxTablesLocked;
  @Basic
  @Column(name = "trx_lock_structs")
  private Object trxLockStructs;
  @Basic
  @Column(name = "trx_lock_memory_bytes")
  private Object trxLockMemoryBytes;
  @Basic
  @Column(name = "trx_rows_locked")
  private Object trxRowsLocked;
  @Basic
  @Column(name = "trx_rows_modified")
  private Object trxRowsModified;
  @Basic
  @Column(name = "trx_concurrency_tickets")
  private Object trxConcurrencyTickets;
  @Basic
  @Column(name = "trx_isolation_level")
  private String trxIsolationLevel;
  @Basic
  @Column(name = "trx_unique_checks")
  private int trxUniqueChecks;
  @Basic
  @Column(name = "trx_foreign_key_checks")
  private int trxForeignKeyChecks;
  @Basic
  @Column(name = "trx_last_foreign_key_error")
  private String trxLastForeignKeyError;
  @Basic
  @Column(name = "trx_adaptive_hash_latched")
  private int trxAdaptiveHashLatched;
  @Basic
  @Column(name = "trx_adaptive_hash_timeout")
  private Object trxAdaptiveHashTimeout;
  @Basic
  @Column(name = "trx_is_read_only")
  private int trxIsReadOnly;
  @Basic
  @Column(name = "trx_autocommit_non_locking")
  private int trxAutocommitNonLocking;
  @Basic
  @Column(name = "trx_schedule_weight")
  private Object trxScheduleWeight;

  public Object getTrxId() {
    return trxId;
  }

  public void setTrxId(Object trxId) {
    this.trxId = trxId;
  }

  public String getTrxState() {
    return trxState;
  }

  public void setTrxState(String trxState) {
    this.trxState = trxState;
  }

  public Timestamp getTrxStarted() {
    return trxStarted;
  }

  public void setTrxStarted(Timestamp trxStarted) {
    this.trxStarted = trxStarted;
  }

  public String getTrxRequestedLockId() {
    return trxRequestedLockId;
  }

  public void setTrxRequestedLockId(String trxRequestedLockId) {
    this.trxRequestedLockId = trxRequestedLockId;
  }

  public Timestamp getTrxWaitStarted() {
    return trxWaitStarted;
  }

  public void setTrxWaitStarted(Timestamp trxWaitStarted) {
    this.trxWaitStarted = trxWaitStarted;
  }

  public Object getTrxWeight() {
    return trxWeight;
  }

  public void setTrxWeight(Object trxWeight) {
    this.trxWeight = trxWeight;
  }

  public Object getTrxMysqlThreadId() {
    return trxMysqlThreadId;
  }

  public void setTrxMysqlThreadId(Object trxMysqlThreadId) {
    this.trxMysqlThreadId = trxMysqlThreadId;
  }

  public String getTrxQuery() {
    return trxQuery;
  }

  public void setTrxQuery(String trxQuery) {
    this.trxQuery = trxQuery;
  }

  public String getTrxOperationState() {
    return trxOperationState;
  }

  public void setTrxOperationState(String trxOperationState) {
    this.trxOperationState = trxOperationState;
  }

  public Object getTrxTablesInUse() {
    return trxTablesInUse;
  }

  public void setTrxTablesInUse(Object trxTablesInUse) {
    this.trxTablesInUse = trxTablesInUse;
  }

  public Object getTrxTablesLocked() {
    return trxTablesLocked;
  }

  public void setTrxTablesLocked(Object trxTablesLocked) {
    this.trxTablesLocked = trxTablesLocked;
  }

  public Object getTrxLockStructs() {
    return trxLockStructs;
  }

  public void setTrxLockStructs(Object trxLockStructs) {
    this.trxLockStructs = trxLockStructs;
  }

  public Object getTrxLockMemoryBytes() {
    return trxLockMemoryBytes;
  }

  public void setTrxLockMemoryBytes(Object trxLockMemoryBytes) {
    this.trxLockMemoryBytes = trxLockMemoryBytes;
  }

  public Object getTrxRowsLocked() {
    return trxRowsLocked;
  }

  public void setTrxRowsLocked(Object trxRowsLocked) {
    this.trxRowsLocked = trxRowsLocked;
  }

  public Object getTrxRowsModified() {
    return trxRowsModified;
  }

  public void setTrxRowsModified(Object trxRowsModified) {
    this.trxRowsModified = trxRowsModified;
  }

  public Object getTrxConcurrencyTickets() {
    return trxConcurrencyTickets;
  }

  public void setTrxConcurrencyTickets(Object trxConcurrencyTickets) {
    this.trxConcurrencyTickets = trxConcurrencyTickets;
  }

  public String getTrxIsolationLevel() {
    return trxIsolationLevel;
  }

  public void setTrxIsolationLevel(String trxIsolationLevel) {
    this.trxIsolationLevel = trxIsolationLevel;
  }

  public int getTrxUniqueChecks() {
    return trxUniqueChecks;
  }

  public void setTrxUniqueChecks(int trxUniqueChecks) {
    this.trxUniqueChecks = trxUniqueChecks;
  }

  public int getTrxForeignKeyChecks() {
    return trxForeignKeyChecks;
  }

  public void setTrxForeignKeyChecks(int trxForeignKeyChecks) {
    this.trxForeignKeyChecks = trxForeignKeyChecks;
  }

  public String getTrxLastForeignKeyError() {
    return trxLastForeignKeyError;
  }

  public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
    this.trxLastForeignKeyError = trxLastForeignKeyError;
  }

  public int getTrxAdaptiveHashLatched() {
    return trxAdaptiveHashLatched;
  }

  public void setTrxAdaptiveHashLatched(int trxAdaptiveHashLatched) {
    this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
  }

  public Object getTrxAdaptiveHashTimeout() {
    return trxAdaptiveHashTimeout;
  }

  public void setTrxAdaptiveHashTimeout(Object trxAdaptiveHashTimeout) {
    this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
  }

  public int getTrxIsReadOnly() {
    return trxIsReadOnly;
  }

  public void setTrxIsReadOnly(int trxIsReadOnly) {
    this.trxIsReadOnly = trxIsReadOnly;
  }

  public int getTrxAutocommitNonLocking() {
    return trxAutocommitNonLocking;
  }

  public void setTrxAutocommitNonLocking(int trxAutocommitNonLocking) {
    this.trxAutocommitNonLocking = trxAutocommitNonLocking;
  }

  public Object getTrxScheduleWeight() {
    return trxScheduleWeight;
  }

  public void setTrxScheduleWeight(Object trxScheduleWeight) {
    this.trxScheduleWeight = trxScheduleWeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbTrxEntity that = (InnodbTrxEntity) o;
    return trxUniqueChecks == that.trxUniqueChecks
        && trxForeignKeyChecks == that.trxForeignKeyChecks
        && trxAdaptiveHashLatched == that.trxAdaptiveHashLatched
        && trxIsReadOnly == that.trxIsReadOnly
        && trxAutocommitNonLocking == that.trxAutocommitNonLocking && Objects.equals(trxId,
        that.trxId) && Objects.equals(trxState, that.trxState) && Objects.equals(
        trxStarted, that.trxStarted) && Objects.equals(trxRequestedLockId,
        that.trxRequestedLockId) && Objects.equals(trxWaitStarted, that.trxWaitStarted)
        && Objects.equals(trxWeight, that.trxWeight) && Objects.equals(
        trxMysqlThreadId, that.trxMysqlThreadId) && Objects.equals(trxQuery, that.trxQuery)
        && Objects.equals(trxOperationState, that.trxOperationState)
        && Objects.equals(trxTablesInUse, that.trxTablesInUse) && Objects.equals(
        trxTablesLocked, that.trxTablesLocked) && Objects.equals(trxLockStructs,
        that.trxLockStructs) && Objects.equals(trxLockMemoryBytes, that.trxLockMemoryBytes)
        && Objects.equals(trxRowsLocked, that.trxRowsLocked) && Objects.equals(
        trxRowsModified, that.trxRowsModified) && Objects.equals(trxConcurrencyTickets,
        that.trxConcurrencyTickets) && Objects.equals(trxIsolationLevel,
        that.trxIsolationLevel) && Objects.equals(trxLastForeignKeyError,
        that.trxLastForeignKeyError) && Objects.equals(trxAdaptiveHashTimeout,
        that.trxAdaptiveHashTimeout) && Objects.equals(trxScheduleWeight,
        that.trxScheduleWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trxId, trxState, trxStarted, trxRequestedLockId, trxWaitStarted, trxWeight,
        trxMysqlThreadId, trxQuery, trxOperationState, trxTablesInUse, trxTablesLocked,
        trxLockStructs, trxLockMemoryBytes, trxRowsLocked, trxRowsModified, trxConcurrencyTickets,
        trxIsolationLevel, trxUniqueChecks, trxForeignKeyChecks, trxLastForeignKeyError,
        trxAdaptiveHashLatched, trxAdaptiveHashTimeout, trxIsReadOnly, trxAutocommitNonLocking,
        trxScheduleWeight);
  }
}
