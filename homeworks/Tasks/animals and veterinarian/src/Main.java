public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal dog = new Dog("Barsik", 5, "fatt", "Australia");
        Animal[] animals = {dog};
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}