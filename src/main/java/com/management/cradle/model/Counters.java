package com.management.cradle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="counters")
public class Counters {

  @Id	
  private String counterId;
  private int nextValue;
  private String initialValue;
  public Counters() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Counters(String counterId, int nextValue, String intitialValue) {
		super();
		this.counterId = counterId;
		this.nextValue = nextValue;
		this.initialValue = intitialValue;
	}
	
	@Id
	public String getCounterId() {
		return counterId;
	}
	
	public void setCounterId(String counterId) {	
		this.counterId = counterId;
	}
	
	public int getNextValue() {
		return nextValue;
	}
	
	public void setNextValue(int nextValue) {
		this.nextValue = nextValue;
	}
	
	public String getIntitialValue() {
		return initialValue;
	}
	
	public void setIntitialValue(String intitialValue) {
		this.initialValue = intitialValue;
	}
	
	@Override
	public String toString() {
		return "Counters [counterId=" + counterId + ", nextValue=" + nextValue + ", intitialValue=" + initialValue
				+ "]";
	}
	
	
	public int nextValue() {
		return ++nextValue;
	}
	

  
}
