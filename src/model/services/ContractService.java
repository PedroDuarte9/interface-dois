package model.services;

import model.entities.Contract;
import model.entities.Installment;

//3
public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){


        contract.setInstallment(new Installment());

    }
}
