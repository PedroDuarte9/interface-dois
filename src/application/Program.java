package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Criado por terceiro
public class Program {
    public static void main(String[] args)  {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do Contrato");
        System.out.print("Número");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);


        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for(Installment i : contract.getInstallments()){
            System.out.println(i);
        }


        sc.close();
    }
}
