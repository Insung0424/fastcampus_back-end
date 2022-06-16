package com.fastcampus.jpa.book.manager.repository;

import com.fastcampus.jpa.book.manager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

}
