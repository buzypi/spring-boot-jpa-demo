package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "profile")
	private List<Experience> experiences = new ArrayList<>();

	// @formatter:off
	@ManyToMany
	@JoinTable(
			name = "profile_websites",
			joinColumns = @JoinColumn(name = "profile_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "website_id", referencedColumnName = "id")
	)
	// @formatter:on
	private List<Website> websites = new ArrayList<>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public void addExperience(Experience e) {
		this.experiences.add(e);
		e.setProfile(this);
	}

	public void addWebsite(Website w) {
		this.websites.add(w);
	}

}