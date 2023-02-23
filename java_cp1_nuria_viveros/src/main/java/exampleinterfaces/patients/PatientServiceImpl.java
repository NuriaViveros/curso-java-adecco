package exampleinterfaces.patients;

import java.util.HashMap;
import java.util.Map;


public class PatientServiceImpl implements PatientService {

    Map<String, Patient> patients = new HashMap<>();

    public PatientServiceImpl() {
    }

    public PatientServiceImpl(Map<String, Patient> patients) {
        this.patients = patients;
    }

    public Map<String, Patient> getPatients() {
        return patients;
    }

    public void setPatients(Map<String, Patient> patients) {
        this.patients = patients;
    }

    public Map<String, Patient> findAll() {
        return patients;
    }

    public Patient findByTis(String tis) {
        if (!patients.containsKey(tis)) {
            System.out.println("Patient not found for Tis: "+tis);
        }
        return patients.get(tis);
    }

    public String findByNameSurname(String nameSurName) {
        for (Map.Entry<String, Patient> entry : patients.entrySet()) {
            if (entry.getValue().getNameSurname().equals(nameSurName)) {
                System.out.println("Patient found for: " + entry.getValue().getNameSurname());
                return entry.getValue().getTis() + entry.getValue().getNameSurname();
            } else continue;
        }
        return "Patient not found ";
    }
    public Patient create(Patient patient) {
        patients.put(patient.getTis(), patient);
        return patient;
    }

    public Patient update(Patient patient) {
        String tis = patient.getTis();
        Patient oldPatient = this.patients.get(tis);
        if  (oldPatient != null) {
            System.out.println("Updating patient tis: "+ tis + patient.getNameSurname());
            patient = oldPatient;
            return patient;
        }
        return patient;
    }

    public boolean removeByTis(String tis) {
        patients.remove(tis);
        return Boolean.TRUE;
    }
}
