package com.example.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Books extends AuditEntity {
    private String name;
    private String title;
    private String body;
    @OneToOne
    private Authhor authhor;
    @OneToOne
    private Images images;
    @OneToOne
    private Address address;
}
