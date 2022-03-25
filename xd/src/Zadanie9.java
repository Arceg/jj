public class Zadanie9 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki");
        int wys = o.nextInt();
        for (int i = 1; i<=wys; i++)
        {
            for(int r=0;r<wys-i;r++)System.out.print(" ");
            for (int r = 0; r<(i*2)-1; r++)System.out.print("*");
            System.out.println(" ");
        }
    }
}
