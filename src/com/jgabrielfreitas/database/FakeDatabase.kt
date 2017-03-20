package com.jgabrielfreitas.database

import com.jgabrielfreitas.model.Person

/**
 * Created by JGabrielFreitas on 20/03/17.
 */

// PS: Singleton pattern in Kotlin
class FakeDatabase private constructor() : AbstractDatabase<Person>() {

    companion object {
        val instance = FakeDatabase()
    }

}
