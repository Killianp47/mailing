package com.Mailing.mailing;

import com.Mailing.mailing.Entity.Contact;
import com.Mailing.mailing.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ContactRepository contactRepository;

    @Autowired
    public DataInitializer(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Contact c1 = new Contact();
        c1.setFirstName("John");
        c1.setLastName("Doe");
        c1.setEmail("john@example.com");
        contactRepository.save(c1);


        Contact c2 = new Contact();
        c2.setFirstName("JohnC2");
        c2.setLastName("DoeC2");
        c2.setEmail("johnC2@example.com");
        contactRepository.save(c2);
    }
}
