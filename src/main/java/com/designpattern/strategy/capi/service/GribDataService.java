package com.designpattern.strategy.capi.service;

import com.designpattern.strategy.capi.GribData;
import com.designpattern.strategy.capi.GribDataIdentifier;

/**
 * Created by nirdosh on 19.08.15.
 */
public interface GribDataService {

  GribData getData(GribDataIdentifier gribDataIdentifier);

}
