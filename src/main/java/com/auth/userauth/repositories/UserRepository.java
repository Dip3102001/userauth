package com.auth.userauth.repositories;

import org.springframework.stereotype.Repository;

import com.auth.userauth.entities.User;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
