package com.skilldistillery.archerygear.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="type_of_bow")
	private String typeOfBow;
	
	private String name;
	
	@Column(name="weight_of_pull")
	private int weightOfPull;
	
	@Column(name="weight_of_bow")
	private int weightOfBow;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfBow() {
		return typeOfBow;
	}

	public void setTypeOfBow(String typeOfBow) {
		this.typeOfBow = typeOfBow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeightOfPull() {
		return weightOfPull;
	}

	public void setWeightOfPull(int weightOfPull) {
		this.weightOfPull = weightOfPull;
	}

	public int getWeightOfBow() {
		return weightOfBow;
	}

	public void setWeightOfBow(int weightOfBow) {
		this.weightOfBow = weightOfBow;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bow other = (Bow) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Bow [id=" + id + ", typeOfBow=" + typeOfBow + ", name=" + name + ", weightOfPull=" + weightOfPull
				+ ", weightOfBow=" + weightOfBow + "]";
	}
	
	
}
