package com.mycompany.contactStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mycompany.contactStore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
