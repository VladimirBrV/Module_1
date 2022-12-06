package org.example.Homework4.advanced;
//Продвинутая
//Задача №1
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами - (часы одни))
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.

public class Main {
    public static void main(String[] args) {
        Watch watch1 = new Watch(false);
        Watch watch2 = new Watch(true);
        Employee employee1 = new Employee(watch1);
        Employee employee2 = new Employee(watch2);
        Store store1 = new Store(employee1);
        Store store2 = new Store(employee2);
        Brend[] brend = {store1, store2};
            try {
                store1.getEmployee().getWatch().Tik();
            } catch (WatchBrokenError e) {
                System.out.println(e.getMessage());
            }
           try {
               store2.getEmployee().getWatch().Tik();
           }catch (WatchBrokenError e) {
               System.out.println(e.getMessage());
           }
        }
    }


