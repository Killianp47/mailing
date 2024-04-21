package com.Mailing.mailing.Repository;

import com.Mailing.mailing.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
