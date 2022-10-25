package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//Criado por segundo
public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValeu;

    private List<Installment> installments = new ArrayList<>();

    public Contract() {

    }

    public Contract(Integer number, LocalDate date, Double totalValeu) {
        this.number = number;
        this.date = date;
        this.totalValeu = totalValeu;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValeu() {
        return totalValeu;
    }

    public void setTotalValeu(Double totalValeu) {
        this.totalValeu = totalValeu;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}


