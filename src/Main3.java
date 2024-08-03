public class Main3 {

    public static void duration() {
        // невозвращаемый метод без входящих параметров
        System.out.println("Процесс занял 15 мин");
    }

    public static void main(String[] args) { // DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();
        addition(7, 12, "JAVA");
        addition(15, 20, "Programming is cool!");
        calculatePerimeter("Auditory 2", 5.5f, 6.5f);
        calculatePerimeter("Hall", 10.6f, 8);
        calculatePerimeter("Kitchen", 3.0f, 4.0f);
        double areaOfAuditory2 = calculateArea(5.5f, 6.5f);
        System.out.println("Area of room Auditory 2: " + areaOfAuditory2 + " m2.");
        double areaOfHall = calculateArea(10.6f, 8);
        System.out.println("Area of room Hall: " + areaOfHall + " m2.");
        double areaOfKitchen = calculateArea(3.0f, 4.0f);
        System.out.println("Area of room Kitchen: " + areaOfKitchen + " m2.");
        System.out.println("TOTAL area: " +
                (areaOfAuditory2 + areaOfHall + areaOfKitchen) + " m2.");
    }

    public static float calculateArea(float length, float width) {
        // возвращаемый метод с входящими параметрами
        float area = length * width;
        return area;
    }

    public static void calculatePerimeter(String roomName,
                                          float length, float width) {
        // невозвращаемый метод с входящими параметрами
        float perimeter = 2 * (length + width);
        System.out.println("Perimeter of room "
                + roomName + ": " + perimeter + " m.");
    }

    public static void addition(int num1, int num2, String phrase) {
        // невозвращаемый метод с входящими параметрами
        System.out.println("Сумма чисел: " + (num1 + num2));
        System.out.println("Фраза: " + phrase);
    }

    public static void makeTea() {
        // невозвращаемый метод без входящих параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в пиалу");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }

    // End of program
}
