package many_to_many_bi_controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import many_to_many_bi_dao.CarDao;
import many_to_many_bi_dto.Car;
import many_to_many_bi_dto.Features;

public class CarController {

public static void main(String[] args) {
// TODO Auto-generated method stub
CarDao dao=new CarDao();
Car car1=new Car();
Car car2=new Car();
Features feature1=new Features();
Features feature2=new Features();

car1.setCarName("tesla");
car1.setCarPrice(500000);
car2.setCarName("bolero");
car2.setCarPrice(800000);

List<Car> cars=Arrays.asList(car1,car2);
feature1.setFeatureName("automatic drive");
feature2.setFeatureName("wifi");

List<Features> features=Arrays.asList(feature1,feature2);
car1.setFeatures(features);
car2.setFeatures(features);

dao.saveCar(cars, features);





}

}