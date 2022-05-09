import java.util.Scanner;

public class AlgorytmyZ24 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int liczba = n.nextInt() ;

        boolean first= true;

        for(int i=2; i<Math.sqrt(n); i++)

        {
            if
            ((liczba % i == 0)){
                first = false;
            }
        }
        if (first)
            System.out.println(liczba + "jest pierwsza");
        else
                System.out.println(liczba + "nie jest pierwsza");
    }
