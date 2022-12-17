package GeakPu.Ch3;

public class PenUser2 {
    public static void main(String[] args) {
        System.out.println("Hello Pen!");

        Pen2 mypen = new Pen2();
        mypen.write();

        Pen2 mypen2 = new Pen2("Red");
        mypen2.write();

        Pen2 mypen3 = new Pen2(1000);
        mypen3.write();

        Pen2 mypen4 = new Pen2("SMU", "Yellow", 5000);
        mypen4.write();
    }
}