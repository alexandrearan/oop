package alexandre;

public class Main {

    public static void main(String[] args) {

//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("Carrera");
//
//        System.out.println(porsche.getModel());
//
//        porsche.setModel("911");
//
//        System.out.println(porsche.getModel());

        BankAccount account = new BankAccount(1234, 200.03, "Alexandre", "chan.arantes@gmail.com", "087 941 1122");


//        account.setNumber(11232);
//        account.setName("Alexandre Arantes");
//        account.setEmail("chan.arantes@gmail.com");
//        account.setPhone("087 941 9555");

//        System.out.println("Name: " + account.getName());
//        System.out.println("Email: " + account.getEmail());
//        System.out.println("Phone: " + account.getPhone());
//        System.out.println("Account #: " + account.getNumber());
//        System.out.println("Balance: " + account.getBalance());
//
//        System.out.println("Deposit: " + account.deposit(2000.45));
//        System.out.println("Balance: " + account.getBalance());
//
//        System.out.println("Withdraw: " + account.withdrawal(1000.32));
//        System.out.println("Balance: " + account.getBalance());
//
//        System.out.println("Withdraw: " + account.withdrawal(1000.32));
//        System.out.println("Balance: " + account.getBalance());

//        VipCustomer customer = new VipCustomer("Alexandre", "chan.arantes@gmail.com");
//
//        System.out.println(customer.getName());
//
//        Point p1 = new Point (6, 5);
//        Point p2 = new Point(3, 344);
//
//        System.out.println(p1.distance());

//
//        Carpet carpet = new Carpet(1.5);
//        Floor floor = new Floor(5.4, 4.5);
//        Calculator calculator = new Calculator(floor, carpet);
//
//
//        System.out.println(calculator.getTotalCost());


        ComplexNumber c1 = new ComplexNumber (2, 5);
        ComplexNumber c2 = new ComplexNumber (3, 4);
        c1.add(c2);

        System.out.println(c1.getImaginary());
    }
}
