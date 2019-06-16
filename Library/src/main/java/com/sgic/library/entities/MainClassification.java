package com.sgic.library.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;

@Entity
@Table(schema="library",name="mainclassification")
public class MainClassification implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@OneToMany(mappedBy="mainClassification",cascade= {CascadeType.ALL},fetch = FetchType.EAGER)

	private List<SubClassification> subClassification;
	
	public List<SubClassification> getSubClassification() {
		return subClassification;
	}
	
	public void setSubClassification(List<SubClassification> subClassification) {
		this.subClassification = subClassification;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
