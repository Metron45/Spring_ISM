package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Participant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
public class Event   {
  @JsonProperty("Id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("image")
  private Object image = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("participans")
  @Valid
  private List<Participant> participans = null;

  @JsonProperty("ticketSales")
  private Object ticketSales = null;

  @JsonProperty("mailingList")
  private String mailingList = null;

  @JsonProperty("punctation")
  private Object punctation = null;

  public Event id(Integer id) {
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

  public Event name(String name) {
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

  public Event description(String description) {
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

  public Event date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Event image(Object image) {
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

  public Event eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  
    public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Event location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  
    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Event participans(List<Participant> participans) {
    this.participans = participans;
    return this;
  }

  public Event addParticipansItem(Participant participansItem) {
    if (this.participans == null) {
      this.participans = new ArrayList<Participant>();
    }
    this.participans.add(participansItem);
    return this;
  }

  /**
   * Get participans
   * @return participans
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Participant> getParticipans() {
    return participans;
  }

  public void setParticipans(List<Participant> participans) {
    this.participans = participans;
  }

  public Event ticketSales(Object ticketSales) {
    this.ticketSales = ticketSales;
    return this;
  }

  /**
   * Get ticketSales
   * @return ticketSales
  **/
  @ApiModelProperty(value = "")
  
    public Object getTicketSales() {
    return ticketSales;
  }

  public void setTicketSales(Object ticketSales) {
    this.ticketSales = ticketSales;
  }

  public Event mailingList(String mailingList) {
    this.mailingList = mailingList;
    return this;
  }

  /**
   * Get mailingList
   * @return mailingList
  **/
  @ApiModelProperty(value = "")
  
    public String getMailingList() {
    return mailingList;
  }

  public void setMailingList(String mailingList) {
    this.mailingList = mailingList;
  }

  public Event punctation(Object punctation) {
    this.punctation = punctation;
    return this;
  }

  /**
   * Get punctation
   * @return punctation
  **/
  @ApiModelProperty(value = "")
  
    public Object getPunctation() {
    return punctation;
  }

  public void setPunctation(Object punctation) {
    this.punctation = punctation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.name, event.name) &&
        Objects.equals(this.description, event.description) &&
        Objects.equals(this.date, event.date) &&
        Objects.equals(this.image, event.image) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.location, event.location) &&
        Objects.equals(this.participans, event.participans) &&
        Objects.equals(this.ticketSales, event.ticketSales) &&
        Objects.equals(this.mailingList, event.mailingList) &&
        Objects.equals(this.punctation, event.punctation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, date, image, eventType, location, participans, ticketSales, mailingList, punctation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    participans: ").append(toIndentedString(participans)).append("\n");
    sb.append("    ticketSales: ").append(toIndentedString(ticketSales)).append("\n");
    sb.append("    mailingList: ").append(toIndentedString(mailingList)).append("\n");
    sb.append("    punctation: ").append(toIndentedString(punctation)).append("\n");
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
