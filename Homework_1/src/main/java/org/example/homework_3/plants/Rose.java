package org.example.homework_3.plants;

public class Rose extends Plant implements Blossom , Smellbel {
    @Override
    public void blossom() {
        System.out.println("Роза умеет цвести");
    }
    @Override
    public void smell() {
        System.out.println("Роза умеет пахнуть");
    }
}
