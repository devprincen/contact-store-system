package com.mycompany.contactStore.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.mycompany.contactStore.model.Contact;
import com.mycompany.contactStore.repository.contactRepository;

@Service
public class ContactService {

    private final contactRepository repo;

    public ContactService(contactRepository repo) {
        this.repo = repo;
    }

    public List<Contact> getAll() {
        return repo.findAll();
    }

    public Contact add(Contact c) {
        return repo.save(c);
    }

    public Contact update(Long id, Contact newData) {
        Contact c = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found"));

        c.setName(newData.getName());
        c.setEmail(newData.getEmail());

        return repo.save(c);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}