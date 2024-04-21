package com.Mailing.mailing.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@RequiredArgsConstructor
@Getter
@Setter
@Entity

public class MailingList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "mailingList", cascade = CascadeType.ALL)
    private List<Contact> contacts;
}