package io.happylrd.ychat;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.happylrd.ychat.service.MyService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

public class Application extends ResourceConfig {

    public Application() {

        packages(MyService.class.getPackage().getName());

        register(JacksonJsonProvider.class);

        register(Logger.class);
    }
}
