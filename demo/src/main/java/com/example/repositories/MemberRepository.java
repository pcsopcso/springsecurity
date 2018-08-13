package com.example.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Member;

@RepositoryRestResource(path = "members", collectionResourceRel = "members")
public interface MemberRepository extends PagingAndSortingRepository<Member,Long> {
}
