package com.designpattern.strategy.capi;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.DateTime;

/**
 * Created by nirdosh on 19.08.15.
 */
public class MetaData {

  public String modelId;
  public DateTime initDate;
  public DateTime forecastDate;
  public String parameter;
  public String layer;


  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
    builder.append(modelId).append(initDate).append(forecastDate).append(parameter).append(layer);
    return  builder.toString();
  }
}
