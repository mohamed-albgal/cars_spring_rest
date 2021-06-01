package dev.malb.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {
    //Use existing fields to only get them, turned into a sql search for you

    List<Car> findByBrand(@Param("brand") String brand);
    List<Car> findByBrandOrderByYearAsc(@Param("brand") String brand);

}
