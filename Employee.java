package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@JsonFormat(pattern="yyyy-MM-dd")
	Date dateofbirth;
	int salary;
	String designation;
	@JsonFormat(pattern="yyyy-MM-dd")
	Date joiningdate;
	@JsonFormat(pattern="yyyy-MM-dd")
	Date exitdate;
	String manager;
}