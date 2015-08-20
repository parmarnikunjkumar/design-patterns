package com.designpattern.strategy;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.GribDataIdentifier;
import com.designpattern.strategy.capi.GribDataIdentifierBuilder;
import org.joda.time.DateTime;

/**
 * Created by nirdosh on 19.08.15.
 */
public class StataegyDemo {

  public static void main(String[] args) {

    GribDataController controller = new GribDataController();

    GribDataIdentifier identifier = new GribDataIdentifierBuilder().model("det-ecmwf-hres")
                                                                    .initDate(DateTime.parse("2015-08-19T00:00:00.000Z"))
                                                                    .forecastDate(DateTime.parse("2015-08-19T01:00:00.000Z"))
                                                                    .parameter("temperature")
                                                                    .layer("sfc")
                                                                    .build();
    GribData data = controller.getGribData(identifier, "linear");

    System.out.println(data);

    data = controller.getGribData(identifier,"cubic");

    System.out.println(data);

  }
}

