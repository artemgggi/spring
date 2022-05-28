package ru.artemgggi.springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import ru.artemgggi.springmvc.model.Authority;

public interface AuthorityRepository extends CrudRepository<Authority, Integer> {

    Authority findByAuthority(String authority);
}
