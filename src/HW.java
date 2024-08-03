import java.util.Random;

public class HW {
    public static void main(String[] args) {
        System.out.println(permission(25,0));
        System.out.println(permission(19,20));
        System.out.println(permission(80,23));
        System.out.println(permission(17 ,-10));
        System.out.println(permission(46,40));
        System.out.println(permission(generateRandomAge(),10));
    }
    public static String permission(int age, int tempNow) {
        if (age >= 20 && age <= 45 && tempNow >= -20 && tempNow <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && tempNow > 0 && tempNow < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && tempNow > -10 && tempNow < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(110);
    }
}
