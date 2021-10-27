package org.example.v2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Just logging out results.
 */
public class ResultProcessor {

    static final Logger log = LoggerFactory.getLogger(ResultProcessor.class);

    public ResultProcessor() {
        log.debug("init");
    }

    public void process(List<Double> roots) {
        log.info("Number of roots found: {}", roots.size());
        roots.stream().forEach(root -> {
            log.info("{}", root);
        });
        log.info("DONE");
    }
}
