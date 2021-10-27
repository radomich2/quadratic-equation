package org.example.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Finds square roots from quadratic equation a * x^2 + b * x + c = 0
 * with given a,b,c parameters.
 */
public class SquareRootsFinderService {

    static final Logger log = LoggerFactory.getLogger(SquareRootsFinderService.class);

    private final RoundingPolicy roundingPolicy;

    public SquareRootsFinderService(RoundingPolicy roundingPolicy) {
        log.debug("init");
        this.roundingPolicy = roundingPolicy;
    }

    public List<Double> findSquareRoots(Parameters params) {
        double delta = calculateDelta(params.getA(), params.getB(), params.getC());
        return getRoots(delta, params)
                .stream()
                .map(root -> roundingPolicy.round(root))
                .collect(Collectors.toList());
    }

    private double calculateDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private List<Double> getRoots(double delta, Parameters params) {
        List<Double> roots = new ArrayList<>();
        if (delta < 0) {
            // do nothing
        } else if (delta == 0) {
            roots.add(getSingleRoot(params.getA(), params.getB()));
        } else {
            roots.add(getFirstRoot(params.getA(), params.getB(), delta));
            roots.add(getSecondRoot(params.getA(), params.getB(), delta));
        }
        return roots;
    }

    private double getSingleRoot(double a, double b) {
        return -b / 2 * a;
    }

    private double getFirstRoot(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    private double getSecondRoot(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

}
