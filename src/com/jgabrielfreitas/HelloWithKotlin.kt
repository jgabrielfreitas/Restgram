package com.jgabrielfreitas

import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.MediaType.APPLICATION_JSON
import javax.ws.rs.core.Response
import javax.ws.rs.core.UriInfo

/**
 * Created by JGabrielFreitas on 18/03/17.
 */

@Path("/hellokotlin")
@Produces("text/plain")
class HelloWithKotlin {

    @GET
    fun getClichedMessage(): String {
        return "Hello World using Kotlin"
    }

    //    @GET
    //    fun getClichedMessage(@DefaultValue("Stranger!") @QueryParam("name") name:String,
    //                          @Context uriInfo: UriInfo): String {
    //        val query = uriInfo.getRequestUri().getQuery();
    //        return "Hello $name using Kotlin"
    //    }

    @GET
    @Path("/user")
    @Produces(APPLICATION_JSON)
    fun getRequest(@QueryParam("user") name: String): String {
        return "User is " + name;
    }

    @GET
    @Path("/query")
    fun getUsers(
            @QueryParam("from") from: String,
            @QueryParam("to") to: String,
            @QueryParam("orderBy") orderBy: MutableList<String>): Response {

        return Response
                .status(200)
                .entity("getUsers is called, from : " + from + ", to : " + to
                        + ", orderBy" + orderBy.toString()).build();

    }


}