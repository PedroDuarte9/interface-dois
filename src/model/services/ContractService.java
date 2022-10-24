package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Date;

//3
public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

    contract.setDate(new Date());



    }
}
