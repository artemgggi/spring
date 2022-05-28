package ru.artemgggi.springmvc.repository;

import org.springframework.data.repository.CrudRepository;
import ru.artemgggi.springmvc.model.User;

public interface UserRepository extends CrudRepository<User, Integer> { }
