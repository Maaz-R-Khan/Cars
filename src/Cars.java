public class Cars {
    private String Make;
    private String Model;
    private int Year;
    private String Color;

    //Default Constructor
   Cars() {
       this.Make = "";
       this.Model = "";
       this.Year = 0;
       this.Color = "";
   }

   //Parametric constructor
   Cars(String Make, String Model, int Year, String Color) {
       this.Make = Make;
       this.Model = Model;
       this.Year = Year;
       this.Color = Color;
   }

   //Copy Constructor
    Cars(Cars anotherCar) {
        this.Make = anotherCar.Make;
        this.Model = anotherCar.Model;
        this.Year = anotherCar.Year;
        this.Color = anotherCar.Color;
    }

   //printMe Method prints all the car object information.
    public void printMe() {
        System.out.println("Make: " + Make + ", Model: " + Model + ", Year: " + Year + ", Color: " + Color);
    }


}

