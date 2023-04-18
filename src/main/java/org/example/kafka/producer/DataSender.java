package org.example.kafka.producer;

public interface DataSender {
    void send(StringValue value);
}
