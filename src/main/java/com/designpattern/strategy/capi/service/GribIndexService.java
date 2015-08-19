package com.designpattern.strategy.capi.service;

import com.designpattern.strategy.capi.GribDataIdentifier;
import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by nirdosh on 19.08.15.
 */
public interface GribIndexService {

  List<GribDataIdentifier> search(DateTime initDate);
}
