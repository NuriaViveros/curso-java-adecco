import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PresentaMenu {
    public static void main(String[] args) {
        Boolean salir = Boolean.FALSE;
        Integer opcion; //se guarda la opción del usuario
        ScannerReader scannerReader = new ScannerReader();
        BankAccountServiceImpl bankAccountImpl = new BankAccountServiceImpl();
        bankAccountImpl.bankAccounts = Utilidades.cargaDBparaTest();
        while (!salir) {
            try {
                System.out.println("1. Find all Bank accounts");
                System.out.println("2. Find Bank account by Id");
                System.out.println("3. Find Bank account by Customer nif");
                System.out.println("4. Find Bank accounts by account type");
                System.out.println("5. Find Bank accounts by coin");
                System.out.println("6. Find Bank accounts grouping by account type");
                System.out.println("7. Create new Bank Account");
                System.out.println("8. Increase Balance");
                System.out.println("9. Withdraw");
                System.out.println("10. Decrement Balance");
                System.out.println("11. Update Bank Account");
                System.out.println("12. Delete Bank Account");
                System.out.println("13. Transfer money from-to account");

                System.out.println("14. Quit");

                System.out.println("Escribe una de las opciones");
                opcion = scannerReader.readInt("menu principal");


                switch (opcion) {
                    case 1: //Find all Bank accounts
                        System.out.println(bankAccountImpl.findAll().toString());
                        break;
                    case 2:
                        Long id = scannerReader.readLong("id");
                        if (bankAccountImpl.findById(id) != null) {
                            System.out.println(bankAccountImpl.findById(id).toString());
                        } else System.out.println("No existe una cuenta bancaria con el id indicado");
                        break;
                    case 3:
                        String nif = scannerReader.readString("Titular de la cuenta. Nif");
                        List<BankAccount> accountsByNif = bankAccountImpl.findByCustomerNif(nif);
                        if (accountsByNif != null)
                            System.out.println(accountsByNif.toString());
                        else
                            System.out.println("No existe una cuenta bancaria con el Nif indicado");
                        break;
                    case 4:
                        System.out.println("1. CUENTA_CORRIENTE");
                        System.out.println("2. FINANCIAMENTO");
                        System.out.println("3. AHORRO");
                        System.out.println("4. DE_EMPRESA");
                        System.out.println("5. DE_CRÉDITO");
                        int accountType = scannerReader.readInt("Tipo de cuenta: ");
                        AccountType accountTypeMenu = AccountType.valueOf("CUENTA_CORRIENTE");
                        switch (accountType) {
                            case 1: accountTypeMenu = AccountType.valueOf("CUENTA_CORRIENTE"); break;
                            case 2: accountTypeMenu = AccountType.valueOf("FINANCIAMENTO"); break;
                            case 3: accountTypeMenu = AccountType.valueOf("AHORRO"); break;
                            case 4: accountTypeMenu = AccountType.valueOf("DE EMPRESA"); break;
                            case 5: accountTypeMenu = AccountType.valueOf("DE_CRÉDITO"); break;
                            default:
                                System.out.println("Solo números del 1 al 5");
                        }
                        List<BankAccount> accountsByType = bankAccountImpl.findByAccountType(accountTypeMenu);
                        if ((accountsByType != null) && (!accountsByType.isEmpty()))
                            System.out.println(accountsByType.toString());
                        else
                            System.out.println("No se encontraron cuentas bancarias del tipo: "+ accountTypeMenu);
                        break;
                    case 5:
                        String coin = scannerReader.readString("Moneda");
                        List<BankAccount> bankAccounts = bankAccountImpl.findBySupportedCoin(coin);
                        if (bankAccounts!=null && bankAccounts.size() > 0)
                                System.out.println(bankAccounts.toString());
                        else
                                System.out.println("No se encontraron cuentas bancarias que soporten la moneda indicada");
                        break;
                    case 6:
                        //tipo de cuenta, la clave de un map, el valor la lista cuentas
                        HashMap<AccountType, ArrayList<BankAccount>> accountsGroupBy = bankAccountImpl.groupByAccountType();
                        if (accountsGroupBy!=null && accountsGroupBy.size() > 0)
                            System.out.println(accountsGroupBy.toString());
                        else
                            System.out.println("No se encontraron cuentas bancarias");
                        break;
                    case 7: //Create new Bank Account
                        BankAccount bankAccount  = new BankAccount();
                        Long idAccount = scannerReader.readLong("id");
                        bankAccount.setId(idAccount);

                        String iban = scannerReader.readString("IBAN");
                        bankAccount.setIban(iban);

                        String titular = scannerReader.readString("Titular");
                        bankAccount.setTitular("Titular");

                        Double saldo = scannerReader.readDouble("Saldo");
                        bankAccount.setSaldo(saldo);

                        String stringAccountType = scannerReader.readString("Account type");
                        bankAccount.setAccountType(AccountType.valueOf(stringAccountType));

                        Double coste = scannerReader.readDouble("Coste");
                        bankAccount.setCoste(coste);

                        Double interes = scannerReader.readDouble("Interés");
                        bankAccount.setInteres(interes);

                        Double recompensa = scannerReader.readDouble("Recompensa");
                        bankAccount.setRecompensa(recompensa);

                        String customer_nif = scannerReader.readString("Nif");
                        Customer customer = new Customer();
                        customer.setNif(customer_nif);
                        bankAccount.setCustomer(customer);

                        LocalDate accountCreationDate = scannerReader.readLocalDate("Account Creation Date");
                        bankAccount.setAccountCreationDate(accountCreationDate);


                        String textFromConsole = scannerReader.readString("Supported Coins. Coins separated by comma");
                        List<String> supportedCoins = Arrays.asList(textFromConsole.split(","));
                        //List<String> supportedCoins = List.of("EUR", "USD");
                        bankAccount.setSupportedCoins(supportedCoins);

                        String bankEntityCode = scannerReader.readString("Bank Entity Code");
                        Bank bank = new Bank();
                        bank.bankEntityCode = bankEntityCode;
                        bankAccount.setBank(bank);

                        bankAccountImpl.bankAccounts.add(bankAccount);
                        System.out.println(bankAccountImpl.bankAccounts.toString());
                        break;
                    case 8:
                        // Incrementar saldo
                        String nif_customer = scannerReader.readString("Titular de la cuenta. Nif");
                        List<BankAccount> accountsByNifCustomer = bankAccountImpl.findByCustomerNif(nif_customer);
                        System.out.println(accountsByNifCustomer.toString());
                        Long forBankAccount = scannerReader.readLong("Select Bank Account number");
                        if (forBankAccount != null) {
                            Double newBalance = scannerReader.readDouble("Indicate the ammount to increment in balance for the Bank id: "+forBankAccount);
                            BankAccount accountToUpdate = bankAccountImpl.findById(forBankAccount);
                            if (accountToUpdate != null) {
                                accountToUpdate.setSaldo(accountToUpdate.getSaldo()+newBalance);
                                System.out.println(accountToUpdate.toString());
                                System.out.println("Se ha incrementado el saldo");
                                System.out.println("El actual saldo es " + accountToUpdate.getSaldo());
                            } else System.out.println("No existe una cuenta bancaria con el id indicado");
                        }
                        else
                            System.out.println("No existe una cuenta bancaria con el Nif indicado");
                        break;
                    case 9: //Withdraw
                        break;
                    case 10:
                        // Decrementar saldo
                        String nif_customer10 = scannerReader.readString("Titular de la cuenta. Nif");
                        List<BankAccount> accountsByNifCustomer10 = bankAccountImpl.findByCustomerNif(nif_customer10);
                        System.out.println(accountsByNifCustomer10.toString());
                        Long forBankAccount10 = scannerReader.readLong("Select Bank Account number");
                        if (forBankAccount10 != null) {
                            Double newBalance = scannerReader.readDouble("Indicate the ammount to decrement in balance for the Bank id: "+forBankAccount10);
                            BankAccount accountToUpdate = bankAccountImpl.findById(forBankAccount10);
                            if (accountToUpdate != null) {
                                System.out.println("Saldo anterior " + accountToUpdate.getSaldo());
                                accountToUpdate.setSaldo(accountToUpdate.getSaldo()-newBalance);
                                System.out.println(accountToUpdate.toString());
                                System.out.println("Se ha decrementado el saldo");
                                System.out.println("El actual saldo es " + accountToUpdate.getSaldo());
                            } else System.out.println("No existe una cuenta bancaria con el id indicado");
                        }
                        else
                            System.out.println("No existe una cuenta bancaria con el Nif indicado");
                        break;
                    case 11: //Actualizar cuenta bancaria
                        String nif_customer11 = scannerReader.readString("Titular de la cuenta. Nif");
                        List<BankAccount> accountsByNifCustomer11 = bankAccountImpl.findByCustomerNif(nif_customer11);
                        System.out.println(accountsByNifCustomer11.toString());
                        Long forBankAccount11 = scannerReader.readLong("Select Bank Account number");
                        if (forBankAccount11 != null) {
                            BankAccount accountToUpdate = bankAccountImpl.findById(forBankAccount11);
                            if (accountToUpdate != null) {
                                System.out.println("Valor actual para el nombre del titular de la cuenta: " + accountToUpdate.getTitular() );
                                System.out.println("Indicar nuevo valor o presiona Enter para mantenerlo");
                                String newValueTitular = scannerReader.readLine("");
                                newValueTitular = scannerReader.readLine("");

                                if (newValueTitular != null && !newValueTitular.equals("")) {
                                    //se actualiza sólo si el usuario ha escrito algo
                                    accountToUpdate.setTitular(newValueTitular);
                                }

                                System.out.println("Valor actual para el saldo : " + accountToUpdate.getSaldo() );
                                System.out.println("Indicar nuevo valor o presiona Enter para mantenerlo");
                                String newValueSaldo = scannerReader.readLine("");
                                //newValueSaldo = scannerReader.readLine("");
                                if (newValueSaldo != null && !newValueSaldo.equals("")) {
                                    //se actualiza el saldo sólo si el usuario ha escrito algo
                                    accountToUpdate.setSaldo(Double.valueOf(newValueSaldo));
                                }

                                System.out.println("Valor actual para el coste : " + accountToUpdate.getCoste() );
                                System.out.println("Indicar nuevo valor o presiona Enter para mantenerlo");
                                String newValueCoste = scannerReader.readLine("");
                                //newValueCoste = scannerReader.readLine("");
                                if (newValueCoste != null && !newValueCoste.equals("")) {
                                    //se actualiza el saldo sólo si el usuario ha escrito algo
                                    accountToUpdate.setCoste(Double.valueOf(newValueCoste));
                                }

                                System.out.println("Valor actual para el interés : " + accountToUpdate.getInteres() );
                                System.out.println("Indicar nuevo valor o presiona Enter para mantenerlo");
                                String newValueInteres = scannerReader.readLine("");
                                //newValueCoste = scannerReader.readLine("");
                                if (newValueInteres != null && !newValueInteres.equals("")) {
                                    //se actualiza el interés sólo si el usuario ha escrito algo
                                    accountToUpdate.setInteres(Double.valueOf(newValueInteres));
                                }

                                System.out.println("Valor actual para el importe recompensa : " + accountToUpdate.getRecompensa() );
                                System.out.println("Indicar nuevo valor o presiona Enter para mantenerlo");
                                String newValueRecompensa = scannerReader.readLine("");
                                //newValueRecompensa = scannerReader.readLine("");
                                if (newValueRecompensa != null && !newValueRecompensa.equals("")) {
                                    //se actualiza el interés sólo si el usuario ha escrito algo
                                    accountToUpdate.setRecompensa(Double.valueOf(newValueRecompensa));
                                }

                                System.out.println("Valor actual para las divisas soportadas : " + accountToUpdate.getSupportedCoins().toString() );
                                System.out.println("Indicar nuevo valor o presiona Enter para mantenerlo");
                                String newValueSupportedCoins = scannerReader.readLine("");
                                if (newValueSupportedCoins != null && !newValueSupportedCoins.equals("")) {
                                    ArrayList<String> newValueArraySupportedCoins = new ArrayList<>(
                                            Arrays.asList(newValueSupportedCoins));
                                            //Arrays.asList("USD", "EUR", "AFN", "DZD", "SAR"));
                                    accountToUpdate.setSupportedCoins(newValueArraySupportedCoins);
                                }
                            } else System.out.println("No existe una cuenta bancaria con el id indicado");
                        }
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        salir = Boolean.TRUE;
                        break;
                    default:
                        System.out.println("Solo números del 1 al 14");
                }
            } catch (Exception e) {
              e.printStackTrace();
              scannerReader.readString("qué hay aqui?"); // desplaza el scanner debajo del texto para que se pueda
              // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
        }

        }
    }
}