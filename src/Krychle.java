import java.util.Scanner;

public class Krychle {
    int a;  // strana v cm

    public Krychle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte kolik cm bude merit strana a: ");
        a = sc.nextInt();
    }

    public static void main(String[] args) {
        Krychle myObj = new Krychle();
        myObj.vzorce();
        Krychle myObj1 = new Krychle();
        myObj1.vzorce();
        Krychle myObj2 = new Krychle();
        myObj2.vzorce();
    }

    public void vzorce(){
        System.out.println("V = " + a * a * a + " cm^3");
        System.out.println("S = " + 6 * a * a + " cm^2");
    }
}