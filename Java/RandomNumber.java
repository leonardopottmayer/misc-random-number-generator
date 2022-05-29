package randomNumber;

public class RandomNumber {
    public int generate(int min, int range) {
        int random = (int)(Math.random() * range) + min;
        return random;
    }
}
