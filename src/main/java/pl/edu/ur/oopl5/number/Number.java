package pl.edu.ur.oopl5.number;

/**
 */
public class Number implements NumberInterfaces {

    int number;

    public Number(String number) {
        this.number = Integer.valueOf(number);
    }

    public int factorial() {
        if (number >= 0) {
            int wynik = 1;
            for (int i = 1; i < number + 1; i++) {
                wynik *= i;
            }
            return wynik;
        } else {
            return 0;
        }
    }

    public int multiply(int i) {
        return number * i;
    }

    public void setNumber(String number) {
        this.number = Integer.valueOf(number);
    }

}
