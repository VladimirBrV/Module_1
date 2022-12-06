package org.example.Homework4.expert;

public class CarShope {
    private Car car = new Car();
    public CarShope(Car car) {
        this.car = car;
    }
    public void sellCar () throws PriceIsNull {
        if (car.getPrice() <= 0) { throw new PriceIsNull("Здравствуй клиент, цена этого авто \n" + "Неизвестна мне\n" +
                "Давайте посмотрим другое авто?");}
        if (car.getPrice() > 0)
        {
            System.out.println("Здравствуй клиент, цена этого авто ");
            car.showPrice();
            System.out.println("Хочешь купить авто"); }

    }
}

