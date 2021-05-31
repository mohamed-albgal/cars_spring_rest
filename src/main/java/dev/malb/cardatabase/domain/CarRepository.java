package dev.malb.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    //Use existing fields to only get them, turned into a sql search for you

//    List<Car> findByBrand(String brand);
//    List<Car> findByColorAndYear(String color, int year);
//    List<Car> findByBrandAndModel(String brand, String model);
//    List<Car> findByBrandOrderByYearAsc(String brand);

}
