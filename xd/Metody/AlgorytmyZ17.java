public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe...");
        int r = scanner.nextInt();
        if( r % 2 == 0 ) System.out.println("Podana liczba jest parzysta.");
        else System.out.println("Podana liczba nie jest parzysta.");
        }
        }