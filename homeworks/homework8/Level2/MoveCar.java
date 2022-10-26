/**
 * Java Basic. Home work#8
 * 
 * @author Volodymyr
 * @date 28.9.2022
 * @todo 3.10.2022
 * 
 */

class MoveCar {
    public static void main(String[] args) {
        Car car = new Car(20, 1000, 240, true, true); // max litrs of fuel - 60
        car.driveTheCar();
        System.out.println(car.startTheCar());
        System.out.println(car.accelerator());
        System.out.println("Car is stoped? " + car.stopTheCar());
        car.driveTheCar();
        car.tank(200);
        car.tank(200); //проверка заправит ли бак если он полный
        car.breakes();
    }
}