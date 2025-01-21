package com.example.RationManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RationEntity")
public class RationEntity {
    private String name;
    @Id
    private int id;

}
