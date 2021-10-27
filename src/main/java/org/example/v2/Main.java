package org.example.v2;

/**
 * Get an instance of my application and run it.
 */
public class Main {

    public static void main(String[] args) {
        DummyDI di = new DummyDI();
        di.getApplication().run();
    }
}
