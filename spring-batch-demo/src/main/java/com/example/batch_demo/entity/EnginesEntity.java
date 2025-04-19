package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ENGINES", schema = "information_schema", catalog = "")
public class EnginesEntity {

  @Basic
  @Column(name = "ENGINE")
  private String engine;
  @Basic
  @Column(name = "SUPPORT")
  private String support;
  @Basic
  @Column(name = "COMMENT")
  private String comment;
  @Basic
  @Column(name = "TRANSACTIONS")
  private String transactions;
  @Basic
  @Column(name = "XA")
  private String xa;
  @Basic
  @Column(name = "SAVEPOINTS")
  private String savepoints;

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getSupport() {
    return support;
  }

  public void setSupport(String support) {
    this.support = support;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getTransactions() {
    return transactions;
  }

  public void setTransactions(String transactions) {
    this.transactions = transactions;
  }

  public String getXa() {
    return xa;
  }

  public void setXa(String xa) {
    this.xa = xa;
  }

  public String getSavepoints() {
    return savepoints;
  }

  public void setSavepoints(String savepoints) {
    this.savepoints = savepoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnginesEntity that = (EnginesEntity) o;
    return Objects.equals(engine, that.engine) && Objects.equals(support,
        that.support) && Objects.equals(comment, that.comment) && Objects.equals(
        transactions, that.transactions) && Objects.equals(xa, that.xa)
        && Objects.equals(savepoints, that.savepoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, support, comment, transactions, xa, savepoints);
  }
}
