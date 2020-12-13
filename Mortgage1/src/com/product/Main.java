package com.product;

public class Main {

    public static void main(String[] args){
        int principal = (int) Console.readNumber("Principal: ", 1000, 10_00_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
        byte months = (byte) Console.readNumber("Months: ", 1, 10);

        var calulator = new MortgageCalculator(principal, annualInterest, years,months);

        var report = new MortgageReport(calulator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}

