package model.entities;

import java.util.Date;

//1
public class Contract {
    private Integer number;
    private Date date;
    private Double totalValeu;

    private Installment installment;

    public Contract(){

    }
    public Contract(Date date, Double totalValeu) {
        this.date = date;
        this.totalValeu = totalValeu;
    }


    public Contract(Integer number, Date date, Double totalValeu) {
        this.number = number;
        this.date = date;
        this.totalValeu = totalValeu;
    }

    public Contract(Integer number, Date date, Double totalValeu, Installment installment) {
        this.number = number;
        this.date = date;
        this.totalValeu = totalValeu;
        this.installment = installment;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValeu() {
        return totalValeu;
    }

    public void setTotalValeu(Double totalValeu) {
        this.totalValeu = totalValeu;
    }

    public Installment getInstallment() {
        return installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }
}
