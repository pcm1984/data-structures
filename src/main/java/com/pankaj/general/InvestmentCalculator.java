package com.pankaj.general;

public class InvestmentCalculator {
    public static double calculateInvestment(int years, double grossSalary) {
        double compoundedInvestmentAmount = 0;

        for (int i = 1; i <= years; i++) {
            // Salary increment logic
            if (i != 1) {
                if (i % 3 == 0) {
                    grossSalary += grossSalary * 0.30;
                } else {
                    grossSalary += grossSalary * 0.08;
                }
            }

            // Calculate net salary after tax
            double netSalary = grossSalary * 0.75;
            System.out.println("Net after tax: " + netSalary);

            // Calculate investment amount from net salary
            double netInvestmentAmountPerYear = netSalary * 0.25;
            System.out.println("Net investment amount per year: " + netInvestmentAmountPerYear);

            // Calculate compounded investment amount
            compoundedInvestmentAmount = compoundedInvestmentAmount + netInvestmentAmountPerYear;
            compoundedInvestmentAmount = compoundedInvestmentAmount * 1.12;
            System.out.println("Compounded Net after tax : Year " + i + " :" + compoundedInvestmentAmount);
        }

        return compoundedInvestmentAmount;
    }

    public static void main(String[] args) {
        int years = 10;
        double investmentAmount = calculateInvestment(years, 1200000);
        System.out.println("Total compounded investment amount after " + years + " years: " + investmentAmount);
    }
}
