import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface BankAccountService {

    //Buscar todas cuentas bancarias
    List<BankAccount> findAll();
    //Buscar una cuenta bancaria por su id;
    BankAccount findById(Long id);


    // Buscar cuenta por el nif de su usuario/cliente
    List<BankAccount> findByCustomerNif(String nif);

    //Buscar todas las cuentas bancarias por el tipo de cuenta
    List<BankAccount> findByAccountType(AccountType accountType);

    //Buscar por moneda soportada
    List<BankAccount> findBySupportedCoin(String coin);

    //Agrupar por tipo de cuenta
    Map<AccountType, ArrayList<BankAccount>> groupByAccountType();

    BankAccount create(BankAccount bankAccount);

    BankAccount update(BankAccount bankAccount);

    BankAccount increaseBalance(Long id);

    // Hacer retiro
    BankAccount withdraw(Long id, Double amount);

    //Disminuir saldo
    BankAccount decreaseBalance(Long id);

    BankAccount transferToAnotherAccount(Long id, Double amount);

    Boolean removeById(Long id);
    Boolean removeByIban(String iban);

}