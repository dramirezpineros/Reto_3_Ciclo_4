package com.cuatroa.retotres.repository.crud;
import com.cuatroa.retotres.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface OrderCrudRepository extends MongoRepository<Order, Integer> 
{
   
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country); 
    
    @Query("{status: ?0}")
   
    List<Order> findByStatus(final String status);
    
    Optional<Order> findTopByOrderByIdDesc();
    
    List<Order> findBySalesManZone(String zone);
    
}

