package com.fing.app.models;


public class Usuario {

  private String name;
  private String email;
  private String carrera;

  public Usuario(String name, String email, String carrera) {
    this.name = name;
    this.email = email;
    this.carrera = carrera;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public String getCarrera() {
	return carrera;
  }

  public void setCarrera(String carrera) {
	this.carrera = carrera;
  }


}