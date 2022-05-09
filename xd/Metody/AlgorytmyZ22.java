import java.util.Scanner;
public class AlgorytmyZ22 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int liczba = s.nextInt();
            System.out.print("Dzielniki liczby: " + liczba + " to: 1, ");
            for(int i=2;i<=(liczba/2);i++){
                if((liczba % i)==0)
                {
                    System.out.print(i + ", ");
                }
            }
            System.out.print(liczba + ";");
            s.close();
}
