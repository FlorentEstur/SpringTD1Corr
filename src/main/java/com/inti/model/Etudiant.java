package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name= "EtudiantSpring")
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Etudiant {

	@Id
	private int id;
	@NonNull
	private String nom;
	private String prenom;
	private String tel;
	private String mail;
	
}
