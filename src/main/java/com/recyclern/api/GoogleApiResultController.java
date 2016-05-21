package com.recyclern.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recyclern.api.objects.GoogleApiResponse;

@RestController
public class GoogleApiResultController {

  @RequestMapping(path="/postResult", method = RequestMethod.POST)
  public String handleRequest(@RequestBody GoogleApiResponse request) {
    
    request.getResponses();
    return "Connected to Recyclern Server. ";
  }
}
