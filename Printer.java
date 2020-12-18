package com.esgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:values.properties")
public class Printer {

    private final String printer;

    @Autowired
    public Printer( @Value("Bonjour tout le monde") String printer) {
        this.printer = printer;
    }

    public void printHello() {
        System.out.println(printer);
    }

    public String getPrinter() {
        return printer;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "printer='" + printer + '\'' +
                '}';
    }
}
