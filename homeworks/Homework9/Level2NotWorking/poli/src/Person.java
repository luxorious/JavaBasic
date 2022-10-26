public class Person {
    String name;
    int age;

    Person(String clientsName, int clientsAge){
        this.name = clientsName;
        this.age = clientsAge;
    }

    public void breath(){
        System.out.println(name + "сказал Вдох-выдох и его возраст: " + age);
    }

}