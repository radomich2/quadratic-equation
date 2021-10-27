package org.example.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Application {

    static final Logger log = LoggerFactory.getLogger(Application.class);

    private final ParametersProvider paramsProvider;
    private final SquareRootsFinderService service;
    private final ResultProcessor resultsProcessor;

    public Application(ParametersProvider paramsProvider, SquareRootsFinderService service, ResultProcessor resultsProcessor) {
        log.debug("init");
        this.paramsProvider = paramsProvider;
        this.service = service;
        this.resultsProcessor = resultsProcessor;
    }

    public void run() {
        log.debug("run");
        Parameters parameters = paramsProvider.provide();
        List<Double> squareRoots = service.findSquareRoots(parameters);
        resultsProcessor.process(squareRoots);
    }
}
