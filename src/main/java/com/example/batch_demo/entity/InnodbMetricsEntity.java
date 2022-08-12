package com.example.batch_demo.entity;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INNODB_METRICS", schema = "information_schema", catalog = "")
public class InnodbMetricsEntity {

  @Basic
  @Column(name = "NAME")
  private String name;
  @Basic
  @Column(name = "SUBSYSTEM")
  private String subsystem;
  @Basic
  @Column(name = "COUNT")
  private long count;
  @Basic
  @Column(name = "MAX_COUNT")
  private Long maxCount;
  @Basic
  @Column(name = "MIN_COUNT")
  private Long minCount;
  @Basic
  @Column(name = "AVG_COUNT")
  private Double avgCount;
  @Basic
  @Column(name = "COUNT_RESET")
  private long countReset;
  @Basic
  @Column(name = "MAX_COUNT_RESET")
  private Long maxCountReset;
  @Basic
  @Column(name = "MIN_COUNT_RESET")
  private Long minCountReset;
  @Basic
  @Column(name = "AVG_COUNT_RESET")
  private Double avgCountReset;
  @Basic
  @Column(name = "TIME_ENABLED")
  private Timestamp timeEnabled;
  @Basic
  @Column(name = "TIME_DISABLED")
  private Timestamp timeDisabled;
  @Basic
  @Column(name = "TIME_ELAPSED")
  private Long timeElapsed;
  @Basic
  @Column(name = "TIME_RESET")
  private Timestamp timeReset;
  @Basic
  @Column(name = "STATUS")
  private String status;
  @Basic
  @Column(name = "TYPE")
  private String type;
  @Basic
  @Column(name = "COMMENT")
  private String comment;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubsystem() {
    return subsystem;
  }

  public void setSubsystem(String subsystem) {
    this.subsystem = subsystem;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public Long getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Long maxCount) {
    this.maxCount = maxCount;
  }

  public Long getMinCount() {
    return minCount;
  }

  public void setMinCount(Long minCount) {
    this.minCount = minCount;
  }

  public Double getAvgCount() {
    return avgCount;
  }

  public void setAvgCount(Double avgCount) {
    this.avgCount = avgCount;
  }

  public long getCountReset() {
    return countReset;
  }

  public void setCountReset(long countReset) {
    this.countReset = countReset;
  }

  public Long getMaxCountReset() {
    return maxCountReset;
  }

  public void setMaxCountReset(Long maxCountReset) {
    this.maxCountReset = maxCountReset;
  }

  public Long getMinCountReset() {
    return minCountReset;
  }

  public void setMinCountReset(Long minCountReset) {
    this.minCountReset = minCountReset;
  }

  public Double getAvgCountReset() {
    return avgCountReset;
  }

  public void setAvgCountReset(Double avgCountReset) {
    this.avgCountReset = avgCountReset;
  }

  public Timestamp getTimeEnabled() {
    return timeEnabled;
  }

  public void setTimeEnabled(Timestamp timeEnabled) {
    this.timeEnabled = timeEnabled;
  }

  public Timestamp getTimeDisabled() {
    return timeDisabled;
  }

  public void setTimeDisabled(Timestamp timeDisabled) {
    this.timeDisabled = timeDisabled;
  }

  public Long getTimeElapsed() {
    return timeElapsed;
  }

  public void setTimeElapsed(Long timeElapsed) {
    this.timeElapsed = timeElapsed;
  }

  public Timestamp getTimeReset() {
    return timeReset;
  }

  public void setTimeReset(Timestamp timeReset) {
    this.timeReset = timeReset;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnodbMetricsEntity that = (InnodbMetricsEntity) o;
    return count == that.count && countReset == that.countReset && Objects.equals(name,
        that.name) && Objects.equals(subsystem, that.subsystem) && Objects.equals(
        maxCount, that.maxCount) && Objects.equals(minCount, that.minCount)
        && Objects.equals(avgCount, that.avgCount) && Objects.equals(
        maxCountReset, that.maxCountReset) && Objects.equals(minCountReset,
        that.minCountReset) && Objects.equals(avgCountReset, that.avgCountReset)
        && Objects.equals(timeEnabled, that.timeEnabled) && Objects.equals(
        timeDisabled, that.timeDisabled) && Objects.equals(timeElapsed, that.timeElapsed)
        && Objects.equals(timeReset, that.timeReset) && Objects.equals(status,
        that.status) && Objects.equals(type, that.type) && Objects.equals(comment,
        that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subsystem, count, maxCount, minCount, avgCount, countReset,
        maxCountReset, minCountReset, avgCountReset, timeEnabled, timeDisabled, timeElapsed,
        timeReset, status, type, comment);
  }
}
