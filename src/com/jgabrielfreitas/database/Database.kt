package com.jgabrielfreitas.database

/**
 * Created by JGabrielFreitas on 20/03/17.
 */
interface Database<T> {

    fun add(t: T)

    fun selectAll(): List<T>

}
