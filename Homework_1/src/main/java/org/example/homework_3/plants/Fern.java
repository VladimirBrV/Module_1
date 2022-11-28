package org.example.homework_3.plants;

public class Fern extends Plant implements Blossom {
    @Override
    public void blossom() {
        System.out.println("Папоротник умеет цвести");
    }
}
