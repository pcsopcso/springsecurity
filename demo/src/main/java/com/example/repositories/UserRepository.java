package com.example.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.User;

@RepositoryRestResource(path = "members", collectionResourceRel = "members")
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}
