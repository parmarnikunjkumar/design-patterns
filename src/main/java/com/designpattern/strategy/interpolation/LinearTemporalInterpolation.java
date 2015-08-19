package com.designpattern.strategy.interpolation;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.service.GribDataService;
import com.designpattern.strategy.capi.service.GribIndexService;
import org.joda.time.DateTime;

/**
 * Created by nirdosh on 19.08.15.
 */
public class LinearTemporalInterpolation implements TemporalInterpolationStrategy {

  private GribIndexService gribIndexService;

  private GribDataService gribDataService;

  public void setGribIndexService(GribIndexService gribIndexService) {
    this.gribIndexService = gribIndexService;
  }

  public void setGribDataService(GribDataService gribDataService) {
    this.gribDataService = gribDataService;
  }

  public GribData interpolate(DateTime dateTime) {
    System.out.println("Doing Liner interpolation!!!");
    DateTime knownInitDate = DateTime.parse("2015-08-19T00:00:00.000Z");
    GribData data = gribDataService.getData(gribIndexService.search(knownInitDate).get(0));
    data.metaData.forecastDate=dateTime;
    return data;
  }
}
