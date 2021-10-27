package org.example.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class RoundingPolicy {

    static final Logger log = LoggerFactory.getLogger(RoundingPolicy.class);

    final double roundingFactor;

    public RoundingPolicy(int decimalPrecision) {
        log.debug("init");
        roundingFactor = Math.pow(10, decimalPrecision);
    }

    public double round(double val) {
        double result = (double) Math.round(val * roundingFactor) / roundingFactor;
        log.debug("Rounding {} to {}", val, result);
        return result;
    }
}
