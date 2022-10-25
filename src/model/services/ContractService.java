package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.util.Date;

//Criado por quinto
public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    //Este método tem que processar o contrato, basedo nas informações de um contrato e quantidade de parcelas
    public void processContract(Contract contract, int months){

        //Aqui é uma variável que vai armazenar o valor total da parcela e dividir pela quantidade de parcelas.
        double basicQuota = contract.getTotalValeu() / months;

            for (int i = 1; i <= months; i++){
                LocalDate dueDate = contract.getDate().plusMonths(i);//Criada uma variável para armazenar o aumento de mais 1 mes conforme o mês que foi passado

                double interest = onlinePaymentService.interest(basicQuota, i);

                double fee = onlinePaymentService.paymentFee(basicQuota + interest);

                double quota = basicQuota + interest + fee;

                contract.getInstallments().add(new Installment(dueDate, quota));
            }
    }
}
