public class Customer {
    private String nif;
    private String nameSurname;
    private BankAccountServiceImpl[] bankAccounts;
    private String address;

    public Customer() {
    }

    public Customer(String nif, String nameSurname, BankAccountServiceImpl[] bankAccounts, String address) {
        this.nif = nif;
        this.nameSurname = nameSurname;
        this.bankAccounts = bankAccounts;
        this.address = address;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public BankAccountServiceImpl[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccountServiceImpl[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
