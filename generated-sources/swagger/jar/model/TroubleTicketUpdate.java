package jar.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jar.model.Attachment;
import jar.model.Channel;
import jar.model.Note;
import jar.model.RelatedEntityRef;
import jar.model.RelatedPartyRef;
import jar.model.TicketRelationship;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system Skipped properties: id,href,id,href,creationDate,lastUpdated,statusChange,@baseType,@type,@schemaLocation
 */
@ApiModel(description = "A trouble ticket is a record of an issue that is created, tracked, and managed by a trouble ticket management system Skipped properties: id,href,id,href,creationDate,lastUpdated,statusChange,@baseType,@type,@schemaLocation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T13:04:47.677+01:00")

public class TroubleTicketUpdate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("ticketType")
  private String ticketType = null;

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

  @JsonProperty("relatedEntity")
  @Valid
  private List<RelatedEntityRef> relatedEntity = null;

  @JsonProperty("channel")
  private Channel channel = null;

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

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  public TroubleTicketUpdate name(String name) {
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

  public TroubleTicketUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the trouble or issue
   * @return description
  **/
  @ApiModelProperty(value = "Description of the trouble or issue")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TroubleTicketUpdate externalId(String externalId) {
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

  public TroubleTicketUpdate ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * represent a business type of the trouble ticket e.g. incident, complain, request
   * @return ticketType
  **/
  @ApiModelProperty(value = "represent a business type of the trouble ticket e.g. incident, complain, request")


  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public TroubleTicketUpdate severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of the issue. Indicate the implication of the issue on the expected functionality e.g. of a system, application, service etc..  Severity values can be for example : Critical, Major, Minor
   * @return severity
  **/
  @ApiModelProperty(value = "The severity of the issue. Indicate the implication of the issue on the expected functionality e.g. of a system, application, service etc..  Severity values can be for example : Critical, Major, Minor")


  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public TroubleTicketUpdate priority(String priority) {
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

  public TroubleTicketUpdate requestedResolutionDate(OffsetDateTime requestedResolutionDate) {
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

  public TroubleTicketUpdate expectedResolutionDate(OffsetDateTime expectedResolutionDate) {
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

  public TroubleTicketUpdate resolutionDate(OffsetDateTime resolutionDate) {
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

  public TroubleTicketUpdate status(String status) {
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

  public TroubleTicketUpdate statusChangeReason(String statusChangeReason) {
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

  public TroubleTicketUpdate relatedEntity(List<RelatedEntityRef> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public TroubleTicketUpdate addRelatedEntityItem(RelatedEntityRef relatedEntityItem) {
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

  public TroubleTicketUpdate channel(Channel channel) {
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

  public TroubleTicketUpdate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public TroubleTicketUpdate addNoteItem(Note noteItem) {
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

  public TroubleTicketUpdate relatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public TroubleTicketUpdate addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
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

  public TroubleTicketUpdate ticketRelationship(List<TicketRelationship> ticketRelationship) {
    this.ticketRelationship = ticketRelationship;
    return this;
  }

  public TroubleTicketUpdate addTicketRelationshipItem(TicketRelationship ticketRelationshipItem) {
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

  public TroubleTicketUpdate attachment(List<Attachment> attachment) {
    this.attachment = attachment;
    return this;
  }

  public TroubleTicketUpdate addAttachmentItem(Attachment attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * File(s) attached to the trouble ticket. e.g. pictur of broken device, scaning of a bill or charge
   * @return attachment
  **/
  @ApiModelProperty(value = "File(s) attached to the trouble ticket. e.g. pictur of broken device, scaning of a bill or charge")

  @Valid

  public List<Attachment> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }

  public TroubleTicketUpdate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The class type of the actual resource (for type extension).
   * @return type
  **/
  @ApiModelProperty(value = "The class type of the actual resource (for type extension).")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TroubleTicketUpdate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A link to the schema describing a resource (for type extension).
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A link to the schema describing a resource (for type extension).")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public TroubleTicketUpdate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * The base type for use in polymorphic collections
   * @return baseType
  **/
  @ApiModelProperty(value = "The base type for use in polymorphic collections")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TroubleTicketUpdate troubleTicketUpdate = (TroubleTicketUpdate) o;
    return Objects.equals(this.name, troubleTicketUpdate.name) &&
        Objects.equals(this.description, troubleTicketUpdate.description) &&
        Objects.equals(this.externalId, troubleTicketUpdate.externalId) &&
        Objects.equals(this.ticketType, troubleTicketUpdate.ticketType) &&
        Objects.equals(this.severity, troubleTicketUpdate.severity) &&
        Objects.equals(this.priority, troubleTicketUpdate.priority) &&
        Objects.equals(this.requestedResolutionDate, troubleTicketUpdate.requestedResolutionDate) &&
        Objects.equals(this.expectedResolutionDate, troubleTicketUpdate.expectedResolutionDate) &&
        Objects.equals(this.resolutionDate, troubleTicketUpdate.resolutionDate) &&
        Objects.equals(this.status, troubleTicketUpdate.status) &&
        Objects.equals(this.statusChangeReason, troubleTicketUpdate.statusChangeReason) &&
        Objects.equals(this.relatedEntity, troubleTicketUpdate.relatedEntity) &&
        Objects.equals(this.channel, troubleTicketUpdate.channel) &&
        Objects.equals(this.note, troubleTicketUpdate.note) &&
        Objects.equals(this.relatedParty, troubleTicketUpdate.relatedParty) &&
        Objects.equals(this.ticketRelationship, troubleTicketUpdate.ticketRelationship) &&
        Objects.equals(this.attachment, troubleTicketUpdate.attachment) &&
        Objects.equals(this.type, troubleTicketUpdate.type) &&
        Objects.equals(this.schemaLocation, troubleTicketUpdate.schemaLocation) &&
        Objects.equals(this.baseType, troubleTicketUpdate.baseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, externalId, ticketType, severity, priority, requestedResolutionDate, expectedResolutionDate, resolutionDate, status, statusChangeReason, relatedEntity, channel, note, relatedParty, ticketRelationship, attachment, type, schemaLocation, baseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TroubleTicketUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedResolutionDate: ").append(toIndentedString(requestedResolutionDate)).append("\n");
    sb.append("    expectedResolutionDate: ").append(toIndentedString(expectedResolutionDate)).append("\n");
    sb.append("    resolutionDate: ").append(toIndentedString(resolutionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChangeReason: ").append(toIndentedString(statusChangeReason)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    ticketRelationship: ").append(toIndentedString(ticketRelationship)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
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

