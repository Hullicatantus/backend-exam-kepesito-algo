package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    //todo: implement your solution here

    public int addDigits(String input) {
        if (input == null || input.equals("")  || input.length() == 0 || input.isEmpty()) {
            return -1;
        }

        int len = input.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            Character character = input.charAt(i);
            if (Character.isDigit(input.charAt(i))) {
                sum += Character.getNumericValue(character);
            }
        }
        return sum;
    }
}
