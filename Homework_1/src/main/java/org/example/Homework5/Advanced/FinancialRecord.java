package org.example.Homework5.Advanced;

public class FinancialRecord {
    private int incomes;
    private int outcomes;

    public FinancialRecord (){};
    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    @Override
    public String toString() {
        return "FinancialRecord{" +
                "incomes=" + incomes +
                ", outcomes=" + outcomes +
                '}';
    }
}

