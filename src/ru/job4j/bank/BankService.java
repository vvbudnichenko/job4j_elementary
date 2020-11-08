package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User rsl = findByPassport(passport);
        List<Account> allUsers = users.get(rsl);
        if (!allUsers.contains(account)) {
            allUsers.add(account);
        }
    }

    public User findByPassport(String passport) {
        for(User key : users.keySet()) {
            if(key.getPassport().equals(passport)) {
            } return key;
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User rsl = findByPassport(passport);
        if (rsl != null) {
            List<Account> allRequsite = users.get(rsl);
            for (Account acc: allRequsite) {
                if (acc.getRequisite().equals(requisite)) {
                 return acc;
                }
            }
        } return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account out = findByRequisite(srcPassport, srcRequisite);
        Account in = findByRequisite(destPassport, destRequisite);
        if (out != null && out.getBalance() >= amount && in != null) {
            out.setBalance(out.getBalance() - amount);
            in.setBalance(in.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }
}