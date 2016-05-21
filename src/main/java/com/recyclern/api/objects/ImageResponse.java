package com.recyclern.api.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageResponse {

  private final List<LabelAnnotation> labelAnnotations;
  
  public ImageResponse(@JsonProperty(value = "labelAnnotations") List<LabelAnnotation> labelAnnotations) {
    
    this.labelAnnotations = labelAnnotations;
  }
  
  public List<LabelAnnotation> getLabelAnnotations() {
    return labelAnnotations;
  }  
}
