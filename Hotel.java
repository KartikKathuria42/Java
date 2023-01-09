import java.util.Scanner;

public class Hotel {
    private String name;
    private long mno;
    private double bill;
    private double gst;
    private double st;
    private double tamt;

    // default constructor
    public Hotel(){
        name = "";
        mno = 0;
        bill = 0.0;
        gst = 0.0;
        st = 0.0;
        tamt = 0.0;
    }
    
    // accept method
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer Mobile Number: ");
        mno = sc.nextLong();
        System.out.print("Enter Bill Amount: ");
        bill = sc.nextDouble();
        sc.close();
    }

    // calculate method
    public void calculate() {
        gst = (18/100.0)*bill;
        st = (12.5/100.0)*bill;
        tamt = bill + gst + st;
    }

    // Display Method
    public void display(){
        System.out.println("Customer Name: "+name);
        System.out.println("Mobile Number: "+mno);
        System.out.println("GST: "+gst);
        System.out.println("Servics Tax: "+st);
        System.out.println("Total Amount: "+tamt);
    }
    public static void main(String[] args) {
        Hotel obj = new Hotel();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
