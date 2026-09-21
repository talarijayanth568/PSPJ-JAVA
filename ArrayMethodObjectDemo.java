import java.util.Scanner; 
class FleetCalculator {
    public int calculateSum(int[] numbers) { 
        int sum = 0; 
        for (int num : numbers) { 
            sum += num; 
        } 
        return sum; 
    } 
    public double calculateAverage(int[] numbers) { 
        int sum = calculateSum(numbers); 
        return (double) sum / numbers.length;
    } 
    public int findMax(int[] numbers) { 
        int max = numbers[0]; 
        for (int num : numbers) { 
            if (num > max) {
                max = num; 
            } 
        } 
        return max; 
    } 
    public int findMin(int[] numbers) { 
        int min = numbers[0]; 
        for (int num : numbers) { 
            if (num < min) {  
                min = num; 
            } 
        } 
        return min; 
    } 
} 
public class ArrayMethodObjectDemo { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        FleetCalculator calc = new FleetCalculator(); 
        System.out.print("Enter array size: ");
        int size = scanner.nextInt(); 
        int[] dataset = new int[size]; 
        System.out.println("Enter " + size + " integers:"); 
        for (int i = 0; i < dataset.length; i++) { 
            System.out.print("Value " + (i + 1) + ": "); 
            dataset[i] = scanner.nextInt(); 
        } 
        System.out.println("\n--- Select Operation ---"); 
        System.out.println("1. Calculate Sum"); 
        System.out.println("2. Calculate Average"); 
        System.out.println("3. Find Maximum"); 
        System.out.println("4. Find Minimum"); 
        System.out.print("Enter choice (1-4): "); 
        int choice = scanner.nextInt(); 
        switch (choice) { 
            case 1: 
                int sum = calc.calculateSum(dataset); 
                System.out.println("Sum = " + sum); 
                break; 
            case 2: 
                double avg = calc.calculateAverage(dataset); 
                System.out.println("Average = " + avg); 
                break; 
            case 3: 
                int max = calc.findMax(dataset); 
                System.out.println("Maximum = " + max); 
                break; 
            case 4: 
                int min = calc.findMin(dataset); 
                System.out.println("Minimum = " + min); 
                break; 
            default: 
                System.out.println("Invalid selection!"); 
                break; 
        } 
        scanner.close(); 
    } 
} 