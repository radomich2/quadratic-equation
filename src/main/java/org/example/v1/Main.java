package org.example.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Create program that will find square root from quadratic equation a * x^2 + b * x + c = 0.
     * Numbers a, b, c, should be entered during program running by user
     * When printing out solutions (suare root) it should be rounded down to max 2 digits after coma
     */
    public static void main(String[] args) {
        System.out.println("========= "+ Arrays.toString(args));
    }

    List<Double> findSquareRoots(double a, double b, double c) {
        double delta = getDelta(a, b, c);
        return getRoots(delta, a, b);
    }

    double getDelta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    List<Double> getRoots(double delta, double a, double b) {
        List<Double> roots = new ArrayList<>();
        if (delta < 0) {
            // do nothing
        } else if (delta == 0) {
            roots.add(getSingleRoot(a, b));
        } else {
            roots.add(getFirstRoot(a, b, delta));
            roots.add(getSecondRoot(a, b, delta));
        }
        return roots;
    }

    double getSingleRoot(double a, double b) {
        return -b / 2 * a;
    }

    double getFirstRoot(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / 2 * a;
    }

    double getSecondRoot(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / 2 * a;
    }

}
