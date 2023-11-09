package com.pluralsight;

public class LeaseContract extends Contract{
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold,
                         double totalPrice, double monthlyPayment, double expectedEndingValue, double leaseFee) {
        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getMonthlyPayment(){

    }

    @Override
    public double getTotalPrice(){
        return expectedEndingValue + leaseFee + getMonthlyPayment();
    }
}
