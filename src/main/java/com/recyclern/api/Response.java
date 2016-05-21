package com.recyclern.api;

import java.util.List;

public class Response {

  private final int code;
  private final String msg;
  private final boolean recycling;
  private final List<String> hints;
  
  public Response(int code, String msg, boolean isRecycling, List<String> hints) {
    this.code = code;
    this.msg = msg;
    this.recycling = isRecycling;
    this.hints = hints;
  }
  
  public int getCode() {
    return code;
  }
  
  public String getMsg() {
    return msg;
  }
  
  public boolean isRecycling() {
    return recycling;
  }
  
  public List<String> getHints() {
    return hints;
  }
  
}
