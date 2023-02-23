import javax.swing.*;
import java.util.*;

public class BankAccountServiceImpl implements BankAccountService {

    List<BankAccount> bankAccounts = new ArrayList<>();

    //Buscar todas cuentas bancarias
    public List<BankAccount> findAll() {
        return bankAccounts;
    }

    public BankAccount findById(Long id) {
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getId().equals(id)) {
                return bankAccount;
            }
        }

        return null;
    }

    // Buscar cuenta por el nif de su usuario/cliente
    public List<BankAccount> findByCustomerNif(String nif) {
        List<BankAccount> bankAccountsAux= new ArrayList<>();
        int index = 0;
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getCustomer().getNif().equals(nif)) {
                bankAccountsAux.add(index++,bankAccount);
            }
        }
        return bankAccountsAux;
    }

    //Buscar todas las cuentas bancarias por el tipo de cuenta
    public List<BankAccount> findByAccountType(AccountType accountType){
        List<BankAccount> bankAccountsAux= new ArrayList<>();
        int index = 0;
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getAccountType().equals(accountType)) {
                bankAccountsAux.add(index++, bankAccount);
            }
        }
        return bankAccountsAux;
    }

    //Buscar por moneda soportada
    public List<BankAccount> findBySupportedCoin(String coin){
        List<BankAccount> bankAccountsAux = new ArrayList<>();
        List<String> supportedCoins;
        for (BankAccount bankAccount: bankAccounts) {
            supportedCoins = bankAccount.getSupportedCoins();
            for (int i = 0; i < supportedCoins.size(); i++) {
                if (supportedCoins.get(i).equals(coin)) {
                    bankAccountsAux.add(bankAccount);
                }
            }
        }
        return bankAccountsAux;

    }

    //Agrupar por tipo de cuenta
    public HashMap<AccountType, ArrayList<BankAccount>> groupByAccountType(){
        //List<BankAccount> bankAccountsAux = new ArrayList<>();
        HashMap<AccountType ,ArrayList<BankAccount>> bankAccountsAux = new HashMap<AccountType, ArrayList<BankAccount>>();

        AccountType[] enumAccountType = AccountType.values();
        for (int i = 0; i < enumAccountType.length ; i++) {
            for (BankAccount bankAccount: bankAccounts) {
                System.out.println("bankAccount type "+bankAccount.getAccountType());
                System.out.println("EnumAccountType "+enumAccountType[i]);
                if (bankAccount.getAccountType().equals(enumAccountType[i]) ) {
                    if (bankAccountsAux.containsKey(enumAccountType[i])) {
                        bankAccountsAux.get(enumAccountType[i]).add(bankAccount);
                    }
                    else {
                        ArrayList<BankAccount> value = new ArrayList<BankAccount>();
                        value.add(bankAccount);
                        bankAccountsAux.put(enumAccountType[i], value);
                    }
                }
            }
        }
        return bankAccountsAux;
    }

    public BankAccount create(BankAccount bankAccount){
        BankAccount bankAccountNew = new BankAccount();
        bankAccountNew.setId(bankAccount.getId());
        bankAccountNew.setIban(bankAccount.getIban());
        bankAccountNew.setTitular(bankAccount.getTitular());
        bankAccountNew.setAccountType(bankAccount.getAccountType());
        bankAccountNew.setCoste(bankAccount.getCoste());
        bankAccountNew.setInteres(bankAccount.getInteres());
        bankAccountNew.setRecompensa(bankAccount.getRecompensa());
        bankAccountNew.setCustomer(bankAccount.getCustomer());
        bankAccountNew.setAccountCreationDate(bankAccount.getAccountCreationDate());
        bankAccountNew.setSupportedCoins(bankAccount.getSupportedCoins());
        bankAccountNew.setBank(bankAccount.getBank());
        bankAccountNew.setSaldo(bankAccount.getSaldo());
        return bankAccountNew;
    }

    public BankAccount update(BankAccount bankAccount){return null;}

    public BankAccount increaseBalance(Long id){return null;}

    // Hacer retiro
    public BankAccount withdraw(Long id, Double amount){return null;}

    //Disminuir saldo
    public BankAccount decreaseBalance(Long id){return null;}

    public BankAccount transferToAnotherAccount(Long id, Double amount){return null;}

    public Boolean removeById(Long id){return null;}
    public Boolean removeByIban(String iban){return null;}

}
