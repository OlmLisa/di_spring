package com.esgi;

import javax.swing.*;

public class Helloer {

    Printer printer;

    public Helloer(Printer printer) {
        this.printer = printer;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void sayHello() {
        JOptionPane.showMessageDialog(null, printer);
    }

    @Override
    public String toString() {
        return "Helloer{" +
                "printer=" + printer +
                '}';
    }
}
