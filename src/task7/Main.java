package task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person smith = new Person("Oliver", "Smith");
        Person jones = new Person("Jack", "Jones");
        Person harry = new Person("Harry", "Williams");
        Person jacob = new Person("Jacob", "Brown");

        Car skoda1 = new Car("WA0001", Car.Brand.SKODA);
        Car skoda2 = new Car("SC36010", Car.Brand.SKODA);
        Car mazda1 = new Car("WA01234", Car.Brand.MAZDA);
        Car mazda2 = new Car("DW01ASD", Car.Brand.MAZDA);
        Car bmw = new Car("WA12690", Car.Brand.BMW);
        Car volvo = new Car("KR60606", Car.Brand.VOLVO);

        Map<Person, List<Car>> carMap = new LinkedHashMap<>();
        carMap.put(smith, new LinkedList<>());
        carMap.put(jones, new LinkedList<>());
        carMap.put(harry, new LinkedList<>());
        carMap.put(jacob, new LinkedList<>());

        carMap.get(smith).add(skoda1);
        carMap.get(smith).add(bmw);

        carMap.get(jones).add(mazda2);

        carMap.get(harry).add(volvo);
        carMap.get(harry).add(mazda1);
        carMap.get(harry).add(skoda2);

        for(Map.Entry<Person, List<Car>> entry : carMap.entrySet()){
            if(entry.getValue().size() == 0)
                System.out.println(entry.getKey() + " -> [No cars]");
            else
                System.out.println(entry.getKey() + " -> " + entry.getValue().
                    toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.println();

        //new
        System.out.println("Cars whose registration numbers begin with WA:");
        for(List<Car> cars : carMap.values()){
            for(Car car : cars){
                if(car.getRegNumber().startsWith("WA")){
                    System.out.println(car);
                }
            }
        }
        System.out.println();

        //new
        for(Map.Entry<Person, List<Car>> entry : carMap.entrySet()){
            if(entry.getValue().size() != 0)
                System.out.println(entry.getKey() + " owns " + entry.getValue().size() + " cars");
        }
        System.out.println();

        //new
        System.out.println(carMap.get(jones).get(0));
    }
}
