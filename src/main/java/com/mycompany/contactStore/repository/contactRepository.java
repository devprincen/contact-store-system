package com.mycompany.contactStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.contactStore.model.Contact;
import com.mycompany.contactStore.model.User;

public interface contactRepository extends JpaRepository<Contact, Long> {
    User findByuUsername(String username);
}
