package com.example.batch_demo.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ST_SPATIAL_REFERENCE_SYSTEMS", schema = "information_schema", catalog = "")
public class StSpatialReferenceSystemsEntity {

  @Basic
  @Column(name = "SRS_NAME")
  private String srsName;
  @Basic
  @Column(name = "SRS_ID")
  private Object srsId;
  @Basic
  @Column(name = "ORGANIZATION")
  private String organization;
  @Basic
  @Column(name = "ORGANIZATION_COORDSYS_ID")
  private Object organizationCoordsysId;
  @Basic
  @Column(name = "DEFINITION")
  private String definition;
  @Basic
  @Column(name = "DESCRIPTION")
  private String description;

  public String getSrsName() {
    return srsName;
  }

  public void setSrsName(String srsName) {
    this.srsName = srsName;
  }

  public Object getSrsId() {
    return srsId;
  }

  public void setSrsId(Object srsId) {
    this.srsId = srsId;
  }

  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public Object getOrganizationCoordsysId() {
    return organizationCoordsysId;
  }

  public void setOrganizationCoordsysId(Object organizationCoordsysId) {
    this.organizationCoordsysId = organizationCoordsysId;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StSpatialReferenceSystemsEntity that = (StSpatialReferenceSystemsEntity) o;
    return Objects.equals(srsName, that.srsName) && Objects.equals(srsId,
        that.srsId) && Objects.equals(organization, that.organization)
        && Objects.equals(organizationCoordsysId, that.organizationCoordsysId)
        && Objects.equals(definition, that.definition) && Objects.equals(
        description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srsName, srsId, organization, organizationCoordsysId, definition,
        description);
  }
}
