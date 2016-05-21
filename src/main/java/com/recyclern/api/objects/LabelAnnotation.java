package com.recyclern.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LabelAnnotation {

  public final String mid;
  public final String description;
  public final String score;
  
  public LabelAnnotation(
      @JsonProperty(value="mid") String mid,
      @JsonProperty(value="description") String description,
      @JsonProperty(value="score") String score) {
    
    this.mid = mid;
    this.description = description;
    this.score = score;
  }

  public String getMid() {
    return mid;
  }

  public String getDescription() {
    return description;
  }

  public String getScore() {
    return score;
  }
  
  
}
