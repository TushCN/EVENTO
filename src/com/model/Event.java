package com.model;

public class Event
{
  String e_name;
  String dt;
  String venue;
  String fees;
  String about;
  
  public Event(String e_name, String dt, String venue, String fees, String about) {
    this.e_name = e_name;
    this.dt = dt;
    this.venue = venue;
    this.fees = fees;
    this.about = about;
  }
  
  public String gete_name() { return e_name; }
  
  public void sete_name(String e_name) {
    this.e_name = e_name;
  }
  
  public String getDt() { return dt; }
  
  public void setDt(String dt) {
    this.dt = dt;
  }
  
  public String getVenue() { return venue; }
  
  public void setVenue(String venue) {
    this.venue = venue;
  }
  
  public String getFees() { return fees; }
  
  public void setFees(String fees) {
    this.fees = fees;
  }
  
  public String getabout() { return about; }
  
  public void setabout(String about) {
    this.about = about;
  }

}

