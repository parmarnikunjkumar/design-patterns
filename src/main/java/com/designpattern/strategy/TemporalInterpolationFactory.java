package com.designpattern.strategy;

import com.designpattern.strategy.capi.service.GribDataService;
import com.designpattern.strategy.capi.service.GribIndexService;
import com.designpattern.strategy.interpolation.CubicSplineInterpolation;
import com.designpattern.strategy.interpolation.LinearTemporalInterpolation;
import com.designpattern.strategy.interpolation.TemporalInterpolationStrategy;

/**
 * Created by nirdosh on 20.08.15.
 */
public class TemporalInterpolationFactory {

  public static final String LINEAR = "linear";
  public static final String CUBIC = "cubic";

  public TemporalInterpolationStrategy create(String name, GribIndexService indexService, GribDataService dataService){

    switch (name){
      case LINEAR:
        return new LinearTemporalInterpolation(indexService,dataService);
      case CUBIC:
        return new CubicSplineInterpolation(indexService, dataService);

      default:
        break;
    }
    return null;
  }
}
