package homework3.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankCard {
    private String cardNumber;
    private String cardType;
    private String cardOwner;
    private String cardExpiryDate;
    private int cardCvv;
    boolean validStatus;

    Validator validator = new Validator();

    public BankCard(String cardNumber, String cardType, String cardOwner, String cardExpiryDate, int cardCvv) {
        if (validator.isValidCardNumber(cardNumber)) {
            this.cardNumber = cardNumber;
        }
        if (validator.isValidCardType(cardType)) {
            this.cardType = cardType;
        }
        if (validator.isValidCardOwner(cardOwner)) {
            this.cardOwner = cardOwner;
        }
        if (validator.isValidExpiryDate(cardExpiryDate)) {
            this.cardExpiryDate = cardExpiryDate;
        }
        if (validator.isValidCvv(cardCvv)) {
            this.cardCvv = cardCvv;
        }
        if (validator.isCrdFieldsValid(this)) {
            this.validStatus = true;
        }
    }

    public void printCard() {
        System.out.println("Card Number: " + this.getCardNumber() + "; " + "Card Type: " + this.getCardType() + "; " +
                "Name: " + this.getCardOwner() + "; " + "Expiration Date: " + this.getCardExpiryDate() + "; " +
                "CVV: " + this.getCardCvv() + "; " + "Valid status: " + this.isValidStatus());
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public int getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(int cardCvv) {
        this.cardCvv = cardCvv;
    }

    public boolean isValidStatus() {
        return validStatus;
    }

    public void setValidStatus(boolean validStatus) {
        this.validStatus = validStatus;
    }


    private static class Validator { // Внутренний класс Валидатор

        public boolean isValidCardNumber(String cardNumber) {
            String cardNumberRegexp = "^\\d{16}$";
            Pattern pattern = Pattern.compile(cardNumberRegexp);
            Matcher matcher = pattern.matcher(cardNumber);
            if (matcher.matches()) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isValidCardType(String cardType) {
            if (cardType == "VISA" || cardType == "MasterCard") {
                return true;
            } else {
                return false;
            }
        }

        public boolean isValidCardOwner(String cardOwner) {
            if (cardOwner != null && cardOwner.length() > 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isValidExpiryDate(String cardExpiryDate) {
            String cardExpiryDateRegexp = "^[0,1][0-9]/[2-9][0-9]$";
            Pattern pattern = Pattern.compile(cardExpiryDateRegexp);
            Matcher matcher = pattern.matcher(cardExpiryDate);
            if (matcher.matches()) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isValidCvv(int cardCvv) {
            if (cardCvv > 0 & cardCvv < 1000) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isCrdFieldsValid(BankCard bankCard) {
            return bankCard.cardNumber != null && bankCard.cardType != null && bankCard.cardOwner != null && bankCard.cardExpiryDate != null && bankCard.cardCvv != 0;
        }
    }
}
