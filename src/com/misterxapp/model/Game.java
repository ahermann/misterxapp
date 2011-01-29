package com.misterxapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Game {

	private Long id;
	private String name;

	private List<Player> players = new ArrayList<Player>();

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

	@XmlElement
	public List<Player> getPlayers() {
		return new ArrayList<Player>(this.players);
	}
	
	public void addPlayer(Player p) {
		this.players.add(p);
	}
	
	public void removePlayer(Player p) {
		this.players.remove(p);
	}
	
}
