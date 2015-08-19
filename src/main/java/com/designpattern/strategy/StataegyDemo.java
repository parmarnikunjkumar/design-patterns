package com.designpattern.strategy;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.GribDataIdentifier;
import com.designpattern.strategy.capi.GribDataIdentifierBuilder;
import com.designpattern.strategy.capi.service.GribDataService;
import com.designpattern.strategy.capi.service.GribIndexService;
import com.designpattern.strategy.capi.service.MockedGribDataService;
import com.designpattern.strategy.capi.service.MockedGribIndexService;
import com.designpattern.strategy.interpolation.CubicSplineInterpolation;
import com.designpattern.strategy.interpolation.LinearTemporalInterpolation;
import com.designpattern.strategy.interpolation.TemporalInterpolationStrategy;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by nirdosh on 19.08.15.
 */
public class StataegyDemo {

  public static void main(String[] args) {

    TemporalInterpolationStrategy strategy = new CubicSplineInterpolation();

    GribDataService gribDataService = new MockedGribDataService();

    GribIndexService gribIndexService = new MockedGribIndexService();

    ((CubicSplineInterpolation) strategy).setGribDataService(gribDataService);
    ((CubicSplineInterpolation) strategy).setGribIndexService(gribIndexService);

    GribDataController controller = new GribDataController(gribDataService,gribIndexService,strategy);

    GribDataIdentifier identifier = new GribDataIdentifierBuilder().model("det-ecmwf-hres")
                                                                    .initDate(DateTime.parse("2015-08-19T00:00:00.000Z"))
                                                                    .forecastDate(DateTime.parse("2015-08-19T16:00:00.000Z"))
                                                                    .parameter("temperature")
                                                                    .layer("sfc")
                                                                    .build();
    GribData data = controller.getGribData(identifier);

    System.out.println(data);

  }
}

