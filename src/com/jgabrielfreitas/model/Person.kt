package com.jgabrielfreitas.model

import java.util.UUID

/**
 * Created by JGabrielFreitas on 20/03/17.
 */
class Person(var name: String) {
    var id = UUID.randomUUID().toString()
}
