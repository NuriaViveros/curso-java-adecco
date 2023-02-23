package exampleinterfaces.patients;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CargaPacientes {

    //Presenta menú
    public PatientServiceImpl loadPatients() {
        MedicalVisit medicalVisit1 = new MedicalVisit();
        medicalVisit1.setDataVisit(LocalDate.parse("2023-12-01"));
        medicalVisit1.setVisitType(VisitType.OFTALMOLOGO);
        medicalVisit1.setBeenPresent(Boolean.FALSE);
        medicalVisit1.setActive(Boolean.TRUE);
        medicalVisit1.setReport("Aquí va una descripcion que será el médico a generar");

        MedicalVisit medicalVisit2 = new MedicalVisit();
        medicalVisit2.setDataVisit(LocalDate.parse("2022-11-01"));
        medicalVisit2.setVisitType(VisitType.ANALITICA);
        medicalVisit2.setBeenPresent(Boolean.FALSE);
        medicalVisit2.setActive(Boolean.TRUE);
        medicalVisit2.setReport("Aquí va una descripcion de la cita");

        Map<LocalDate, MedicalVisit> medicalVisits1 = new HashMap<>();
        medicalVisits1.put(medicalVisit1.getDataVisit(),medicalVisit1);
        medicalVisits1.put(medicalVisit2.getDataVisit(),medicalVisit2);

        // Paciente 2
        MedicalVisit medicalVisit3 = new MedicalVisit();
        medicalVisit3.setDataVisit(LocalDate.parse("2023-03-31"));
        medicalVisit3.setVisitType(VisitType.FAMILIA);
        medicalVisit3.setBeenPresent(Boolean.FALSE);
        medicalVisit3.setActive(Boolean.TRUE);
        medicalVisit3.setReport("Aquí va una descripcion informe del paciente 2");

        MedicalVisit medicalVisit4 = new MedicalVisit();
        medicalVisit4.setDataVisit(LocalDate.parse("2022-11-01"));
        medicalVisit4.setVisitType(VisitType.ANALITICA);
        medicalVisit4.setBeenPresent(Boolean.FALSE);
        medicalVisit4.setActive(Boolean.TRUE);
        medicalVisit4.setReport("Aquí va una descripcion de la cita para el paciente 2");

        Map<LocalDate, MedicalVisit> medicalVisits2 = new HashMap<>();
        medicalVisits2.put(medicalVisit3.getDataVisit(),medicalVisit3);
        medicalVisits2.put(medicalVisit4.getDataVisit(),medicalVisit4);


        Patient patient1 = new Patient("TIS_PACIENTE1", "Antonio Fernández", medicalVisits1);
        Patient patient2 = new Patient("TIS_PACIENTE2", "Julio Gutierrez", medicalVisits2);

        Map<String, Patient> patients = new HashMap<>();
        patients.put("TIS_PACIENTE1",patient1);
        patients.put("TIS_PACIENTE2",patient2);

        PatientServiceImpl patientServiceImpl = new PatientServiceImpl(patients);
        return patientServiceImpl;
    }
}

