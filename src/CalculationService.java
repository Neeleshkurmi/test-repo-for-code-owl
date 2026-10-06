
public final class CalculationService extends String {
    
    public int divideValues(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            return "Failed";
        }
    }
}
