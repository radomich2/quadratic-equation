package org.example.v1

import spock.lang.Specification

class MainTest extends Specification {

    Main m = new Main()

    def "FindSquareRoots"(double a, double b, double c, List<Double> roots) {
        expect:
        roots == m.findSquareRoots(a, b, c)
        where:
        a | b | c | roots
        1 | 0 | 1 | []
        1 | 0 | 0 | [0]
    }

}
