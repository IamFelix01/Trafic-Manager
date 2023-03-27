package com.example.traficmanager.model;

public class AirPlane {
	private String type;
	private String consommation;
	private double capacite;
	public AirPlane(String type, String consommation, double capacite) {
		super();
		this.type = type;
		this.consommation = consommation;
		this.capacite = capacite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConsommation() {
		return consommation;
	}
	public void setConsommation(String consommation) {
		this.consommation = consommation;
	}
	public double getCapacite() {
		return capacite;
	}
	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}
	
}
