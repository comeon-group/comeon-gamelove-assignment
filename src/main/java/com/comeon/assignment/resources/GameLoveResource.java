package com.comeon.assignment.resources;

import com.codahale.metrics.annotation.Timed;
import com.comeon.assignment.representations.Saying;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by alberto on 2015-11-11.
 */
@Path("/love")
@Produces(MediaType.APPLICATION_JSON)
public class GameLoveResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public GameLoveResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }
}
