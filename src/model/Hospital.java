package model;

import java.util.LinkedList;
import java.util.List;

public class Hospital {
	
	private Patient firstPatient;
	
	public Hospital() {
		
	}
	
	public void addPatient(String n, String d) {
		Patient p = new Patient(n, d);
		
		if(firstPatient==null) {
			firstPatient = p;
			
		} else {
			Patient current = firstPatient;
			//Patient previous = null;
			while(current.getNextPatient() != null) {
				
				current = current.getNextPatient();
				
			}
			current.setNextPatient(p);
		}
	}
	 
	public Patient searchPatient(String n) {
		Patient search = null;
		Patient current = firstPatient;
		
		if(current != null) {
			while(current.getNextPatient() != null) {
				if(current.getName().equals(n)) {
				Patient found = current;
				search = found;
			} 
		}
		}
		
		return search;
		
	}
	
	public boolean deletePatient(String n) {
		boolean deleted = false;
		Patient current = firstPatient;
		
		if(current!= null) {
			while(current.getNextPatient() != null) {
				
			}
			
		}
		
		return deleted;
	}
	
	
	public List<Patient> getPatientList(){
		List<Patient> patients = new LinkedList<Patient>();
		patients.add(firstPatient);
		
		while(firstPatient.getNextPatient() != null) {
			patients.add(firstPatient.getNextPatient());
			
		}
	
		return patients;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	

}
