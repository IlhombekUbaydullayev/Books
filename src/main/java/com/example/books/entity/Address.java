package com.example.books.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address extends AuditEntity {
    private String street;
    private int houseNumber;
    private String country;
}
