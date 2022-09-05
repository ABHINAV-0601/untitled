public class Main {
    public static void main(String[] args) {
        OddNumber oddNumber = number -> {if (number%2 == 0){return "Even number";}else {return "Odd Number";}};

        System.out.println(oddNumber.evenOrOddNumber(6));
    }
}
