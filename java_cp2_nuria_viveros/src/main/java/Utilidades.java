import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilidades {

    public static List<BankAccount> cargaDBparaTest() {

        Bank bank1 = new Bank("1210", "CAIXABANK", "Avenida Blas de Otero 59 MADRID");
        Bank bank2 = new Bank("0049", "BANCO SANTANDER", "AVDA CHURUMBELERÍAS 12 JAÉN");
        Bank bank3 = new Bank("0050", "ABANCA CORPORACION BANCARIA", "Calle Roma 78 FIRENZE");
        Bank bank4 = new Bank("0050", "BANCO DE CREDITO BALEAR", "Berastegui 12 Bilbao");


        Customer customer1 = new Customer("29651895R", "Alba Uribe", null, "Iturribide kalea 3");
        Customer customer2 = new Customer("34571895B", "Amaia Lartategui", null, "plaza España 6 Madrid");
        Customer customer3 = new Customer("11111895L", "Sonia Gómez", null, "Elcano 17");
        Customer customer4 = new Customer("98765431S", "Rosana Merino", null, "Pozoketxe 3 Galdakao");

        ArrayList<String> supportedCoins1 = new ArrayList<>(
                Arrays.asList("USD", "EUR", "AFN", "DZD", "SAR"));

        ArrayList<String> supportedCoins2 = new ArrayList<>(
                Arrays.asList("USD", "EUR", "AFN", "DZD", "SAR", "BOB", "INR"));

        ArrayList<String> supportedCoins3 = new ArrayList<>(
                Arrays.asList("USD", "EUR", "AFN", "DZD", "SAR", "BOB", "INR", "CAD", "CUC"));

        BankAccount bankAccount1 = new BankAccount(1L, "ES6621000418401234567891", "Alba Uribe", 10000.0D, AccountType.DE_EMPRESA, 20D, 1.3D, 8D, customer1, LocalDate.parse("2023-02-12"), supportedCoins3, bank3);
        BankAccount bankAccount2 = new BankAccount(2L, "ES9000246912501234567891", "Amaia Lartategi", 20000.0D, AccountType.CUENTA_CORRIENTE, 20D, 3D, 8D, customer2, LocalDate.parse("2023-01-13"), supportedCoins2, bank1);
        BankAccount bankAccount3 = new BankAccount(3L, "ES6787846912501234567891", "Amaia Lartategi", 30000.0D, AccountType.FINANCIAMENTO, 50D, 3D, 8D, customer2, LocalDate.parse("2023-01-23"), supportedCoins2, bank2);
        BankAccount bankAccount4 = new BankAccount(4L, "ES7896519859872314235458", "Sonia Gómez", 10000.0D, AccountType.CUENTA_CORRIENTE, 15D, 3D, 8D, customer3, LocalDate.parse("2023-01-14"), supportedCoins1, bank4);
        BankAccount bankAccount5 = new BankAccount(5L, "ES1234567890123456789012", "Rosana Merino", 15000.0D, AccountType.AHORRO, 65D, 3D, 8D, customer4, LocalDate.parse("2023-01-09"), supportedCoins3, bank1);

        List<BankAccount> database =  new ArrayList<>(
                Arrays.asList(bankAccount1, bankAccount2, bankAccount3, bankAccount4, bankAccount5));
        return database;



    }
}
