package io.happylrd.ychat;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

public class Application extends ResourceConfig {

    public Application() {

        register(JacksonJsonProvider.class);

        register(Logger.class);
    }
}
