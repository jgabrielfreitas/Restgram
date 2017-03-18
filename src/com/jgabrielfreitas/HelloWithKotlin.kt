package com.jgabrielfreitas

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

/**
 * Created by JGabrielFreitas on 18/03/17.
 */

@Path("/hellokotlin")
class HelloWithKotlin {

    @GET
    @Produces("text/plain")
    fun getClichedMessage(): String {
        return "Hello World using Kotlin"
    }
}