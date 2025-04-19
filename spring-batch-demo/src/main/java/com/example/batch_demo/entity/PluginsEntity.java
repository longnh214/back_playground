package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PLUGINS", schema = "information_schema", catalog = "")
public class PluginsEntity {

  @Basic
  @Column(name = "PLUGIN_NAME")
  private String pluginName;
  @Basic
  @Column(name = "PLUGIN_VERSION")
  private String pluginVersion;
  @Basic
  @Column(name = "PLUGIN_STATUS")
  private String pluginStatus;
  @Basic
  @Column(name = "PLUGIN_TYPE")
  private String pluginType;
  @Basic
  @Column(name = "PLUGIN_TYPE_VERSION")
  private String pluginTypeVersion;
  @Basic
  @Column(name = "PLUGIN_LIBRARY")
  private String pluginLibrary;
  @Basic
  @Column(name = "PLUGIN_LIBRARY_VERSION")
  private String pluginLibraryVersion;
  @Basic
  @Column(name = "PLUGIN_AUTHOR")
  private String pluginAuthor;
  @Basic
  @Column(name = "PLUGIN_DESCRIPTION")
  private String pluginDescription;
  @Basic
  @Column(name = "PLUGIN_LICENSE")
  private String pluginLicense;
  @Basic
  @Column(name = "LOAD_OPTION")
  private String loadOption;

  public String getPluginName() {
    return pluginName;
  }

  public void setPluginName(String pluginName) {
    this.pluginName = pluginName;
  }

  public String getPluginVersion() {
    return pluginVersion;
  }

  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }

  public String getPluginStatus() {
    return pluginStatus;
  }

  public void setPluginStatus(String pluginStatus) {
    this.pluginStatus = pluginStatus;
  }

  public String getPluginType() {
    return pluginType;
  }

  public void setPluginType(String pluginType) {
    this.pluginType = pluginType;
  }

  public String getPluginTypeVersion() {
    return pluginTypeVersion;
  }

  public void setPluginTypeVersion(String pluginTypeVersion) {
    this.pluginTypeVersion = pluginTypeVersion;
  }

  public String getPluginLibrary() {
    return pluginLibrary;
  }

  public void setPluginLibrary(String pluginLibrary) {
    this.pluginLibrary = pluginLibrary;
  }

  public String getPluginLibraryVersion() {
    return pluginLibraryVersion;
  }

  public void setPluginLibraryVersion(String pluginLibraryVersion) {
    this.pluginLibraryVersion = pluginLibraryVersion;
  }

  public String getPluginAuthor() {
    return pluginAuthor;
  }

  public void setPluginAuthor(String pluginAuthor) {
    this.pluginAuthor = pluginAuthor;
  }

  public String getPluginDescription() {
    return pluginDescription;
  }

  public void setPluginDescription(String pluginDescription) {
    this.pluginDescription = pluginDescription;
  }

  public String getPluginLicense() {
    return pluginLicense;
  }

  public void setPluginLicense(String pluginLicense) {
    this.pluginLicense = pluginLicense;
  }

  public String getLoadOption() {
    return loadOption;
  }

  public void setLoadOption(String loadOption) {
    this.loadOption = loadOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsEntity that = (PluginsEntity) o;
    return Objects.equals(pluginName, that.pluginName) && Objects.equals(
        pluginVersion, that.pluginVersion) && Objects.equals(pluginStatus,
        that.pluginStatus) && Objects.equals(pluginType, that.pluginType)
        && Objects.equals(pluginTypeVersion, that.pluginTypeVersion)
        && Objects.equals(pluginLibrary, that.pluginLibrary) && Objects.equals(
        pluginLibraryVersion, that.pluginLibraryVersion) && Objects.equals(pluginAuthor,
        that.pluginAuthor) && Objects.equals(pluginDescription, that.pluginDescription)
        && Objects.equals(pluginLicense, that.pluginLicense) && Objects.equals(
        loadOption, that.loadOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginName, pluginVersion, pluginStatus, pluginType, pluginTypeVersion,
        pluginLibrary, pluginLibraryVersion, pluginAuthor, pluginDescription, pluginLicense,
        loadOption);
  }
}
