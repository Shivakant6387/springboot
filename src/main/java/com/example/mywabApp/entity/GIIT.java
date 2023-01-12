package com.example.mywabApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GIIT_EMPLOYEE")
public class GIIT {
    @Id
    @GeneratedValue
    private int id;
    private String employeeName;
    private int salary;
    private String status;


}
