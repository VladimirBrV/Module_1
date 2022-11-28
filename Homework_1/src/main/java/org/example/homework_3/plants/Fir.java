package org.example.homework_3.plants;

public class Fir extends Tree implements Smellbel{

    public Fir(int cone) {
        super(cone);
    }

    @Override
    public void smell() {
        System.out.println("Ель умеет пахнуть");
    }
}
