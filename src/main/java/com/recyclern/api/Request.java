package com.recyclern.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
  
  private final String imageType;
  private final String base64Data;
  
  public Request(
      @JsonProperty( value = "imageType") String imageType,
      @JsonProperty( value = "base64Data") String base64Data) {
    
    this.base64Data = base64Data;
    this.imageType = imageType;
  }
  
  public String getImageType() {
    return imageType;
  }
  
  public String getBase64Data() {
    return base64Data;
  }

}
