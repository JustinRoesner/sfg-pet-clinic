package com.hugesalt.sfgpetclinic.services;

import com.hugesalt.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    /* can delete these because we got them from crudService
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
    */
}
