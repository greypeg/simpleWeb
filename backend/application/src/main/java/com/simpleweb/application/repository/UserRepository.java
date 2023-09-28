package com.simpleweb.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simpleweb.application.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
