public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureType = " ";
        gradeOfFurniture = " ";
        color = " ";
        furnitureUsage = " ";
        price = 0.0;
    }

    public double calculateDiscount(double discount) {
        if (furnitureUsage == "outdoor") {
            discount = 5;
            return price + (price * discount / 100);
        } else {
            return price;
        }
    }
}
