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
 * Extra information about a given entity
 */
@ApiModel(description = "Extra information about a given entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-29T16:57:26.245+01:00")

public class Note   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("@type")
  private String type = null;

  public Note id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Quick identifier of the note
   * @return id
  **/
  @ApiModelProperty(value = "Quick identifier of the note")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Note date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The date that the note created
   * @return date
  **/
  @ApiModelProperty(value = "The date that the note created")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Note text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text of the note
   * @return text
  **/
  @ApiModelProperty(value = "The text of the note")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Note author(String author) {
    this.author = author;
    return this;
  }

  /**
   * The name of the note author, can be the agent name or any other party that created the note
   * @return author
  **/
  @ApiModelProperty(value = "The name of the note author, can be the agent name or any other party that created the note")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Note type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of note
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of note")


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
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.date, note.date) &&
        Objects.equals(this.text, note.text) &&
        Objects.equals(this.author, note.author) &&
        Objects.equals(this.type, note.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, text, author, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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

