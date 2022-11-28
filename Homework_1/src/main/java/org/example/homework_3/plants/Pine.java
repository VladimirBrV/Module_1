package org.example.homework_3.plants;

public class Pine extends Tree implements Smellbel {
    public Pine(int cone) {
        super(cone);
    }
    @Override
    public void smell() {
        System.out.println("Сосна умеет пахнуть");

    }
}
