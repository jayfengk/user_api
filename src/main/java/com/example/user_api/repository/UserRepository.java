package com.example.user_api.repository;

import com.example.user_api.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // spring bean
public interface UserRepository extends CrudRepository<User, Integer> {
}
