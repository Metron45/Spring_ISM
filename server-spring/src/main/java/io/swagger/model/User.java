package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User
 */
@Validated
@javax.annotation.Generated(
		value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
		date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]"
		)

@Entity
@Table(name = "Users")
@JacksonXmlRootElement(localName = "User")
@JsonRootName("User")
public class User   {
	
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @JsonProperty("id")
  @JacksonXmlProperty(localName="id")
  private Long id = null;

  @JsonProperty("name")
  @JacksonXmlProperty(localName="name")
  private String name = null;

  @JsonProperty("surname")
  @JacksonXmlProperty(localName="surname")
  private String surname = null;

  @JsonProperty("description")
  @JacksonXmlProperty(localName="description")
  private String description = null;

  @JsonProperty("participantInfo")
  @JacksonXmlProperty(localName="participantInfo")
  private String participantInfo = null;

  @JsonProperty("email")
  @JacksonXmlProperty(localName="email")
  private String email = null;

  @JsonProperty("password")
  @JacksonXmlProperty(localName="password")
  private String password = null;

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User name(String name) {
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

  public User surname(String surname) {
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

  public User description(String description) {
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

  public User participantInfo(String participantInfo) {
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

  public User email(String email) {
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

  public User password(String password) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.participantInfo, user.participantInfo) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, surname, description, participantInfo, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    participantInfo: ").append(toIndentedString(participantInfo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
