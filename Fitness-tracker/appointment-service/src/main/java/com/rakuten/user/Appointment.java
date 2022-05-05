package com.rakuten.user;


public class Appointment {
	private TRAINERPREFERENCE trainerPreference;
	private PHYSIOTHERAPIST requiredPhysiotherapist;
	private Customer customer;
	

	public TRAINERPREFERENCE getTrainerPreference() {
		return trainerPreference;
	}


	public void setTrainerPreference(TRAINERPREFERENCE trainerPreference) {
		this.trainerPreference = trainerPreference;
	}


	public PHYSIOTHERAPIST getRequiredPhysiotherapist() {
		return requiredPhysiotherapist;
	}


	public void setRequiredPhysiotherapist(PHYSIOTHERAPIST requiredPhysiotherapist) {
		this.requiredPhysiotherapist = requiredPhysiotherapist;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Appointment [ trainerPreference=" + trainerPreference +",requiredPhysiotherapist=" + requiredPhysiotherapist + " customer=" + customer +"]";
	}
}
