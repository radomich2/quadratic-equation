package org.example.v2;

/**
 * Dummy and extremely trivial "Dependency Injection Framework".
 * (it even doesn't support singletons...)
 */
public class DummyDI {

    public Application getApplication() {
        return new Application(
                getParametersProvider(),
                getService(),
                getResultProcessor());
    }

    public ParametersProvider getParametersProvider() {
        return new ParametersProvider();
    }

    public RoundingPolicy getRoundingPolicy() {
        return new RoundingPolicy(2);
    }

    public ResultProcessor getResultProcessor() {
        return new ResultProcessor();
    }

    public SquareRootsFinderService getService() {
        return new SquareRootsFinderService(getRoundingPolicy());
    }
}
