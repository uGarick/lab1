public class Primes {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++) {
            if (isPrime(i)) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
    }
    //проверка на простое число
    public static boolean isPrime(int n)
    {
        //проверка на четность
        if (n % 2 == 0) return false;
        //проверка на деление n на все числа до кв. корня n
        for(int i=3; i*i<=n; i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
