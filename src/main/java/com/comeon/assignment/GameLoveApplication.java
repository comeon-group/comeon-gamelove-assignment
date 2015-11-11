package com.comeon.assignment;

import com.comeon.assignment.health.TemplateHealthCheck;
import com.comeon.assignment.resources.GameLoveResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Hello Comeon!
 *
 * Created by Alberto on 2015-11-11
 */
public class GameLoveApplication extends Application<GameLoveConfiguration>
{
    public static void main( String[] args ) throws Exception
    {
        new GameLoveApplication().run(args);
    }

    @Override
    public void run(GameLoveConfiguration gameLoveConfiguration, Environment environment) throws Exception {
        final GameLoveResource resource = new GameLoveResource(
                gameLoveConfiguration.getTemplate(),
                gameLoveConfiguration.getDefaultName()
        );
        environment.jersey().register(resource);
        environment.healthChecks().register("GameLoveService", new TemplateHealthCheck(gameLoveConfiguration.getTemplate()));
    }
}
