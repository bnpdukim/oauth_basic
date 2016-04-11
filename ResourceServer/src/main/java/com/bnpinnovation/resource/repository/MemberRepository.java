package com.bnpinnovation.resource.repository;

import com.bnpinnovation.resource.domain.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sajacaros on 2016-04-07.
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long>{
}
