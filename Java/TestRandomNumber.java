package randomNumber;

import java.util.Random;

public class TestRandomNumber {
    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        System.out.println(rn.generate(1, 10));
    }
}
