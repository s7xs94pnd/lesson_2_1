public class Main2 {
    public static void main(String[] args) {
        int temperature = 39;
        int students = 19;
        boolean is_rainy = false;

        if (temperature > 20 && temperature < 40) { // && - логический оператор И (AND)
            System.out.println("Идем купаться");
        }

        if (students < 10 && temperature > 25) {
            System.out.println("Играем в теннис");
        }

        if (students > 15 || temperature < 30) { // || - логический оператор ИЛИ (OR)
            System.out.println("Идем в школу");
        }

        if (is_rainy || temperature < 15) {
            System.out.println("Едем на работу");
        }

        if (temperature > 15 && temperature < 30 || students > 10
                && students < 20 || is_rainy) {
            // true && false || true && true || false => 1 * 0 + 1 * 1 + 0 => 0 + 1 + 0 = 1 (true)
            System.out.println("Едем на пикник");
        }
        if (temperature > 15 && (temperature < 30 || students > 10)
                && students < 20 || is_rainy) {
            // true && (false || true) && true || false => 1 * (0 + 1) * 1 + 0 => 1 * 1 * 1 + 0 = 1 (true)
            System.out.println("Едем на ИК");
        }

        if (is_rainy) { // false
            System.out.println("Возьмите зонт");
        }

        if (!is_rainy) { // true
            System.out.println("Можно купаться");
        }
    }
}
