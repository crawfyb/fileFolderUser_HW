package com.codeclan.fileFolderUserHWJava.fileFolderUser.repository;

import com.codeclan.fileFolderUserHWJava.fileFolderUser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
