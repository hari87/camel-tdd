package nl.devoteam.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import nl.devoteam.models.TimePeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Attachment refers to extensions or additional parts that is or may be attached to something (agreements, contracts, appointments) to perform a particular function. They can be communication attachments, documents and other.
 */
@ApiModel(description = "Attachment refers to extensions or additional parts that is or may be attached to something (agreements, contracts, appointments) to perform a particular function. They can be communication attachments, documents and other.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T15:39:04.855+01:00")

public class Attachment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("size")
  private BigDecimal size = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("sizeUnit")
  private String sizeUnit = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@type")
  private String type = null;

  public Attachment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the binary attachment
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the binary attachment")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Attachment href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the attached document
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the attached document")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Attachment size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * The size in Bytes of the of the document or attachment. If this component contains the embedded data then the size is the size of the embedded data; if it is a reference without the data then it is the size of the referenced document.
   * @return size
  **/
  @ApiModelProperty(value = "The size in Bytes of the of the document or attachment. If this component contains the embedded data then the size is the size of the embedded data; if it is a reference without the data then it is the size of the referenced document.")

  @Valid

  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Attachment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the binary attachment
   * @return name
  **/
  @ApiModelProperty(value = "name of the binary attachment")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * the description of the binary attachment
   * @return description
  **/
  @ApiModelProperty(value = "the description of the binary attachment")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment sizeUnit(String sizeUnit) {
    this.sizeUnit = sizeUnit;
    return this;
  }

  /**
   * The unit of measure for the size
   * @return sizeUnit
  **/
  @ApiModelProperty(value = "The unit of measure for the size")


  public String getSizeUnit() {
    return sizeUnit;
  }

  public void setSizeUnit(String sizeUnit) {
    this.sizeUnit = sizeUnit;
  }

  public Attachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * mimeType of the Attachement ( e,g application/pdf)
   * @return mimeType
  **/
  @ApiModelProperty(value = "mimeType of the Attachement ( e,g application/pdf)")


  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Attachment url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the Attachment
   * @return url
  **/
  @ApiModelProperty(value = "URL of the Attachment")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Attachment validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * validity period of the Attachment
   * @return validFor
  **/
  @ApiModelProperty(value = "validity period of the Attachment")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public Attachment type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of the attachment.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of the attachment.")


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
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.href, attachment.href) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.sizeUnit, attachment.sizeUnit) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.url, attachment.url) &&
        Objects.equals(this.validFor, attachment.validFor) &&
        Objects.equals(this.type, attachment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, size, name, description, sizeUnit, mimeType, url, validFor, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

