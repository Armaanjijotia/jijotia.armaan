import java.util.Scanner;
 class SalesPersonSales {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 final int NUM_SALESPERSONS = 5;
 double[] sales = new double[NUM_SALESPERSONS];
 double totalSales = 0;
 double maxSale = Double.MIN_VALUE;
 double minSale = Double.MAX_VALUE;
 for (int i = 0; i < NUM_SALESPERSONS; i++) {
 System.out.print("Enter sales for salesperson :" + (i + 1) + ": ");
 sales[i] = scanner.nextDouble();
  totalSales += sales[i];

if (sales[i] > maxSale) {
 maxSale = sales[i];
}
if (sales[i] < minSale) {
 minSale = sales[i];
}
}
System.out.println("\nSalesperson Sales:");
for (int i = 0; i < NUM_SALESPERSONS; i++) {
System.out.println("Salesperson " + (i + 1) + ": rs" + sales[i]);
}
double averageSales = totalSales / NUM_SALESPERSONS;
 System.out.println("\nTotal Sales: rs :" + totalSales);
 System.out.println("Average Sales: rs:" + averageSales);
 System.out.println("Max Sale: rs:" + maxSale);
 System.out.println("Min Sale: rs:" + minSale); 
 scanner.close();
}
}


