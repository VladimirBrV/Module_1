package org.example.homework_3;
//Продвинутый уровень
//Задача №1
//1. Создать следующую структуру из классов и интерфейсов:
// дерево -> ель (имеет шишки, умеет пахнуть)
// дерево -> сосна (имеет шишки, умеет пахнуть)
// растение -> роза (умеет цвести, умеет пахнуть)
// растение -> папоротник (умеет цвести)
// Создать у каждого класса по объекту, распределить по массивам интерфейсов
// И у каждого массива вызвать характерный метод
//Ожидание:
// сосна : умеет пахнуть
// ель : умееть пахнуть
// роза: умееть пахнуть
// роза: умеет цвести
// папоротник: умеет цвести

import org.example.homework_3.plants.*;
import org.example.homework_3.storage.Employee;
import org.example.homework_3.storage.Storage;

public class Homework3 {
    public static void main(String[] args) {
        Pine pine = new Pine(100);
        Fir fir = new Fir(200);
        Rose rose = new Rose();
        Fern fern = new Fern();
        Smellbel[] smellbel = {pine,fir,rose};
        for (Smellbel smellbel1 : smellbel) {
            smellbel1.smell();
        }
        Blossom [] blossoms = {rose,fern};
        for (Blossom blossom : blossoms) {
            blossom.blossom();
        }
        // Задание №2:
// Написать систему управления складскими запасами. Создать класс склад, создать класс работники
// (написать геттеры на все аттрибуты).
// Количество работников минимум 3.
// Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
// Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
// "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
// У склада есть только одна позиция - Водка.

        Storage storage = new Storage();
        storage.setCountVodka(5);
        Employee employee1 = new Employee();
        Employee employee2= new Employee();
        Employee employee3 = new Employee();
        employee1.breakVodka(storage);
       employee1.breakVodka(storage);
       employee1.breakVodka(storage);
       employee1.breakVodka(storage);
       employee2.breakVodka(storage);
        System.out.println(storage.getCountVodka());


    }
}




//Экспертный уровень:
//Задача №1
// Реализовать шаблон Builder для класса Human (атрибуты - возраст, имя, вес. Метод: инфо о человеке):
// Для этого шаблона характерно:
// 1. приватный конструктор,
// 2. вложенный статический класс (HumanBuilder)
// 3. статический метод builder(), который возврашает экземпляр типа HumanBuilder.
// Во время инициализации HumanBuilder, создается объект класса Human, и записывается в приватный атрибут.
// 4. Класс HumanBuilder имеет методы, которые имеют тоже самое название, что и атрибуты класса Human,
// которые вызывают сеттеры у экземпляра класса Human.
// 5. HumanBuilder имеет метод build, который возвращает готовый объект типа Human.
// Ожидаемый результат
// Human human = Human.builder().name("Петр").age(20).weight(80).build();
// human.info()
// Петр - возраст 20, вес 80

