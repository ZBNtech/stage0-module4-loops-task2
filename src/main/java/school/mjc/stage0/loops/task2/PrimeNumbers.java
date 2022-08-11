package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive){
            if (printToInclusive == 0){
                break;
            }
            else if(checkPrime(i)){
                System.out.println(i);
            }
            i++;
        }

    }

    public boolean checkPrime(int num){
        int i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            return true;
        else
            return false;
    }
}
