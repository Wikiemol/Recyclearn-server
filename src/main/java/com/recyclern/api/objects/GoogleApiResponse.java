package com.recyclern.api.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoogleApiResponse {

  private final List<ImageResponse> responses;
  
  public GoogleApiResponse(@JsonProperty(value = "responses") List<ImageResponse> responses) {
    this.responses = responses;
  }
  
  public List<ImageResponse> getResponses() {
    return responses;
  }
  
}
