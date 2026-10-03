import java.util.Scanner;

      class WaterBillCalculator {
         public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

          System.out.print("Enter water consumption in litres: ");
        if (!sc.hasNextInt())
             { 
            System.out.println("Invalid input. Please enter a whole number.");
            sc.close();
            return;
        }
        int consumption = sc.nextInt();
        if (consumption < 0) {
            System.out.println("Consumption cannot be negative.");
            sc.close();
            return;
        }
        int billAmount;
        if (consumption <= 500) 
            {
            billAmount = 100;
        } else 
            {
            billAmount = 200;
        }
        System.out.println("Water Bill: Rs. " + billAmount);
        sc.close();
    }
}
