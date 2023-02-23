import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BankAccount {
    private Long id;

    private String iban; // Ejemplo de IBAN : ES91 2100 0418 4502 0005 1332

    private String titular;

    private Double saldo;

    private AccountType accountType;
    private Double coste;

    private Double interes;
    private Double recompensa;
    private Customer customer;

    private LocalDate accountCreationDate;

    List<String> supportedCoins =   new ArrayList<String>(Arrays.asList("EUR", "USD", "FOR", "HUG", "CZK", "YEN"));
    private Bank bank; // ejemplo CAIXABANK

    public BankAccount() {
    }

    public BankAccount(Long id, String iban, String titular, Double saldo, AccountType accountType, Double coste, Double interes, Double recompensa, Customer customer, LocalDate accountCreationDate, List<String> supportedCoins, Bank bank) {
        this.id = id;
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.accountType = accountType;
        this.coste = coste;
        this.interes = interes;
        this.recompensa = recompensa;
        this.customer = customer;
        this.accountCreationDate = accountCreationDate;
        this.supportedCoins = supportedCoins;
        this.bank = bank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Double getCoste() {
        return coste;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Double recompensa) {
        this.recompensa = recompensa;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public List<String> getSupportedCoins() {
        return supportedCoins;
    }

    public void setSupportedCoins(List<String> supportedCoins) {
        this.supportedCoins = supportedCoins;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", iban='" + iban + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", accountType=" + accountType +
                ", coste=" + coste +
                ", interes=" + interes +
                ", recompensa=" + recompensa +
                ", customer=" + customer +
                ", accountCreationDate=" + accountCreationDate +
                ", supportedCoins=" + supportedCoins +
                ", bank=" + bank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, iban, titular, saldo, accountType, coste, interes, recompensa, customer, accountCreationDate, supportedCoins, bank);
    }
}
