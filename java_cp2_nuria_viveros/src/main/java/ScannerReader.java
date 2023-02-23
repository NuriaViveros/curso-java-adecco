import java.time.LocalDate;
import java.util.Scanner;

/**
 * TODO: evitar duplicados utilizando Generics y programación funcional
 */
public class ScannerReader {

    private Scanner scanner;

    public ScannerReader(){
        scanner = new Scanner(System.in);
    }

    public String readLine(String attribute){

        String text;
        //System.out.println("Introduce el valor texto para: " + attribute);
        do {
            try {
                text = scanner.nextLine();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                scanner.next();
            }
        } while(true);
        return text;
    }

    public double readDouble(String attribute){

        //Scanner scanner = new Scanner(System.in);
        double number;
        System.out.println("Introduce el valor double para: " + attribute);
        do {
            try {
                number = scanner.nextDouble();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                scanner.next(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        } while(true);
        //scanner.close();
        return number;
    }


    public boolean readBoolean(String attribute){

        boolean check;
        System.out.println("Introduce el valor boolean para: " + attribute);
        do {
            try {
                check = scanner.nextBoolean();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                scanner.next();
            }
        } while(true);
        return check;
    }

    public int readInt(String attribute){

        int number;
        System.out.println("Introduce el valor int para: " + attribute);
        do {
            try {
                number = scanner.nextInt();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                scanner.next();
            }
        } while(true);
        return number;
    }

    public Long readLong(String attribute){

        Long number;
        System.out.println("Introduce el valor long para : " + attribute);
        do {
            try {
                number = scanner.nextLong();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                scanner.next();
            }
        } while(true);
        return number;
    }

    public String readString(String attribute){

        String text;
        System.out.println("Introduce el valor texto para: " + attribute);
        do {
            try {
                text = scanner.next();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el " + attribute);
                scanner.next();
            }
        } while(true);
        return text;
    }

    public LocalDate readLocalDate(String attribute) {
        return null;
    }

    public LocalDate readLocalTime(String attribute) {
        return null;
    }

    public void close(){
        scanner.close();
    }
}
