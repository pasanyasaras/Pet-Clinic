package pasanyasara.projects.petclinic.services;

import pasanyasara.projects.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
//    Owner findById(Long id);
//    Owner save(Owner owner);
//    Set<Owner> findAll();
}
