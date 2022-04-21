public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String toString() {
        return "\\" + this.balance + "(口座番号＝" + this.accountNumber + ")";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Account) {
            Account a = (Account) o;
            if (a.getAccountNumber().trim().equals(this.accountNumber.trim())) {
                return true;
            }
        }
        return false;
    }
}
