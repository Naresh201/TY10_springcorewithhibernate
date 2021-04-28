package com.te.springwithhibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="adressinfo")

public class Adress  implements Serializable{
	@Column
	private String permanentadress;
	@Column
	@Id
	private String currentadress;
	@OneToOne
	private Student student;

}
