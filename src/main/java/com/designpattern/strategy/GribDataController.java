package com.designpattern.strategy;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.GribDataIdentifier;
import com.designpattern.strategy.capi.service.GribDataService;
import com.designpattern.strategy.capi.service.GribIndexService;
import com.designpattern.strategy.capi.service.MockedGribDataService;
import com.designpattern.strategy.capi.service.MockedGribIndexService;
import com.designpattern.strategy.interpolation.TemporalInterpolationStrategy;
import org.apache.commons.lang3.StringUtils;

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

  public GribData getGribData(CapiRequest request){

    GribDataIdentifier identifier = new GribDataIdentifier(request.modelId,request.initDate,request.forecastDate,request.parameter,request.layer);

    GribData result = gribDataService.getData(identifier);


    if(result == null && StringUtils.isNotEmpty(request.temporalInterpolation)){
      this.strategy = new TemporalInterpolationFactory().create(request.temporalInterpolation,gribIndexService,gribDataService);
      result = strategy.interpolate(identifier.forecastDate);
    }
    return result;


  }


}
