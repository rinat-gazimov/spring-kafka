package org.example.kafka.producer;

import org.springframework.stereotype.Service;
import org.springframework.boot.CommandLineRunner;

@Service
public class Runner implements CommandLineRunner {

    private final ValueSource valueSource;

    public Runner(ValueSource valueSource) {
        this.valueSource = valueSource;
    }

    @Override
    public void run(String... args) {
        valueSource.generate();
    }

}
