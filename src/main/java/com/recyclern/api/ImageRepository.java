package com.recyclern.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<ImagePojo, String>{

  public ImagePojo findById(String id);
  public List<ImagePojo> findByImageType(String imageType);
}
