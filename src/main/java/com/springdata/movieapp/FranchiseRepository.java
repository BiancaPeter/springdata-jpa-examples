package com.springdata.movieapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchiseRepository extends CrudRepository<Franchise, Long> {
}
