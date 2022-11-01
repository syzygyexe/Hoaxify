package com.hoaxify.user;

import org.springframework.data.jpa.repository.JpaRepository;

// Type of <Entity, Id>
public interface UserRepository extends JpaRepository<User, Long> {

    // find *** Containing ***
    User findByUsername(String username);
}
