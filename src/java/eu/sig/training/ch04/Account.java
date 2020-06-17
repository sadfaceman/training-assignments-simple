package eu.sig.training.ch04;

public class Account {
    public boolean isValidAccount(String accountNumber) {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        return (sum % 11) == 0
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