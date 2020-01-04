package edu.niptict.cs.g5.lms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import static java.lang.System.out;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/14/2019
 **/
public class Loan {

    private double annualInterestRate;

    @Deprecated
    private int numberOfYears;
    private int numberOfMonths;

    private BigDecimal loadAmount;
    private Date loadDate;

    private volatile BigDecimal monthlyPayment;

    public Loan(double annualInterestRate, int numberOfMonths, double loadAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfMonths = numberOfMonths;
        this.loadAmount = BigDecimal.valueOf(loadAmount);
        this.loadDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getLoadAmount() {
        return loadAmount.doubleValue();
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public String getLoadDate() {
        return loadDate.toString();
    }

    public BigDecimal getMonthlyPayment() {
        if (monthlyPayment != null) {
            return monthlyPayment;
        } else {
            synchronized (this) {
                if (monthlyPayment == null) {
                    monthlyPayment = calculateMonthlyPayment();
                }

                return monthlyPayment;
            }
        }
    }

    private BigDecimal calculateMonthlyPayment() {
        BigDecimal monthlyInterestRate = BigDecimal.valueOf(annualInterestRate / 1200);

        BigDecimal somethingTop = loadAmount.multiply(monthlyInterestRate);
        double somethingBelow = 1 - 1 / Math.pow(monthlyInterestRate.doubleValue() + 1, numberOfMonths);

        BigDecimal monthlyPayment = somethingTop.divide(BigDecimal.valueOf(somethingBelow), somethingTop.scale(), RoundingMode.HALF_UP);

        return monthlyPayment;
    }

    public BigDecimal getTotalPayment() {
        BigDecimal totalPayment = getMonthlyPayment().multiply(BigDecimal.valueOf(numberOfMonths));
        return totalPayment;
    }

    public static void main(String[] args) {
        Loan loan = new Loan(10.00, 199, 38433.00);

        out.println("Monthly payment = " + loan.getMonthlyPayment());
        out.println("Total payment = " + loan.getTotalPayment());
    }
}
