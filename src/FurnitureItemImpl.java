import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem object = new FurnitureItem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FurnitureCode : ");
        object.furnitureCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Furniture Type: Tables, Chairs, Cupboards, Stools ");
        object.furnitureType = scanner.nextLine();
        System.out.println("Enter Grade Of Furniture : grade 1, grade 2, grade 3 ");
        object.gradeOfFurniture = scanner.nextLine();
        System.out.println("Enter Color : Red, Blue, Green ");
        object.color = scanner.nextLine();
        System.out.println("Enter Furniture Usage : indoor, outdoor ");
        object.furnitureUsage = scanner.nextLine();
        System.out.println("Price of item : ");
        object.price = scanner.nextDouble();
        if (object.furnitureUsage.equals("outdoor")) {
            System.out.println("Price of Outdoor item after discount : " + object.calculateDiscount());
        } else {
            System.out.println("No Discount");
        }


    }

}
