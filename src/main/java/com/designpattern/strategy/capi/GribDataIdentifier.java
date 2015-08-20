package com.designpattern.strategy.capi;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.DateTime;

/**
 * Created by nirdosh on 19.08.15.
 */
public class GribDataIdentifier {

  public String modelId;

  public DateTime initDate;

  public DateTime forecastDate;

  public String parameter;

  public String layer;

  public GribDataIdentifier(){

  }

  public GribDataIdentifier(String modelId, org.joda.time.DateTime initDate, DateTime forecastDate, String parameter, String layer) {
    this.modelId = modelId;
    this.initDate = initDate;
    this.forecastDate = forecastDate;
    this.parameter = parameter;
    this.layer = layer;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj.getClass() != getClass()){
      return false;
    }

    GribDataIdentifier rhs = (GribDataIdentifier) obj;

    return new EqualsBuilder().append(modelId, rhs.modelId)
                              .append(initDate,rhs.initDate)
                              .append(forecastDate,rhs.forecastDate)
                              .append(parameter, rhs.parameter)
                              .append(layer,rhs.layer)
                              .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(modelId).append(initDate).append(forecastDate).append(parameter).append(layer).build().hashCode();
  }
}
