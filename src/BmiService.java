public class BmiService {

    public int calculate(double kgBodyWeight, double mHeight) {
        double result = kgBodyWeight / (mHeight * mHeight);
        return (int) result;
    }
}
