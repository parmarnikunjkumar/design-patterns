package com.designpattern.strategy;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by nirdosh on 20.08.15.
 */
public class CapiRequest {

  public String modelId;

  public DateTime initDate;

  public DateTime forecastDate;

  public String parameter;

  public String layer;

  public String temporalInterpolation;

  public CapiRequest(String modelId, DateTime initDate, DateTime forecastDate, String parameter, String layer) {
    this.modelId = modelId;
    this.initDate = initDate;
    this.forecastDate = forecastDate;
    this.parameter = parameter;
    this.layer = layer;
  }

  public CapiRequest(String modelId, DateTime initDate, DateTime forecastDate, String parameter, String layer, String temporalInterpolation) {
    this.modelId = modelId;
    this.initDate = initDate;
    this.forecastDate = forecastDate;
    this.parameter = parameter;
    this.layer = layer;
    this.temporalInterpolation = temporalInterpolation;
  }

}
