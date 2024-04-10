package com.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.User;

@Repository
public interface UserRepos extends JpaRepository<User, Long> {

}
