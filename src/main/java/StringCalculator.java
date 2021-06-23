public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\\n");
        for (String number : numbersArray) {
            if(Integer.parseInt(number.trim()) < 0) {
                throw new IllegalArgumentException("Cannot contain negative numbers.");
            }
            if(Integer.parseInt(number.trim()) > 1000) {
                continue;
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}