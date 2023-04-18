package org.example.kafka.consumer;

import java.util.List;
import org.example.kafka.producer.StringValue;
public interface StringValueConsumer {
    void accept(List<StringValue> value);
}