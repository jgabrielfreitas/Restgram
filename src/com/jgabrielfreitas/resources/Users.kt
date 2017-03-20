package com.jgabrielfreitas.resources

import com.google.gson.Gson
import com.jgabrielfreitas.model.Person

import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.UriInfo

import javax.ws.rs.core.MediaType.APPLICATION_JSON
import com.jgabrielfreitas.database.FakeDatabase.Companion.instance as database

/**
 * Created by JGabrielFreitas on 20/03/17.
 */

@Path("user")
class Users {

    @GET
    @Path("users")
    @Produces(APPLICATION_JSON)
    fun selectAllUsers(@Context ui: UriInfo): String {
        return Gson().toJson(database.selectAll())
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    @Path("/create")
    fun createNewUser(person: String): String {
        database.add(Gson().fromJson(person, Person::class.java))
        return "{\"success\":true}"
    }

}
