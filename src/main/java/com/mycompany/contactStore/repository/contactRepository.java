package com.mycompany.contactStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mycompany.contactStore.model.Contact;

public interface contactRepository extends JpaRepository<Contact, Long> {
}
