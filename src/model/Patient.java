package model;

public class Patient {
	
	private String name;
	private String desease;
	private Patient nextPatient;
	private Patient previousPatient;
	
	public Patient(String n, String d) {
		this.name = n;
		this.desease = d;
	}

	public String getName() {
		return name;
	}


	public String getDesease() {
		return desease;
	}

	public Patient getNextPatient() {
		return nextPatient;
	}

	public void setNextPatient(Patient nextPatient) {
		this.nextPatient = nextPatient;
	}

	public Patient getPreviousPatient() {
		return previousPatient;
	}

	public void setPreviousPatient(Patient previousPatient) {
		this.previousPatient = previousPatient;
	}
	
	


}
