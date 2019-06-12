package by.htp.agregation_and_composition.Task4;

import java.util.*;

public class Customer {
    private Set<Account> accounts;
    private String name;

    public Customer(Set<Account> accounts, String name) {
        this.accounts = accounts;
        this.name = name;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void blockAccount(long number) {
        for (Account account: accounts) {
            if (account.getNumber() == number) {
                account.setBlocked(true);
            }
        }
    }

    public void unblockAccount(long number) {
        for (Account account: accounts) {
            if (account.getNumber() == number) {
                account.setBlocked(false);
            }
        }
    }

    public List<Account> sortAccountsByNumber() {
        List<Account> accounts = new ArrayList<>(this.accounts);
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                if (o1.getNumber() < o2.getNumber()) {
                    return -1;
                } else if (o1.getNumber() > o2.getNumber()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        return accounts;
    }

    public Account searchAccountByNumber(long number) {
        for (Account account: accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return accounts.equals(customer.accounts) &&
                name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + accounts +
                ", name='" + name + '\'' +
                '}';
    }
}
