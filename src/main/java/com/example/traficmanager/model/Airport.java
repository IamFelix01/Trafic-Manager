package com.example.traficmanager.model;

import java.util.ArrayList;
import java.util.Set;

public class Airport {
	private String nom;
	private String Location;
	private double Latitude;
	private double Longetude;
	private int nb_pistes;
	private int nb_station;
	private ArrayList<Piste> pistes;
	private ArrayList<Station> stations;
	private ArrayList<AirPlane> airplanes;
	private double duree_boucle;

	public Airport(String nom, String location, double latitude, double longetude, int nb_pistes, int nb_station, ArrayList<Piste> pistes, ArrayList<Station> stations, ArrayList<AirPlane> airplanes, double duree_boucle) {
		this.nom = nom;
		Location = location;
		Latitude = latitude;
		Longetude = longetude;
		this.nb_pistes = nb_pistes;
		this.nb_station = nb_station;
		this.pistes = pistes;
		this.stations = stations;
		this.airplanes = airplanes;
		this.duree_boucle = duree_boucle;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public void setLatitude(double latitude) {
		Latitude = latitude;
	}

	public void setLongetude(double longetude) {
		Longetude = longetude;
	}

	public void setNb_pistes(int nb_pistes) {
		this.nb_pistes = nb_pistes;
	}

	public void setNb_station(int nb_station) {
		this.nb_station = nb_station;
	}

	public void setPistes(ArrayList<Piste> pistes) {
		this.pistes = pistes;
	}

	public void setStations(ArrayList<Station> stations) {
		this.stations = stations;
	}

	public void setAirplanes(ArrayList<AirPlane> airplanes) {
		this.airplanes = airplanes;
	}

	public void setDuree_boucle(double duree_boucle) {
		this.duree_boucle = duree_boucle;
	}

	public String getNom() {
		return nom;
	}

	public String getLocation() {
		return Location;
	}

	public double getLatitude() {
		return Latitude;
	}

	public double getLongetude() {
		return Longetude;
	}

	public int getNb_pistes() {
		return nb_pistes;
	}

	public int getNb_station() {
		return nb_station;
	}

	public ArrayList<Piste> getPistes() {
		return pistes;
	}

	public ArrayList<Station> getStations() {
		return stations;
	}

	public ArrayList<AirPlane> getAirplanes() {
		return airplanes;
	}

	public double getDuree_boucle() {
		return duree_boucle;
	}
}
