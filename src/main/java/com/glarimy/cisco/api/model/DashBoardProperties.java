package com.glarimy.cisco.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DashBoardProperties {
	@Id
	public int id;

	public String name;

	public String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
