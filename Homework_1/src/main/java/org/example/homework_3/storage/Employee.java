package org.example.homework_3.storage;

public class Employee {
    private int countBreakVodka;
    public void breakVodka(Storage storage) {
        if (storage.getCountVodka() > 0) {
            countBreakVodka++;
            storage.setCountVodka(storage.getCountVodka() - 1);
            System.out.println("Ура я разбил водку" + " " + countBreakVodka);
        } else if (storage.getCountVodka() == 0) {
            System.out.println("Водка закончилась бить нечего");
        }
    }
}
