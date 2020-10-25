package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс PassportOffice это сервис проверяющий, что гражданин с определенным паспортом отсутствует
 * или же можно получить информацию о гражданине по его паспорту. При помощи метода add гражданин будет добавлен.
 * @author Vladimir Budnichenko
 * @since 25.10.2020
 * @version 1
 */

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
        } else {
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
