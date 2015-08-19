package com.designpattern.strategy.capi;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by nirdosh on 19.08.15.
 */
public class GribData {

  public MetaData metaData;
  public double data;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
