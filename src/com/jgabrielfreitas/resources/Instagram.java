package com.jgabrielfreitas.resources;

import com.google.gson.Gson;
import com.jgabrielfreitas.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.UUID;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by JGabrielFreitas on 20/03/17.
 */

@Path("insta")
public class Instagram {

    @GET
    @Path("/gram")
    @Produces(APPLICATION_JSON)
    public String getUserinfo(@Context UriInfo ui) {
        return "try /gram/{username}";
    }

    @GET
    @Path("/gram/{username}")
    @Produces(APPLICATION_JSON)
    public String getUserinfo(@PathParam("username") String userName, @Context UriInfo ui) {
        return new Gson().toJson(new Person(userName));
    }

}
