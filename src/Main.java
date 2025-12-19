public class Main {

    public static void main(String[] args) {

        //task1
        Animal animal = new Animal();
        System.out.println(animal.sound());
        Dog dog = new Dog();
        System.out.println(dog.sound());
        Cat cat = new Cat();
        System.out.println(cat.sound());

        //task2
        Employee employee =  new Employee("Tural", 30 , 50000 );
        System.out.println(employee.name + " is " + employee.age + " years old with salary " + employee.getSalary());


        //task3

        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        Square square = new Square(5);
        System.out.println(square.getArea());

        //task4

        ElectricCar electricCar = new ElectricCar();
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.openDoors());
        System.out.println(electricCar.chargeBattery());

        //task5


        EmployeeBase[] employees = {
                new Manager(70000, 15000),
                new Developer(60000, 10, 50)
        };

        for (EmployeeBase e : employees) {
            System.out.println("Salary: " + e.calculateSalary());
        }
    }
}
