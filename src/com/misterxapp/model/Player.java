package com.misterxapp.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {

	private Long id;
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@XmlElement
	public Long getId() {
		return id;
	}
	
}
