package exampleinterfaces.patients;

import java.time.LocalDate;
import java.util.*;

public class Patient {
    private String tis;

    private String nameSurname;
    private Map<LocalDate, MedicalVisit> medicalVisits = new HashMap<>();

    public Patient() {
    }

    public Patient(String tis, String nameSurname, Map<LocalDate, MedicalVisit> medicalVisits) {
        this.tis = tis;
        this.nameSurname = nameSurname;
        this.medicalVisits = medicalVisits;
    }

    public String getTis() {
        return tis;
    }

    public void setTis(String tis) {
        this.tis = tis;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Map<LocalDate, MedicalVisit> getMedicalVisits() {
        return medicalVisits;
    }

    public void setMedicalVisits(Map<LocalDate, MedicalVisit> medicalVisits) {
        this.medicalVisits = medicalVisits;
    }

    public void addVisit(LocalDate date, VisitType visitType, String report) {
        MedicalVisit newMedicalVisit = new MedicalVisit(date, visitType, Boolean.FALSE, Boolean.TRUE, report);
        newMedicalVisit.setActive(Boolean.TRUE);
        newMedicalVisit.setVisitType(visitType);
        newMedicalVisit.setBeenPresent(Boolean.FALSE);
        newMedicalVisit.setDataVisit(date);
        this.getMedicalVisits().put(date, newMedicalVisit);
        medicalVisits.entrySet()
                .stream()
                .sorted(Map.Entry.<LocalDate, MedicalVisit>comparingByKey())
                .forEach(System.out::println);
    }

    public void doVisit(LocalDate date, String report) {
        this.medicalVisits.get(date).setActive(Boolean.FALSE);
        this.medicalVisits.get(date).setBeenPresent(Boolean.TRUE);
        this.medicalVisits.get(date).setReport(report);
    }

    public void deleteVisit(LocalDate date) {
        this.medicalVisits.remove(date);
    }

    public void deleteAllVisits() {
        System.out.println("Removing all visits for TIS" + this.tis + " " + this.getNameSurname() );
        for (Map.Entry<LocalDate, MedicalVisit> entry :medicalVisits.entrySet()) {
            System.out.println("Removing visit on date:  " + entry.getKey());
            medicalVisits.remove(entry);
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "tis='" + tis + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", medicalVisits=" + medicalVisits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(tis, patient.tis) && Objects.equals(nameSurname, patient.nameSurname) && Objects.equals(medicalVisits, patient.medicalVisits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tis, nameSurname, medicalVisits);
    }
}
