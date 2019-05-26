package com.sujan;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface StudeentRepository extends CrudRepository<Studeent, String> {
}
