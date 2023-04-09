import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        int n, a=1, b=1, c;
        Scanner inp = new Scanner(System.in);
        System.out.print("n sayisini giriniz : ");
        n = inp.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            }


    }
}

