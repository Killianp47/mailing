package com.Mailing.mailing.Service;

import com.Mailing.mailing.Repository.MailingListRepository;
import org.springframework.stereotype.Service;

@Service
public class MailingListService {
    private final MailingListRepository mailingListRepository;

    public MailingListService(MailingListRepository mailingListRepository) {
        this.mailingListRepository = mailingListRepository;
    }
}
