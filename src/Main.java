import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(name(12, 21));
        System.out.println(name(53, -12));
        System.out.println(name(23, 65));
        System.out.println(name(24, 23));
        System.out.println(name(23, -0));
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(name(generateRandomAge(), 24));
    }

    public static String name(int age, int temperature) {
        if ((age > 20 && age < 45 && temperature > -20 && temperature < 30))
            return "Можно идти гулять";
        else if ((age < 20) && temperature > 0 && temperature < 28)
            return "Можно идти гулять";
        else if ((age < 45) && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random randomAge = new Random();
        int generatorAge = randomAge.nextInt(50);
        return generatorAge;
    }


}