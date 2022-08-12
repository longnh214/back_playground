package com.example.batch_demo.entity;

import java.math.BigInteger;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PROFILING", schema = "information_schema", catalog = "")
public class ProfilingEntity {

  @Basic
  @Column(name = "QUERY_ID")
  private int queryId;
  @Basic
  @Column(name = "SEQ")
  private int seq;
  @Basic
  @Column(name = "STATE")
  private String state;
  @Basic
  @Column(name = "DURATION")
  private BigInteger duration;
  @Basic
  @Column(name = "CPU_USER")
  private BigInteger cpuUser;
  @Basic
  @Column(name = "CPU_SYSTEM")
  private BigInteger cpuSystem;
  @Basic
  @Column(name = "CONTEXT_VOLUNTARY")
  private Integer contextVoluntary;
  @Basic
  @Column(name = "CONTEXT_INVOLUNTARY")
  private Integer contextInvoluntary;
  @Basic
  @Column(name = "BLOCK_OPS_IN")
  private Integer blockOpsIn;
  @Basic
  @Column(name = "BLOCK_OPS_OUT")
  private Integer blockOpsOut;
  @Basic
  @Column(name = "MESSAGES_SENT")
  private Integer messagesSent;
  @Basic
  @Column(name = "MESSAGES_RECEIVED")
  private Integer messagesReceived;
  @Basic
  @Column(name = "PAGE_FAULTS_MAJOR")
  private Integer pageFaultsMajor;
  @Basic
  @Column(name = "PAGE_FAULTS_MINOR")
  private Integer pageFaultsMinor;
  @Basic
  @Column(name = "SWAPS")
  private Integer swaps;
  @Basic
  @Column(name = "SOURCE_FUNCTION")
  private String sourceFunction;
  @Basic
  @Column(name = "SOURCE_FILE")
  private String sourceFile;
  @Basic
  @Column(name = "SOURCE_LINE")
  private Integer sourceLine;

  public int getQueryId() {
    return queryId;
  }

  public void setQueryId(int queryId) {
    this.queryId = queryId;
  }

  public int getSeq() {
    return seq;
  }

  public void setSeq(int seq) {
    this.seq = seq;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public BigInteger getDuration() {
    return duration;
  }

  public void setDuration(BigInteger duration) {
    this.duration = duration;
  }

  public BigInteger getCpuUser() {
    return cpuUser;
  }

  public void setCpuUser(BigInteger cpuUser) {
    this.cpuUser = cpuUser;
  }

  public BigInteger getCpuSystem() {
    return cpuSystem;
  }

  public void setCpuSystem(BigInteger cpuSystem) {
    this.cpuSystem = cpuSystem;
  }

  public Integer getContextVoluntary() {
    return contextVoluntary;
  }

  public void setContextVoluntary(Integer contextVoluntary) {
    this.contextVoluntary = contextVoluntary;
  }

  public Integer getContextInvoluntary() {
    return contextInvoluntary;
  }

  public void setContextInvoluntary(Integer contextInvoluntary) {
    this.contextInvoluntary = contextInvoluntary;
  }

  public Integer getBlockOpsIn() {
    return blockOpsIn;
  }

  public void setBlockOpsIn(Integer blockOpsIn) {
    this.blockOpsIn = blockOpsIn;
  }

  public Integer getBlockOpsOut() {
    return blockOpsOut;
  }

  public void setBlockOpsOut(Integer blockOpsOut) {
    this.blockOpsOut = blockOpsOut;
  }

  public Integer getMessagesSent() {
    return messagesSent;
  }

  public void setMessagesSent(Integer messagesSent) {
    this.messagesSent = messagesSent;
  }

  public Integer getMessagesReceived() {
    return messagesReceived;
  }

  public void setMessagesReceived(Integer messagesReceived) {
    this.messagesReceived = messagesReceived;
  }

  public Integer getPageFaultsMajor() {
    return pageFaultsMajor;
  }

  public void setPageFaultsMajor(Integer pageFaultsMajor) {
    this.pageFaultsMajor = pageFaultsMajor;
  }

  public Integer getPageFaultsMinor() {
    return pageFaultsMinor;
  }

  public void setPageFaultsMinor(Integer pageFaultsMinor) {
    this.pageFaultsMinor = pageFaultsMinor;
  }

  public Integer getSwaps() {
    return swaps;
  }

  public void setSwaps(Integer swaps) {
    this.swaps = swaps;
  }

  public String getSourceFunction() {
    return sourceFunction;
  }

  public void setSourceFunction(String sourceFunction) {
    this.sourceFunction = sourceFunction;
  }

  public String getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(String sourceFile) {
    this.sourceFile = sourceFile;
  }

  public Integer getSourceLine() {
    return sourceLine;
  }

  public void setSourceLine(Integer sourceLine) {
    this.sourceLine = sourceLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilingEntity that = (ProfilingEntity) o;
    return queryId == that.queryId && seq == that.seq && Objects.equals(state, that.state)
        && Objects.equals(duration, that.duration) && Objects.equals(cpuUser,
        that.cpuUser) && Objects.equals(cpuSystem, that.cpuSystem)
        && Objects.equals(contextVoluntary, that.contextVoluntary)
        && Objects.equals(contextInvoluntary, that.contextInvoluntary)
        && Objects.equals(blockOpsIn, that.blockOpsIn) && Objects.equals(
        blockOpsOut, that.blockOpsOut) && Objects.equals(messagesSent, that.messagesSent)
        && Objects.equals(messagesReceived, that.messagesReceived)
        && Objects.equals(pageFaultsMajor, that.pageFaultsMajor)
        && Objects.equals(pageFaultsMinor, that.pageFaultsMinor)
        && Objects.equals(swaps, that.swaps) && Objects.equals(sourceFunction,
        that.sourceFunction) && Objects.equals(sourceFile, that.sourceFile)
        && Objects.equals(sourceLine, that.sourceLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, seq, state, duration, cpuUser, cpuSystem, contextVoluntary,
        contextInvoluntary, blockOpsIn, blockOpsOut, messagesSent, messagesReceived,
        pageFaultsMajor,
        pageFaultsMinor, swaps, sourceFunction, sourceFile, sourceLine);
  }
}
