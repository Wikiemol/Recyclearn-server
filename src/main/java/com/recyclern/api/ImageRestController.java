package com.recyclern.api;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageRestController {

  @Autowired
  private ImageRepository repository;
  
  @RequestMapping(path = "/isRecycling", method = RequestMethod.POST)
  public Response handleRequest(@RequestBody Request jsonRequest) { 
    
    repository.save(
        new ImagePojo(
            jsonRequest.getImageType(), 
            jsonRequest.getBase64Data()
        )
    );
    
    System.out.println(new Date() + " Image: " + jsonRequest.getBase64Data());
    byte[] bytes = Base64.getDecoder().decode(jsonRequest.getBase64Data());
    
    try {
      BufferedImage image = ImageIO.read(new ByteArrayInputStream(bytes));
      
      ImageIO.write(image, "jpeg", new File("./myTestImage.jpeg"));
    
    } catch (IOException e) {
      
      e.printStackTrace();
      
      return new Response(1, "" + e, false, new LinkedList<String>());
    }
    
    int returnCode = 0;
    int numberOfImages = repository.findByImageType("jpeg").size();
    List<String> hints = new LinkedList<>();
    hints.add("Remember to check food items for food residue. ");
    hints.add("Blah, Blah, Blah. ");    
    
    return new Response(
        returnCode, 
        "Successfully hit end point. There are " + numberOfImages + " images currently stored. ",
        new Random().nextBoolean(),
        hints
    );    
  }
}
