package exampleinterfaces.patients;

import java.time.LocalDate;
import java.util.Scanner;

public class PresentaMenu {
    public static void main(String[] args) {
        CargaPacientes cargaPacientes = new CargaPacientes();
        PatientServiceImpl patientServiceImpl = cargaPacientes.loadPatients();
        Scanner scanner = new Scanner(System.in);
        Boolean salir = Boolean.FALSE;
        Integer opcion; //se guarda la opción del usuario
        String tis;
        Patient newPatient;
        String nameSurname;
        LocalDate dataVisit;
        VisitType visitType;
        Boolean beenPresent = Boolean.FALSE;
        while (!salir) {
            try {

                System.out.println("1. All patients list");
                System.out.println("2. Get patient by Tis");
                System.out.println("3. Create new patient");
                System.out.println("4. Create new visit for patient by Tis");

                System.out.println("5. Quit");

                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();
                String yes_no; //Dos valores posibles: y/n
                MedicalVisit medicalVisit;

                switch (opcion) {
                    case 1:
                        //System.out.println("Has seleccionado la opción 1");
                        System.out.println(patientServiceImpl.findAll().values());
                        break;
                    case 2:
                        //System.out.println("Has seleccionado la opción 2");
                        System.out.println("Indica un Tis sanitario");
                        tis = scanner.next();
                        if (patientServiceImpl.findByTis(tis) != null) {
                            System.out.println(patientServiceImpl.findByTis(tis).toString());
                        } else {
                            System.out.println("Tis: " + tis + " del paciente no encontrado");
                        }
                        break;
                    case 3:
                        //Crear un paciente
                        //Indicar los datos del paciente
                        newPatient = new Patient();
                        System.out.println("Indicar datos del paciente: ");
                        System.out.println("Indicar TIS sanitario: ");
                        tis = scanner.next();
                        newPatient.setTis(tis);
                        System.out.println("Indicar Nombre y Apellidos del paciente: ");

                        nameSurname = "";
                        if (scanner.hasNextLine()) {
                            nameSurname = scanner.nextLine();
                            nameSurname = scanner.nextLine();
                            newPatient.setNameSurname(nameSurname);
                        }
                        patientServiceImpl.create(newPatient);
                        System.out.println("Se ha creado con éxito el paciente con Tis: "+" "+tis+ " - "+nameSurname);
                        break;
                    case 4:
                        System.out.println("Indicar datos del paciente: ");
                        System.out.println("Indicar TIS sanitario: ");
                        tis = scanner.next();
                        newPatient = patientServiceImpl.findByTis(tis);
                        if (newPatient == null) {
                            System.out.println("No se encuentra el Tis indicado. El paciente no existe. Crear uno con la opción 3");
                            break;
                        }
                        System.out.println(newPatient.getMedicalVisits().toString());
                        System.out.println("Desea crear una nueva cita para el paciente: "+ tis + ": " +newPatient.getNameSurname() + "? y/n (y) ");
                        yes_no = scanner.next();
                        dataVisit = LocalDate.now();
                        visitType = VisitType.valueOf("FAMILIA");
                        if ((yes_no == null) || (yes_no.equalsIgnoreCase("y"))) {
                            System.out.println("Indicar datos de la visita: ");
                            System.out.println("Indicar fecha de la cita: ");
                            dataVisit = LocalDate.parse(scanner.next());

                            System.out.println("Tipo de visita: "+ "FAMILIA");

                            visitType = VisitType.valueOf("FAMILIA");

                            newPatient =new Patient();
                        }
                        if (newPatient.getMedicalVisits() != null) {
                            System.out.println(newPatient.getMedicalVisits().toString());
                        }
                        medicalVisit = new MedicalVisit(dataVisit, visitType, Boolean.FALSE, Boolean.TRUE,"Datos del report");
                        newPatient.getMedicalVisits().put(dataVisit, medicalVisit);
                        System.out.println("Se ha creado una visita correctamente");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opción 5");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números del 1 al 4");
                }
            } catch (Exception e) {
                //System.out.println("Formato incorrecto, introduce de nuevo el Tis del paciente (Ejemplo: 12345_tis) ");
                e.printStackTrace();
                scanner.nextLine(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        }
    }
}
