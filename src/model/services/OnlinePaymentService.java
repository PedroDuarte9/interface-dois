package model.services;

//Criado por quarto
public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, Integer months);
}
