package com.designpattern.strategy;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.GribDataIdentifier;
import com.designpattern.strategy.capi.service.GribDataService;
import com.designpattern.strategy.capi.service.GribIndexService;
import com.designpattern.strategy.interpolation.TemporalInterpolationStrategy;

/**
 * Created by nirdosh on 19.08.15.
 */
public class GribDataController {


  private GribDataService gribDataService;

  private GribIndexService gribIndexService;

  private TemporalInterpolationStrategy strategy;

  public GribDataController(GribDataService gribDataService) {
    this.gribDataService = gribDataService;
  }

  public GribDataController(GribDataService gribDataService, GribIndexService gribIndexService) {
    this.gribDataService = gribDataService;
    this.gribIndexService = gribIndexService;
  }

  public GribDataController(GribDataService gribDataService, GribIndexService gribIndexService, TemporalInterpolationStrategy strategy) {
    this.gribDataService = gribDataService;
    this.gribIndexService = gribIndexService;
    this.strategy = strategy;
  }

  public GribData getGribData(GribDataIdentifier identifier){

    GribData result = gribDataService.getData(identifier);

    if(result == null){
     result= strategy.interpolate(identifier.forecastDate);
    }
    return result;

  }
}
