public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Validator {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        int testNumber = -5;

        try {
            validateNumber(testNumber);
            System.out.println("Number is valid.");
        } catch (CustomValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
