package com.designpattern.strategy.capi.service;

import com.designpattern.strategy.capi.GribDataIdentifier;
import com.designpattern.strategy.capi.GribDataIdentifierBuilder;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nirdosh on 19.08.15.
 */
public class MockedGribIndexService implements GribIndexService {

  private static Map<DateTime, List<GribDataIdentifier>> list;
  static{
    list = new HashMap<DateTime, List<GribDataIdentifier>>();
    populateList();
  }

  private static void populateList() {
    DateTime initDate = DateTime.parse("2015-08-19T00:00:00.000Z");
    list.put(initDate, new ArrayList<GribDataIdentifier>());
    list.get(initDate).add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T03:00:00.000Z")).parameter("temperature").layer("sfc").build());
    list.get(initDate).add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T06:00:00.000Z")).parameter("temperature").layer("sfc").build());
    list.get(initDate).add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T09:00:00.000Z")).parameter("temperature").layer("sfc").build());
    list.get(initDate).add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T12:00:00.000Z")).parameter("temperature").layer("sfc").build());
    list.get(initDate).add(new GribDataIdentifierBuilder().model("det-ecmwf-hres").initDate(DateTime.parse("2015-08-19T00:00:00.000Z")).forecastDate(DateTime.parse("2015-08-19T15:00:00.000Z")).parameter("temperature").layer("sfc").build());
  }

  public List<GribDataIdentifier> search(DateTime initDate) {
    return list.get(initDate);
  }
}
