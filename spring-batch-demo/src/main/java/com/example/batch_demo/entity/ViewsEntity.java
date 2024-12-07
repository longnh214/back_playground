package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VIEWS", schema = "information_schema", catalog = "")
public class ViewsEntity {

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
  @Column(name = "VIEW_DEFINITION")
  private String viewDefinition;
  @Basic
  @Column(name = "CHECK_OPTION")
  private Object checkOption;
  @Basic
  @Column(name = "IS_UPDATABLE")
  private Object isUpdatable;
  @Basic
  @Column(name = "DEFINER")
  private String definer;
  @Basic
  @Column(name = "SECURITY_TYPE")
  private String securityType;
  @Basic
  @Column(name = "CHARACTER_SET_CLIENT")
  private String characterSetClient;
  @Basic
  @Column(name = "COLLATION_CONNECTION")
  private String collationConnection;

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

  public String getViewDefinition() {
    return viewDefinition;
  }

  public void setViewDefinition(String viewDefinition) {
    this.viewDefinition = viewDefinition;
  }

  public Object getCheckOption() {
    return checkOption;
  }

  public void setCheckOption(Object checkOption) {
    this.checkOption = checkOption;
  }

  public Object getIsUpdatable() {
    return isUpdatable;
  }

  public void setIsUpdatable(Object isUpdatable) {
    this.isUpdatable = isUpdatable;
  }

  public String getDefiner() {
    return definer;
  }

  public void setDefiner(String definer) {
    this.definer = definer;
  }

  public String getSecurityType() {
    return securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = securityType;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewsEntity that = (ViewsEntity) o;
    return Objects.equals(tableCatalog, that.tableCatalog) && Objects.equals(
        tableSchema, that.tableSchema) && Objects.equals(tableName, that.tableName)
        && Objects.equals(viewDefinition, that.viewDefinition) && Objects.equals(
        checkOption, that.checkOption) && Objects.equals(isUpdatable, that.isUpdatable)
        && Objects.equals(definer, that.definer) && Objects.equals(securityType,
        that.securityType) && Objects.equals(characterSetClient, that.characterSetClient)
        && Objects.equals(collationConnection, that.collationConnection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableCatalog, tableSchema, tableName, viewDefinition, checkOption,
        isUpdatable, definer, securityType, characterSetClient, collationConnection);
  }
}
