package com.designpattern.strategy;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.GribDataIdentifier;
import com.designpattern.strategy.capi.service.GribDataService;
import com.designpattern.strategy.capi.service.GribIndexService;
import com.designpattern.strategy.capi.service.MockedGribDataService;
import com.designpattern.strategy.capi.service.MockedGribIndexService;
import com.designpattern.strategy.interpolation.TemporalInterpolationStrategy;

/**
 * Created by nirdosh on 19.08.15.
 */
public class GribDataController {

  private GribDataService gribDataService;

  private GribIndexService gribIndexService;

  private TemporalInterpolationStrategy strategy;

  public GribDataController() {
    gribDataService = new MockedGribDataService();
    gribIndexService = new MockedGribIndexService();
  }

  public GribData getGribData(GribDataIdentifier identifier, String stretegy){

    GribData result = gribDataService.getData(identifier);


    if(result == null){
      this.strategy = new TemporalInterpolationFactory().create(stretegy,gribIndexService,gribDataService);
      result = strategy.interpolate(identifier.forecastDate);
    }
    return result;

  }
}
