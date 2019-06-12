package by.htp.agregation_and_composition.Task4;

import java.util.Objects;

public class Account {
    private long number;
    private boolean isBlocked = false;
    private int amount;

    public Account(long number, int amount) throws Exception {
        this.number = number;

        if (amount > 0) {
            throw new Exception("Amount can't be negative.");
        } else {
            this.amount = amount;
        }
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number &&
                isBlocked == account.isBlocked &&
                amount == account.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, isBlocked, amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", isBlocked=" + isBlocked +
                ", amount=" + amount +
                '}';
    }
}
