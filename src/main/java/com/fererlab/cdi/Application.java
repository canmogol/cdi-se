package com.fererlab.cdi;

import com.fererlab.cdi.service.ProductService;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class Application {

    @Inject
    private ProductService productService;

    public void startup(@Observes ContainerInitialized event) {
        System.out.println("--------- event = " + event);
    }

    public void run() {
        System.out.println("--------- ProductService is injected! this.productService.findAll() = " + this.productService.findAll());
    }
}
