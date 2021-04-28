package com.te.springwithhibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@Table(name="studentinfo")
public class Student  implements Serializable {
	@Id
	@Column
	private int id;
	@Column
	private String gender;
	@Column
	private String name;
	@Column
	private int standard;
	@Autowired(required=false)
	@OneToOne
	private Adress adress;
}
