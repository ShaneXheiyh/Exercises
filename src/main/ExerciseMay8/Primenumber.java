package Main.ExerciseMay8;

public class Primenumber {
    public static void main(String[] args) {
        long a = 600851475143L;
        a = 145263L;
        System.out.println(isPrime(13));
//        for every number i from half of a to 1
//        (half of a because the greatest divisor of any number is it's half)
        for(long i = a/2; i > 0; i--) {
            //check if a divisible by i and if i is prime
            // then we found the largest prime factor (or divisor)
            if (a % i == 0 && isPrime(i)) {
                System.out.println(" The largest prime is:" + i);
                //we break because we found the largest factor already and we dont need to find any other factors
                break;
            }
        }
    }
        public static boolean isPrime(long x) {
        // we assume is Prime
            boolean isPrime = true;
//            for every number i from 2 to half of x
            for (long i = 2; i < x/2; i++) {
                // check if the number x is divisible by i
                if (x % i == 0) {
//                    if true then it's is not prime
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }

}