package com.designpattern.strategy.interpolation;

import com.designpattern.strategy.capi.GribData;
import org.joda.time.DateTime;

/**
 * Created by nirdosh on 19.08.15.
 */
public interface TemporalInterpolationStrategy {

  GribData interpolate(DateTime dateTime);
}
