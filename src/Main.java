//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cars car1 = new Cars("Kia", "Borrego", 2009, "Blue");
        Cars car2 = new Cars("Toyota", "Camry", 2022, "Blue");
        Cars car3 = new Cars("Ford", "Mustang", 2005, "Red");
        Cars car4 = new Cars("Dodge", "Challenger", 2021, "Silver");
        Cars car5 = new Cars(car2);

        car1.printMe();
        car2.printMe();
        car3.printMe();
        car4.printMe();
        car5.printMe();
    }
}