public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kgBodyWeight = 57;
        double mHeight = 1.62;
        int bmi = service.calculate(kgBodyWeight, mHeight);

        System.out.println(bmi);
    }
}