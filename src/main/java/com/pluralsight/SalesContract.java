package com.pluralsight;

public class SalesContract extends Contract {
    private double salesTaxAmount;  //5%
    private double recordingFee;    //$100
    private double processingFee;   //$295 for vehicles under $10,000 and $495 for all others
    private boolean finance;        //yes/no

    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold,
                         double totalPrice, double monthlyPayment, double salesTaxAmount, double recordingFee,
                         double processingFee, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;

    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }


    @Override
    public double getMonthlyPayment() {

    }

    @Override
    public double getTotalPrice() {
        return recordingFee + processingFee + getMonthlyPayment();
    }


}
