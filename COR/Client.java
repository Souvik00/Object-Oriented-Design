
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();

        ReqHandler cashier = new Cashier();
        ReqHandler manager = new Manager();
        ReqHandler seniorManager = new  SeniorManager();

        cashier.setNextHandler(manager);
        manager.setNextHandler(seniorManager);


        if(amount<10000){
            cashier.reqHandle(1);
        }
        else if (amount>=10000 && amount<1000000){
            cashier.reqHandle(2);
        }
        else{
            cashier.reqHandle(3);
        }

    }
}