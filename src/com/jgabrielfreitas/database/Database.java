package com.jgabrielfreitas.database;

import java.util.List;

/**
 * Created by JGabrielFreitas on 20/03/17.
 */
public interface Database<T> {

    public void add(T t);

    public List<T> selectAll();

}
