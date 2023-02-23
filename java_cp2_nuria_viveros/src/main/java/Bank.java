import java.util.Objects;

public class Bank {

    String bankEntityCode;  // ej. 0182 Banco Bilbao Vizcaya Argentaria
    String bankEntityName; // nombre de la entidad bancaria ejemplo: CAIXABANK
    String sucursalAddress;

    public Bank() {

    }

    public Bank(String bankEntityCode, String bankEntityName, String sucursalAddress) {
        this.bankEntityCode = bankEntityCode;
        this.bankEntityName = bankEntityName;
        this.sucursalAddress = sucursalAddress;
    }

    public String getBankEntityCode() {
        return bankEntityCode;
    }

    public void setBankEntityCode(String bankEntityCode) {
        this.bankEntityCode = bankEntityCode;
    }

    public String getBankEntityName() {
        return bankEntityName;
    }

    public void setBankEntityName(String bankEntityName) {
        this.bankEntityName = bankEntityName;
    }

    public String getSucursalAddress() {
        return sucursalAddress;
    }

    public void setSucursalAddress(String sucursalAddress) {
        this.sucursalAddress = sucursalAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(bankEntityCode, bank.bankEntityCode) && Objects.equals(bankEntityName, bank.bankEntityName) && Objects.equals(sucursalAddress, bank.sucursalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankEntityCode, bankEntityName, sucursalAddress);
    }
}
