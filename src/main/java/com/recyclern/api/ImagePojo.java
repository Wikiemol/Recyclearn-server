package com.recyclern.api;

import org.springframework.data.annotation.Id;

public class ImagePojo {
  
  @Id
  public String id;
  
  public String imageType;  // i.e. Jpeg
  public String imageData;  // Jpeg data
  
  public ImagePojo() {}
  
  public ImagePojo(String imageType, String imageData)  {
    
    this.imageData = imageData;
    this.imageType = imageType;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public String getImageData() {
    return imageData;
  }

  public void setImageData(String imageData) {
    this.imageData = imageData;
  }
  
  
}
