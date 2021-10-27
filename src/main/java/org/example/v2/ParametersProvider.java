package org.example.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Reading parameters from console in an interactive way.
 * (so here is the only place where System.in / System.out are OK)
 */
public class ParametersProvider {

    static final Logger log = LoggerFactory.getLogger(ParametersProvider.class);

    private final Scanner scanner;

    public ParametersProvider() {
        log.debug("init");
        scanner = new Scanner(System.in);
    }

    public Parameters provide() {
        System.out.println("Please, provide a,b,c parameters of a quadratic equation:");
        double a = readDouble("a");
        double b = readDouble("b");
        double c = readDouble("c");
        return new Parameters(a, b, c);
    }

    private double readDouble(String parameterName) {
        System.out.print("Enter parameter " + parameterName + ":");
        return scanner.nextDouble();
    }
}
