import java.lang.Thread;

class Car {
    boolean ignition;
    float fuel; // max litrs of fuel - 60
    boolean clutch;
    int distance;
    int movingSpeed;
    boolean startCar;
    boolean acel; //газ
    boolean stopCar;
    
    public Car(float fuel, int distance, int movingSpeed,
               boolean ignition, boolean clutch) {
        this.fuel = fuel;
        this.distance = distance;
        this.movingSpeed = movingSpeed;
        this.ignition = ignition;
        this.clutch = clutch;
    }
    
    public boolean startTheCar(){
        if (clutch && ignition && fuel > 1) {
            return startCar = true;
        } else {
            return startCar = false;
        }
    }

    public boolean stopTheCar() {
        if (clutch == true || fuel < 1 ) {
            ignition = false;
            clutch = false;
            return stopCar = true;
        } else {
            clutch = false;
            ignition = false;
            return stopCar = true; //"car stoped"
        }
    }

    public boolean driveTheCar() {
        if (startCar && acel) {
            int startDistance = distance;
            for (int i = 0; i < distance; i++) {
                fuel -= 0.1;
                distance -= 1;
                if (i % 50 == 0) {
                    if (fuel < 1) {
                        System.out.println("You have not fuel anymore!");
                        System.out.printf("you have traveled a distance of %d km\n", (startDistance - distance));
                        break;
                    }
                    //navigation
                    System.out.println("you have to drive " + (distance - i) + " km." +
                     "Your fuel is - " + fuel + " litrs");
                    //delay - emulation of the traveled distance
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            return true;
        } else {
            System.out.println("You needed to start the car ");
            return false;
        }
    }

    public boolean accelerator() {
        if (startCar) {
            for (int i = 0; i < movingSpeed; i++) {
                i+= 20;
                if (movingSpeed <= 240) {
                    System.out.println("your speed is maximal");
                    break;
                }
                System.out.println("you moving with speed " + i + " km/hour");
                return acel = true;
            }
        } else {
            System.out.println("your car isn't started! please start the car.");
            return acel = false;
        }
        return acel = true;
    }

    public boolean breakes() {
        if (driveTheCar()) {
            System.out.println("you've pressed breaks");
            return true;
        } else {
            System.out.println("the car is still standing");
            return true;
        } 
    }

    public float tank(int money) {
        float finishedFuel = fuel;
        fuel = money/2;
        if (fuel > 60) {
            float rest = (fuel + finishedFuel - 60) * 2;
            fuel = 60;
            System.out.println("you have tank full tank, your rest - " + rest + "euro");
        }
        System.out.println("you have tank your car - " + fuel + " litrs");
        return fuel;
    }
}
