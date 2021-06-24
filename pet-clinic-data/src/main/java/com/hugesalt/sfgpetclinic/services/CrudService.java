package com.hugesalt.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    //implementing crud repository

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
