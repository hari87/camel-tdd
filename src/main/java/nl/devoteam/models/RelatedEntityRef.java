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
 * Related Entity reference. Reference to an arbitrary entity from a context entity.
 */
@ApiModel(description = "Related Entity reference. Reference to an arbitrary entity from a context entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T15:39:04.855+01:00")

public class RelatedEntityRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public RelatedEntityRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the related entity
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the related entity")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedEntityRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink, a reference to the related entity (e.g. customerBill, productOrder, etc.)
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink, a reference to the related entity (e.g. customerBill, productOrder, etc.)")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedEntityRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the related entity if applicable (e.g. name of the customer, name of the bill, name of the product etc...)
   * @return name
  **/
  @ApiModelProperty(value = "The name of the related entity if applicable (e.g. name of the customer, name of the bill, name of the product etc...)")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedEntityRef role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the related entity in the context of the contained resource (e.g. disputedBill, damagedDevice
   * @return role
  **/
  @ApiModelProperty(value = "The role of the related entity in the context of the contained resource (e.g. disputedBill, damagedDevice")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedEntityRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * A string. Indicates the type (class) of related entity. For example, Product Order Customer Bill, Payment, etc.
   * @return referredType
  **/
  @ApiModelProperty(value = "A string. Indicates the type (class) of related entity. For example, Product Order Customer Bill, Payment, etc.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedEntityRef relatedEntityRef = (RelatedEntityRef) o;
    return Objects.equals(this.id, relatedEntityRef.id) &&
        Objects.equals(this.href, relatedEntityRef.href) &&
        Objects.equals(this.name, relatedEntityRef.name) &&
        Objects.equals(this.role, relatedEntityRef.role) &&
        Objects.equals(this.referredType, relatedEntityRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, role, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedEntityRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

