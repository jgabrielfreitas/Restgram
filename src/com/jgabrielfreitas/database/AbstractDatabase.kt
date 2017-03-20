package com.jgabrielfreitas.database

import java.util.ArrayList

/**
 * Created by JGabrielFreitas on 20/03/17.
 */
open class AbstractDatabase<T> : Database<T> {

    private val items = ArrayList<T>()

    override fun add(t: T) {
        this.items.add(t)
    }

    override fun selectAll(): List<T> {
        return items
    }
}
