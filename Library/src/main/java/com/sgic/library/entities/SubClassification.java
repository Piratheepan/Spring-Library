package com.sgic.library.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.Id;

@Entity
@Table(schema="library",name="subclassification")
public class SubClassification implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String subclassificationname;
	
	@ManyToOne
	@JsonProperty(access=Access.WRITE_ONLY)
	@JoinColumn(name="mainClassification", nullable=false)
	
	private MainClassification mainClassification;
	
//	private String mainclassification;
	
	public Long getId() {
		return id;
	}
	
	public MainClassification getMainClassification() {
		return mainClassification;
	}
	
	public void setMainClassification(MainClassification mainClassification) {
		this.mainClassification = mainClassification;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubclassificationname() {
		return subclassificationname;
	}
	public void setSubclassificationname(String subclassificationname) {
		this.subclassificationname = subclassificationname;
	}
	
//	public String getMainclassification() {
//		return mainclassification;
//	}
//
//	public void setMainclassification(String mainclassification) {
//		this.mainclassification = mainclassification;
//	}
	


	
	
}
