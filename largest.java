public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 80, 20};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
