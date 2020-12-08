package com.interfaces;

public class TaxCalculator2020 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2020( double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
//         TaxCalculator.minimumTax = 100;
        return taxableIncome * 0.4;
    }
}
