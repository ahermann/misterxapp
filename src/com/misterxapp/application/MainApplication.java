package com.misterxapp.application;

import java.util.HashSet;
import java.util.Set;

import com.misterxapp.resource.GameResource;
import com.misterxapp.resource.PlayerResource;

public class MainApplication extends javax.ws.rs.core.Application {

	private Set<Class<?>> classes;

	public MainApplication() {
		this.classes = new HashSet<Class<?>>();
		classes.add(GameResource.class);
		classes.add(PlayerResource.class);
	}
	
	public Set<Class<?>> getClasses() {
		return classes;
	}
}
