package com.Mailing.mailing.Repository;

import com.Mailing.mailing.Entity.MailingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailingListRepository extends JpaRepository<MailingList, Long> {
}
