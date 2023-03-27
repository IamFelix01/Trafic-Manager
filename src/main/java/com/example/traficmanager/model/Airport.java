package com.example.traficmanager.model;

public class Airport {
	private String nom;
	private String localisation;
	private int nbrPistes;
	private int nbrPlaceSol;
	private int DelaiAttSol;
	private int temppistes;
	private int detaiAnticollision;
	private int tempdecollage;
	private int dureeBoucleVol;
	private double distance;
	public Airport(String nom, String localisation, int nbrPistes, int nbrPlaceSol, int delaiAttSol, int temppistes,
			int detaiAnticollision, int tempdecollage, int dureeBoucleVol, double distance) {
		super();
		this.nom = nom;
		this.localisation = localisation;
		this.nbrPistes = nbrPistes;
		this.nbrPlaceSol = nbrPlaceSol;
		DelaiAttSol = delaiAttSol;
		this.temppistes = temppistes;
		this.detaiAnticollision = detaiAnticollision;
		this.tempdecollage = tempdecollage;
		this.dureeBoucleVol = dureeBoucleVol;
		this.distance = distance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public int getNbrPistes() {
		return nbrPistes;
	}
	public void setNbrPistes(int nbrPistes) {
		this.nbrPistes = nbrPistes;
	}
	public int getNbrPlaceSol() {
		return nbrPlaceSol;
	}
	public void setNbrPlaceSol(int nbrPlaceSol) {
		this.nbrPlaceSol = nbrPlaceSol;
	}
	public int getDelaiAttSol() {
		return DelaiAttSol;
	}
	public void setDelaiAttSol(int delaiAttSol) {
		DelaiAttSol = delaiAttSol;
	}
	public int getTemppistes() {
		return temppistes;
	}
	public void setTemppistes(int temppistes) {
		this.temppistes = temppistes;
	}
	public int getDetaiAnticollision() {
		return detaiAnticollision;
	}
	public void setDetaiAnticollision(int detaiAnticollision) {
		this.detaiAnticollision = detaiAnticollision;
	}
	public int getTempdecollage() {
		return tempdecollage;
	}
	public void setTempdecollage(int tempdecollage) {
		this.tempdecollage = tempdecollage;
	}
	public int getDureeBoucleVol() {
		return dureeBoucleVol;
	}
	public void setDureeBoucleVol(int dureeBoucleVol) {
		this.dureeBoucleVol = dureeBoucleVol;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
