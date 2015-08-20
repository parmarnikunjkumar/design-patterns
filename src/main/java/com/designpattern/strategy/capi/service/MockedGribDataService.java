package com.designpattern.strategy.capi.service;

import com.designpattern.strategy.capi.*;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by nirdosh on 19.08.15.
 */
public class MockedGribDataService implements GribDataService {

  private static HashMap<GribDataIdentifier, GribData> map;

  static {
    map = new HashMap<GribDataIdentifier, GribData>();
    for(GribDataIdentifier identifier: createDataIdentifiers()){
      map.put(identifier, createRandomGribData(identifier));
    }

  }

  private static GribData createRandomGribData(GribDataIdentifier gid) {

    GribData result = new GribData();


    result.data = new Random().nextDouble()*10;
    result.metaData = new MetaData();
    result.metaData.modelId = gid.modelId;
    result.metaData.initDate = gid.initDate;
    result.metaData.forecastDate = gid.forecastDate;
    result.metaData.parameter =gid.parameter;
    result.metaData.layer = gid.layer;

    return result;
  }


  public GribData getData(GribDataIdentifier gribDataIdentifier) {
    return map.get(gribDataIdentifier);
  }


  private static List<GribDataIdentifier> createDataIdentifiers() {
    List<GribDataIdentifier> result = new ArrayList();

    result.add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T00:00:00.000Z")).parameter("temperature").layer("sfc").build());
    result.add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T03:00:00.000Z")).parameter("temperature").layer("sfc").build());
    result.add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T06:00:00.000Z")).parameter("temperature").layer("sfc").build());
    result.add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T09:00:00.000Z")).parameter("temperature").layer("sfc").build());
    result.add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T12:00:00.000Z")).parameter("temperature").layer("sfc").build());
    result.add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T15:00:00.000Z")).parameter("temperature").layer("sfc").build());

    return result;
  }
}
