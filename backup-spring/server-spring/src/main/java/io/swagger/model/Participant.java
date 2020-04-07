package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Participant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
public class Participant   {
  @JsonProperty("Id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("participantInfo")
  private String participantInfo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("image")
  private Object image = null;

  @JsonProperty("qualified")
  private Boolean qualified = null;

  public Participant id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Participant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Participant surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(value = "")
  
    public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Participant description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Participant participantInfo(String participantInfo) {
    this.participantInfo = participantInfo;
    return this;
  }

  /**
   * Get participantInfo
   * @return participantInfo
  **/
  @ApiModelProperty(value = "")
  
    public String getParticipantInfo() {
    return participantInfo;
  }

  public void setParticipantInfo(String participantInfo) {
    this.participantInfo = participantInfo;
  }

  public Participant email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Participant password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Participant image(Object image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  
    public Object getImage() {
    return image;
  }

  public void setImage(Object image) {
    this.image = image;
  }

  public Participant qualified(Boolean qualified) {
    this.qualified = qualified;
    return this;
  }

  /**
   * Get qualified
   * @return qualified
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isQualified() {
    return qualified;
  }

  public void setQualified(Boolean qualified) {
    this.qualified = qualified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.id, participant.id) &&
        Objects.equals(this.name, participant.name) &&
        Objects.equals(this.surname, participant.surname) &&
        Objects.equals(this.description, participant.description) &&
        Objects.equals(this.participantInfo, participant.participantInfo) &&
        Objects.equals(this.email, participant.email) &&
        Objects.equals(this.password, participant.password) &&
        Objects.equals(this.image, participant.image) &&
        Objects.equals(this.qualified, participant.qualified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, description, participantInfo, email, password, image, qualified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    participantInfo: ").append(toIndentedString(participantInfo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    qualified: ").append(toIndentedString(qualified)).append("\n");
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
