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
 * The communication channel for example WEB, Call Center
 */
@ApiModel(description = "The communication channel for example WEB, Call Center")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T16:57:26.245+01:00")

public class Channel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@type")
  private String type = null;

  public Channel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the channel
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the channel")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Channel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the channel
   * @return name
  **/
  @ApiModelProperty(value = "The name of the channel")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Channel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of channel
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of channel")


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
    Channel channel = (Channel) o;
    return Objects.equals(this.id, channel.id) &&
        Objects.equals(this.name, channel.name) &&
        Objects.equals(this.type, channel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

