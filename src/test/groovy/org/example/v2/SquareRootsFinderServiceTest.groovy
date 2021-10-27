package org.example.v2

import spock.lang.Specification
import spock.lang.Unroll

class SquareRootsFinderServiceTest extends Specification {

    RoundingPolicy roundingPolicy = new RoundingPolicy(2)
    SquareRootsFinderService service = new SquareRootsFinderService(roundingPolicy)

    @Unroll
    def "FindSquareRoots #a #b #c => #expected"(double a, double b, double c, List<Double> expected) {
        expect:
        expected == service.findSquareRoots(new Parameters(a, b, c))
        where:
        a | b | c | expected
        1 | 0 | 1 | []
        1 | 0 | 0 | [0]
        1 | 0 | -1 | [-1, 1]
        1 | 0 | -4 | [-2, 2]
    }
}
