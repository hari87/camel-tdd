package nl.devoteam.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a relationship between trouble tickets
 */
@ApiModel(description = "Represents a relationship between trouble tickets")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T16:57:26.245+01:00")

public class TicketRelationship   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("type")
  private String type = null;

  public TicketRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the related trouble ticket
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the related trouble ticket")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TicketRelationship href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink, a reference to the related trouble ticket entity
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink, a reference to the related trouble ticket entity")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public TicketRelationship type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the trouble ticket relationship can be isChiled, dependent etc...
   * @return type
  **/
  @ApiModelProperty(value = "Type of the trouble ticket relationship can be isChiled, dependent etc...")


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
    TicketRelationship ticketRelationship = (TicketRelationship) o;
    return Objects.equals(this.id, ticketRelationship.id) &&
        Objects.equals(this.href, ticketRelationship.href) &&
        Objects.equals(this.type, ticketRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

