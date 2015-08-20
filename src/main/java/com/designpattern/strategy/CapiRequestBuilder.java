package com.designpattern.strategy;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by nirdosh on 20.08.15.
 */
public class CapiRequestBuilder {

  private String modelId;

  private DateTime initDate;

  private DateTime forecastDate;

  private String parameter;

  private String layer;

  private String temporalInterpolation;


  public static CapiRequestBuilder builder(){
    return new CapiRequestBuilder();
  }

  public CapiRequestBuilder modelId(String modelId){
    this.modelId = modelId;
    return this;
  }

  public CapiRequestBuilder initDate(DateTime initDate){
    this.initDate = initDate;
    return this;
  }

  public CapiRequestBuilder forecastDate(DateTime forecastDate){
    this.forecastDate = forecastDate;
    return this;
  }

  public CapiRequestBuilder parameter(String parameter){
    this.parameter = parameter;
    return this;
  }

  public CapiRequestBuilder layer(String layer){
    this.layer = layer;
    return this;
  }

  public CapiRequestBuilder temporalInterploation(String temporalInterpolation){
    this.temporalInterpolation = temporalInterpolation;
    return this;
  }

  public CapiRequest build(){

    if(modelId !=null && initDate!=null && forecastDate!=null && parameter!=null && layer!=null ){
      CapiRequest capiRequest;
      if(StringUtils.isNotEmpty(temporalInterpolation)) {
         capiRequest = new CapiRequest(modelId, initDate, forecastDate, parameter, layer,temporalInterpolation);
      } else{
          capiRequest =  new CapiRequest(modelId,initDate,forecastDate,parameter,layer);
      }
      return capiRequest;

    }
    return null;
  }
}
