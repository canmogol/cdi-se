package com.fererlab.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class StandaloneStartup {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();
        Application application = weldContainer.instance().select(Application.class).get();
        application.run();
        weld.shutdown();
    }

}
