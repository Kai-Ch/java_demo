package com.jd.jdk8.lambda;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class LambdaCar {

    @Test
    public void lam1Test() {
        Arrays.asList(1, 2, 3).forEach(e -> System.out.print(e));
        Arrays.asList("a", "b", "c").forEach((String e) -> System.out.print(e));
        Arrays.asList("a", "a", "c").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            System.out.println(result);
            return result;
        });
    }

    @Test
    public void carTest() {
        Car car1 = Car.create(Car::new);
        Car car2 = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car1, car2);
        cars.forEach(Car::collide);
        cars.forEach(Car::repair);

        final Car car3 = Car.create(Car::new);
        System.out.println("car3:" + car3);
        cars.forEach(car3::follow);
    }
}
