package com.designpattern.strategy.capi;

import org.joda.time.DateTime;

/**
 * Created by nirdosh on 19.08.15.
 */
public class GribDataIdentifierBuilder {

  private String modelId;

  private org.joda.time.DateTime initDate;

  private DateTime forecastDate;

  private String parameter;

  private String layer;

  private String interpolation;

  public GribDataIdentifierBuilder(){

  }

  public GribDataIdentifierBuilder model(String modelId){
    this.modelId = modelId;
    return this;
  }

  public GribDataIdentifierBuilder initDate(org.joda.time.DateTime initDate){
    this.initDate = initDate;
    return this;
  }

  public GribDataIdentifierBuilder forecastDate(DateTime forecastDate){
    this.forecastDate = forecastDate;
    return  this;
  }

  public GribDataIdentifierBuilder parameter(String  parameter){
    this.parameter = parameter;
    return  this;
  }

  public GribDataIdentifierBuilder layer(String  layer){
    this.layer = layer;
    return  this;
  }

  public GribDataIdentifier build(){
    return new GribDataIdentifier(modelId,initDate,forecastDate,parameter,layer);
  }
}
