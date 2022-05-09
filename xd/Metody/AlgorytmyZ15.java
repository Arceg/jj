import java.util.Scanner;
public class AlgorytmyZ15 {
        public static void main(String[] args) {
            int k;
            int c;
            int suma = 0;
            System.out.println("Podaj ile elementów ma tablica");
            Scanner zrob = new Scanner(System.in);
            k = zrob.nextInt();
            System.out.println("Podaj zliczany element");
            c = zrob.nextInt();
            int[] a = new int[k];
            for (int i=0; i<k; i++) {
                System.out.println("Podaj "+i+" element");
                a[i] = zrob.nextInt();
            }
            zrob.close();
            for (int i=0; i<a.length; i++){
                if (c==a[i]){suma++;
                }
            }
            if(suma==1){System.out.println(" występuje "+suma+" raz");
            }
            else{System.out.println(" występuje "+suma+" razy");
            }
        }
    }



















}
