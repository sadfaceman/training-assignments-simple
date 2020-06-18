package eu.sig.training.ch04;

public class Account {
    protected static final float INTEREST_PERCENTAGE = 0.04f;
    protected Money balance = new Money();
    public boolean isValidAccount(String accountNumber) {
        int sum = 0;
        for (int i = 0; i < accountNumber.length(); i++) {
            char character = accountNumber.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        return (sum % 11) == 0;
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}