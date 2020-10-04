package homework3.task3;

public class CardMain {

    public static void main(String[] args) {
        BankCard bankCard1 = new BankCard("1234567890123456", "VISA", "Elizabeth Blackburn", "01/24", 123); //valid
        BankCard bankCard2 = new BankCard("2234567890123456", "MasterCard", "", "01/20", 111); //invalid name
        BankCard bankCard3 = new BankCard("3234567890123456", "MasterCard", "Marie Curie", "01/19", 111); //invalid date
        BankCard bankCard4 = new BankCard("4234567890123456", "VISA", "Donald Knuth", "01/20", 1111); //invalid CVV
        BankCard bankCard5 = new BankCard("5234567890123456", "American Express", "John Carmack", "01/20", 111); //invalid type
        BankCard bankCard6 = new BankCard("62345678tv123456", "American Express", "John Carmack", "01/20", 111); //invalid number

        bankCard1.printCard();
        bankCard2.printCard();
        bankCard3.printCard();
        bankCard4.printCard();
        bankCard5.printCard();
        bankCard6.printCard();
    }
}