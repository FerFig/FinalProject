package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.ferfig.gradlejokeslib.GradleJokesLibrary;

/** An endpoint class we are exposing */
@Api(
        name = "myJokesApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        GradleJokesLibrary gradleJokeLib =  new GradleJokesLibrary();
        MyBean response = new MyBean();
        response.setData(gradleJokeLib.getJoke());
        return response;
    }
}
