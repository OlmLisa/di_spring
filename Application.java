package com.esgi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory fac = new XmlBeanFactory(r);

        // Démarrer la DI

        // Printer
      //  Printer printer = (Printer)fac.getBean("c");
        Printer printer =  new Printer("test");
        Helloer H = new Helloer(printer);
        H.sayHello();



    }
}
