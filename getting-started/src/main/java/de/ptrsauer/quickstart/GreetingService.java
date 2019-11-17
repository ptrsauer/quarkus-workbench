package de.ptrsauer.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    String greeting(String name) {
        return "hello " + name;
    }
}
