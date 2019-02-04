package nl.devoteam.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Holds the status notification reasons and associated date the status changed, populated by the server
 */
@ApiModel(description = "Holds the status notification reasons and associated date the status changed, populated by the server")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T16:57:26.245+01:00")

public class StatusChange   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("changeReason")
  private String changeReason = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("@type")
  private String type = null;

  public StatusChange status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the trouble ticket
   * @return status
  **/
  @ApiModelProperty(value = "The status of the trouble ticket")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StatusChange changeReason(String changeReason) {
    this.changeReason = changeReason;
    return this;
  }

  /**
   * The reason why the status changed.
   * @return changeReason
  **/
  @ApiModelProperty(value = "The reason why the status changed.")


  public String getChangeReason() {
    return changeReason;
  }

  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }

  public StatusChange changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * The date and time the status changed.
   * @return changeDate
  **/
  @ApiModelProperty(value = "The date and time the status changed.")

  @Valid

  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public StatusChange type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of statusChange
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of statusChange")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusChange statusChange = (StatusChange) o;
    return Objects.equals(this.status, statusChange.status) &&
        Objects.equals(this.changeReason, statusChange.changeReason) &&
        Objects.equals(this.changeDate, statusChange.changeDate) &&
        Objects.equals(this.type, statusChange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, changeReason, changeDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusChange {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

