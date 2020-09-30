package com.example.demo.entities;

import java.io.Serializable;

import com.example.demo.entities.enums.Department;

public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Department department;
	
	public Client() {}

	public Client(Integer idClient, String name, Department department) {
		super();
		this.id = idClient;
		this.name = name;
		this.department = department;
	}

	public Integer getIdClient() {
		return id;
	}

	public void setIdClient(Integer idClient) {
		this.id = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
