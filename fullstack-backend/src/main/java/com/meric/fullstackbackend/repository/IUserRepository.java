package com.meric.fullstackbackend.repository;

import com.meric.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
