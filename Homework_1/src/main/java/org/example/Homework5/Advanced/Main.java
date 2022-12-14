package org.example.Homework5.Advanced;
//Продвинутый уровень
//Задача №1
// 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать 10 отчетов (объектов класса FinancialRecord),
// с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
// 4. Записать в файл "report_2.txt" все данные из отчетов.
// 5. Прочитать файл report_2.txt, просуммировать все доходы и вывести на экран,
// то же самое с расходами
// Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String file =
                "D:\\Homework\\Module_1\\Homework_1\\src\\main\\java\\org\\example\\Homework5\\Advanced\\report_2.txt";
        FileWriter writer = new FileWriter(file);
        FinancialRecord[] financialRecord = new FinancialRecord[10];
        for (int i = 0; i < financialRecord.length; i++) {
            financialRecord[i] = new FinancialRecord(new Random().nextInt(10_000),
                    new Random().nextInt(10_000));
            writer.write(String.valueOf(financialRecord[i].getIncomes()) + ";");
        }
        writer.write("\n");
        for (int i = 0; i < financialRecord.length; i++) {
            financialRecord[i] = new FinancialRecord(new Random().nextInt(10_000),
                    new Random().nextInt(10_000));
            writer.write(String.valueOf(financialRecord[i].getOutcomes()) + ";");
        }
        writer.close();
        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String sum = sum(reader);
            System.out.println(sum);
        }
    }

    public static String sum(BufferedReader reader) throws IOException {
        String result = "";
        int income = 0;
        int outcome =0;
        while (reader.ready()) {
            String line = reader.readLine();
            String[] numbers1 = line.split(";");
            for (int i = 0 ; i < numbers1.length; i++) {
                 income += Integer.parseInt(numbers1[i]);
                }
            String line2 =reader.readLine();
            String[] numbers2 = line2.split(";");
            for (int i = 0; i < numbers2.length ; i++) {
                outcome+=Integer.parseInt(numbers2[i]);
            }
        }
        return result += "Доходы : " + income + " " + "Расходы :" + outcome;
            }



        }




