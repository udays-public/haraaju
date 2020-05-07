package org.haraaju.itemservice;


import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ItemRepository extends CrudRepository<Item, Long> {

}
