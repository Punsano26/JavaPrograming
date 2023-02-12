
public class Car {

/* Attributes */
    public int size;
    public String color;
    public String model;

        public static void main (String[] args) {
       /* moveForward();
        moveBackword();
        stop();
        trunOnlight();
        trunOfflight(); */

        Car redCar = new Car();
        redCar.color = "red";
        redCar.size = 4;
        redCar.model = "Toyota";

        Car blueCar = new Car();
        blueCar.color = "blue";
        blueCar.size = 7;
        blueCar.model = "Nissan";
        
        System.out.println("Car color: " + redCar.color);
        System.out.println("Car size: " + redCar.size);
        System.out.println("Car model: " + redCar.model);
        redCar.turnOnlight();

        System.out.println("Car color: " + blueCar.color);
        System.out.println("Car size: " + blueCar.size);
        System.out.println("Car model: " + blueCar.model);
        blueCar.moveForward();
        }
    /* Methods */ 
    public void moveForward(){
     System.out.println(this.color + " " + "Move forward");
}

public void moveBackForward(){
     System.out.println(this.color + " " + "Move backward");
}

public void stop(){
     System.out.println(this.color + " " + "stop");
}

public void turnOnlight(){
     System.out.println(this.color + " " + "trunOnlight");
}
public void turnOfflight(){
     System.out.println(this.color + " " + "trunOfflight");
}
}