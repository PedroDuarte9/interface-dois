package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//6
public class Program {
    public static void main(String[] args) throws ParseException {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do Contrato");
        System.out.println("Número");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);


        System.out.println("Entre com o número de parcelas: ");
        int installments = sc.nextInt();




        sc.close();
    }
}
