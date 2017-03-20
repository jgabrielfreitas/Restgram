package com.jgabrielfreitas.resources;

import com.google.gson.Gson;
import com.jgabrielfreitas.database.FakeDatabase;
import com.jgabrielfreitas.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

/**
 * Created by JGabrielFreitas on 20/03/17.
 */

@Path("user")
public class Users {

    @GET
    @Path("users")
    @Produces(APPLICATION_JSON)
    public String selectAllUsers(@Context UriInfo ui) {
        return new Gson().toJson(FakeDatabase.getInstance().selectAll());
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/create")
    public String createNewUser(String person) {
        FakeDatabase.getInstance().add(new Gson().fromJson(person, Person.class));
        return "{\"success\":true}";
    }

}
