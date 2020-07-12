package com.internship.repository;

import com.internship.entity.Ingredient;
import com.internship.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {

    // Optional<User> findByUser(int userId);

}