package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PROCESSLIST", schema = "information_schema", catalog = "")
public class ProcesslistEntity {

  @Basic
  @Column(name = "ID")
  private Object id;
  @Basic
  @Column(name = "USER")
  private String user;
  @Basic
  @Column(name = "HOST")
  private String host;
  @Basic
  @Column(name = "DB")
  private String db;
  @Basic
  @Column(name = "COMMAND")
  private String command;
  @Basic
  @Column(name = "TIME")
  private int time;
  @Basic
  @Column(name = "STATE")
  private String state;
  @Basic
  @Column(name = "INFO")
  private String info;

  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getDb() {
    return db;
  }

  public void setDb(String db) {
    this.db = db;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcesslistEntity that = (ProcesslistEntity) o;
    return time == that.time && Objects.equals(id, that.id) && Objects.equals(
        user, that.user) && Objects.equals(host, that.host) && Objects.equals(db,
        that.db) && Objects.equals(command, that.command) && Objects.equals(state,
        that.state) && Objects.equals(info, that.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, host, db, command, time, state, info);
  }
}
