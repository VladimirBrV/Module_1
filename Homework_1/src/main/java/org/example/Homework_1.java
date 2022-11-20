package org.example;
//Продвинутый уровень

public class Homework_1 {
    //Задача №1
//Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
    public static void main(String[] args) {
        String number = "234";
        String text = "some_text";
        int newNumber = Integer.parseInt("234");
        int count = text.length();
        int result1 = newNumber + count;
        System.out.println(result1);

        //Задача №2
//Посчитать (a+b)^2 = ?, при a=3, b=5

        int a = 3;
        int b = 5;
        int result2 = 1;
        for (int i = 0; i < 3; i++) {
            result2 = (a + b) * result2;
            result2 = result2;
        }
        System.out.println(result2);
//        Задание №3:
// Дано:
//        boolean hasFuel = true;
//                boolean hasElectricsProblem = false;
//                boolean hasMotorProblem = false;
//                boolean hasTransmissionProblem = true;
//                boolean hasWheelsProblem = true;
// В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
// Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
// Если у машины проблема с двигателем, то чинят и берут 10 000.
// Если у машины проблема с электрикой, то чинят и берут 5000.
// Если у машины проблема с коробкой передач, то чинят и берут 4000.
// Если у машины проблема с колесами, то чинят и берут 2000.
// Если две детали сломаны, то на общий счет идет скидка 10%.
// Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
// Если нет бензина и что-то сломано, то за консультацию денег не берут.
// Ситуации, что бензин есть и ничего не сломано - быть не может.
// Ожидаемый результат: выведен на экран счет клиенту.


        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;

        double resultPrise = 0;
        int count2 = 0;
        int priceConsultation = 0;
        int priceMotor = 0;
        int priceElectric = 0;
        int priceTransmission = 0;
        int priceWheel = 0;

        if (hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem) {
            priceConsultation = 0;
        } else if (hasFuel) {
            priceConsultation = 1000;
            count2++;
        }

        if (hasMotorProblem) {
            priceMotor = 10_000;
            count2++;
        } else {
            priceMotor = 0;
        }

        if (hasElectricsProblem) {
            priceElectric = 5_000;
            count2++;
        } else {
            priceElectric = 0;
        }

        if (hasWheelsProblem) {
            priceWheel = 2_000;
            count2++;
        } else {
            priceWheel = 0;
        }

        if (hasTransmissionProblem) {
            priceTransmission = 4_000;
            count2++;
        } else {
            priceTransmission = 0;
        }

        resultPrise = priceConsultation + priceMotor + priceWheel + priceTransmission + priceElectric;

        if (hasTransmissionProblem && (hasMotorProblem || hasElectricsProblem)) {
            resultPrise = resultPrise - (resultPrise * 0.2);
        } else if (count2 >= 2) {
            resultPrise = resultPrise - (resultPrise * 0.1);
        } else {
            resultPrise = resultPrise;
        }
        System.out.println(resultPrise);
    }
}



