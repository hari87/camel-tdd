package nl.devoteam.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import nl.devoteam.models.Attachment;
import nl.devoteam.models.Channel;
import nl.devoteam.models.Note;
import nl.devoteam.models.RelatedEntityRef;
import nl.devoteam.models.RelatedPartyRef;
import nl.devoteam.models.StatusChange;
import nl.devoteam.models.TicketRelationship;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system Skipped properties: id,href
 */
@ApiModel(description = "A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T16:57:26.245+01:00")

public class TroubleTicketCreate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("ticketType")
  private String ticketType = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("severity")
  private String severity = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("requestedResolutionDate")
  private OffsetDateTime requestedResolutionDate = null;

  @JsonProperty("expectedResolutionDate")
  private OffsetDateTime expectedResolutionDate = null;

  @JsonProperty("resolutionDate")
  private OffsetDateTime resolutionDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusChangeReason")
  private String statusChangeReason = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("relatedEntity")
  @Valid
  private List<RelatedEntityRef> relatedEntity = null;

  @JsonProperty("channel")
  private Channel channel = null;

  @JsonProperty("statusChange")
  @Valid
  private List<StatusChange> statusChange = null;

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedPartyRef> relatedParty = null;

  @JsonProperty("ticketRelationship")
  @Valid
  private List<TicketRelationship> ticketRelationship = null;

  @JsonProperty("attachment")
  @Valid
  private List<Attachment> attachment = null;

  public TroubleTicketCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the trouble ticket, typically a short description provided by the user that create the ticket
   * @return name
  **/
  @ApiModelProperty(value = "Name of the trouble ticket, typically a short description provided by the user that create the ticket")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TroubleTicketCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the trouble or issue
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the trouble or issue")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TroubleTicketCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Additional identifier coming from an external system
   * @return externalId
  **/
  @ApiModelProperty(value = "Additional identifier coming from an external system")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public TroubleTicketCreate ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * represent a business type of the trouble ticket e.g. incident, complain, request
   * @return ticketType
  **/
  @ApiModelProperty(required = true, value = "represent a business type of the trouble ticket e.g. incident, complain, request")
  @NotNull


  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public TroubleTicketCreate creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date on which the trouble ticket was created
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date on which the trouble ticket was created")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public TroubleTicketCreate lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * The date and time that the trouble ticked was last updated
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "The date and time that the trouble ticked was last updated")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public TroubleTicketCreate severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the issue. Indicate the implication of the issue on the expected functionality e.g. of a system, application, service etc..  Severity values can be for example : Critical, Major, Minor
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "The severity of the issue. Indicate the implication of the issue on the expected functionality e.g. of a system, application, service etc..  Severity values can be for example : Critical, Major, Minor")
  @NotNull


  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public TroubleTicketCreate priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority of the trouble ticket and how quickly the issue should be resolved. Example: Critical, High, Medium, Low. The value is set by the ticket management system considering the severity, ticket type etc...
   * @return priority
  **/
  @ApiModelProperty(value = "The priority of the trouble ticket and how quickly the issue should be resolved. Example: Critical, High, Medium, Low. The value is set by the ticket management system considering the severity, ticket type etc...")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public TroubleTicketCreate requestedResolutionDate(OffsetDateTime requestedResolutionDate) {
    this.requestedResolutionDate = requestedResolutionDate;
    return this;
  }

  /**
   * The resolution date requested by the user
   * @return requestedResolutionDate
  **/
  @ApiModelProperty(value = "The resolution date requested by the user")

  @Valid

  public OffsetDateTime getRequestedResolutionDate() {
    return requestedResolutionDate;
  }

  public void setRequestedResolutionDate(OffsetDateTime requestedResolutionDate) {
    this.requestedResolutionDate = requestedResolutionDate;
  }

  public TroubleTicketCreate expectedResolutionDate(OffsetDateTime expectedResolutionDate) {
    this.expectedResolutionDate = expectedResolutionDate;
    return this;
  }

  /**
   * The expected resolution date determined by the trouble ticket system
   * @return expectedResolutionDate
  **/
  @ApiModelProperty(value = "The expected resolution date determined by the trouble ticket system")

  @Valid

  public OffsetDateTime getExpectedResolutionDate() {
    return expectedResolutionDate;
  }

  public void setExpectedResolutionDate(OffsetDateTime expectedResolutionDate) {
    this.expectedResolutionDate = expectedResolutionDate;
  }

  public TroubleTicketCreate resolutionDate(OffsetDateTime resolutionDate) {
    this.resolutionDate = resolutionDate;
    return this;
  }

  /**
   * The date and time the trouble ticket was resolved
   * @return resolutionDate
  **/
  @ApiModelProperty(value = "The date and time the trouble ticket was resolved")

  @Valid

  public OffsetDateTime getResolutionDate() {
    return resolutionDate;
  }

  public void setResolutionDate(OffsetDateTime resolutionDate) {
    this.resolutionDate = resolutionDate;
  }

  public TroubleTicketCreate status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the trouble ticket
   * @return status
  **/
  @ApiModelProperty(value = "The current status of the trouble ticket")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TroubleTicketCreate statusChangeReason(String statusChangeReason) {
    this.statusChangeReason = statusChangeReason;
    return this;
  }

  /**
   * The reason for changing the status
   * @return statusChangeReason
  **/
  @ApiModelProperty(value = "The reason for changing the status")


  public String getStatusChangeReason() {
    return statusChangeReason;
  }

  public void setStatusChangeReason(String statusChangeReason) {
    this.statusChangeReason = statusChangeReason;
  }

  public TroubleTicketCreate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The (class) type of the trouble ticket. e.g. billingTicket, networkTicket, resourceTicket
   * @return type
  **/
  @ApiModelProperty(value = "The (class) type of the trouble ticket. e.g. billingTicket, networkTicket, resourceTicket")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TroubleTicketCreate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * The base type (class) of the resource. Here can be 'TroubleTicket'
   * @return baseType
  **/
  @ApiModelProperty(value = "The base type (class) of the resource. Here can be 'TroubleTicket'")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public TroubleTicketCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * Link to the schema describing this REST resource
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "Link to the schema describing this REST resource")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public TroubleTicketCreate relatedEntity(List<RelatedEntityRef> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public TroubleTicketCreate addRelatedEntityItem(RelatedEntityRef relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * An entity that is related to the ticket such as a bill, a product, etc. The entity against which the ticket is associated.
   * @return relatedEntity
  **/
  @ApiModelProperty(value = "An entity that is related to the ticket such as a bill, a product, etc. The entity against which the ticket is associated.")

  @Valid

  public List<RelatedEntityRef> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<RelatedEntityRef> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public TroubleTicketCreate channel(Channel channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The channel that origin the trouble ticket
   * @return channel
  **/
  @ApiModelProperty(value = "The channel that origin the trouble ticket")

  @Valid

  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  public TroubleTicketCreate statusChange(List<StatusChange> statusChange) {
    this.statusChange = statusChange;
    return this;
  }

  public TroubleTicketCreate addStatusChangeItem(StatusChange statusChangeItem) {
    if (this.statusChange == null) {
      this.statusChange = new ArrayList<>();
    }
    this.statusChange.add(statusChangeItem);
    return this;
  }

  /**
   * The status change history that are associated to the ticket.Populated by the server
   * @return statusChange
  **/
  @ApiModelProperty(value = "The status change history that are associated to the ticket.Populated by the server")

  @Valid

  public List<StatusChange> getStatusChange() {
    return statusChange;
  }

  public void setStatusChange(List<StatusChange> statusChange) {
    this.statusChange = statusChange;
  }

  public TroubleTicketCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public TroubleTicketCreate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * The note(s) that are associated to the ticket.
   * @return note
  **/
  @ApiModelProperty(value = "The note(s) that are associated to the ticket.")

  @Valid

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public TroubleTicketCreate relatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public TroubleTicketCreate addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * The related party(ies) that are associated to the ticket.
   * @return relatedParty
  **/
  @ApiModelProperty(value = "The related party(ies) that are associated to the ticket.")

  @Valid

  public List<RelatedPartyRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public TroubleTicketCreate ticketRelationship(List<TicketRelationship> ticketRelationship) {
    this.ticketRelationship = ticketRelationship;
    return this;
  }

  public TroubleTicketCreate addTicketRelationshipItem(TicketRelationship ticketRelationshipItem) {
    if (this.ticketRelationship == null) {
      this.ticketRelationship = new ArrayList<>();
    }
    this.ticketRelationship.add(ticketRelationshipItem);
    return this;
  }

  /**
   * A list of trouble ticket relationships (TroubleTicketRelationship [*]). Represents a relationship between trouble tickets
   * @return ticketRelationship
  **/
  @ApiModelProperty(value = "A list of trouble ticket relationships (TroubleTicketRelationship [*]). Represents a relationship between trouble tickets")

  @Valid

  public List<TicketRelationship> getTicketRelationship() {
    return ticketRelationship;
  }

  public void setTicketRelationship(List<TicketRelationship> ticketRelationship) {
    this.ticketRelationship = ticketRelationship;
  }

  public TroubleTicketCreate attachment(List<Attachment> attachment) {
    this.attachment = attachment;
    return this;
  }

  public TroubleTicketCreate addAttachmentItem(Attachment attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * File(s) attached to the trouble ticket. e.g. picture of broken device, scanning of a bill or charge
   * @return attachment
  **/
  @ApiModelProperty(value = "File(s) attached to the trouble ticket. e.g. picture of broken device, scanning of a bill or charge")

  @Valid

  public List<Attachment> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TroubleTicketCreate troubleTicketCreate = (TroubleTicketCreate) o;
    return Objects.equals(this.name, troubleTicketCreate.name) &&
        Objects.equals(this.description, troubleTicketCreate.description) &&
        Objects.equals(this.externalId, troubleTicketCreate.externalId) &&
        Objects.equals(this.ticketType, troubleTicketCreate.ticketType) &&
        Objects.equals(this.creationDate, troubleTicketCreate.creationDate) &&
        Objects.equals(this.lastUpdate, troubleTicketCreate.lastUpdate) &&
        Objects.equals(this.severity, troubleTicketCreate.severity) &&
        Objects.equals(this.priority, troubleTicketCreate.priority) &&
        Objects.equals(this.requestedResolutionDate, troubleTicketCreate.requestedResolutionDate) &&
        Objects.equals(this.expectedResolutionDate, troubleTicketCreate.expectedResolutionDate) &&
        Objects.equals(this.resolutionDate, troubleTicketCreate.resolutionDate) &&
        Objects.equals(this.status, troubleTicketCreate.status) &&
        Objects.equals(this.statusChangeReason, troubleTicketCreate.statusChangeReason) &&
        Objects.equals(this.type, troubleTicketCreate.type) &&
        Objects.equals(this.baseType, troubleTicketCreate.baseType) &&
        Objects.equals(this.schemaLocation, troubleTicketCreate.schemaLocation) &&
        Objects.equals(this.relatedEntity, troubleTicketCreate.relatedEntity) &&
        Objects.equals(this.channel, troubleTicketCreate.channel) &&
        Objects.equals(this.statusChange, troubleTicketCreate.statusChange) &&
        Objects.equals(this.note, troubleTicketCreate.note) &&
        Objects.equals(this.relatedParty, troubleTicketCreate.relatedParty) &&
        Objects.equals(this.ticketRelationship, troubleTicketCreate.ticketRelationship) &&
        Objects.equals(this.attachment, troubleTicketCreate.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, externalId, ticketType, creationDate, lastUpdate, severity, priority, requestedResolutionDate, expectedResolutionDate, resolutionDate, status, statusChangeReason, type, baseType, schemaLocation, relatedEntity, channel, statusChange, note, relatedParty, ticketRelationship, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedResolutionDate: ").append(toIndentedString(requestedResolutionDate)).append("\n");
    sb.append("    expectedResolutionDate: ").append(toIndentedString(expectedResolutionDate)).append("\n");
    sb.append("    resolutionDate: ").append(toIndentedString(resolutionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangeReason: ").append(toIndentedString(statusChangeReason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    statusChange: ").append(toIndentedString(statusChange)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    ticketRelationship: ").append(toIndentedString(ticketRelationship)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

