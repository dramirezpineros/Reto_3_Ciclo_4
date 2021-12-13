package com.cuatroa.retotres.repository;
import java.util.List;
import java.util.Optional;
import com.cuatroa.retotres.model.Chocolate;
import com.cuatroa.retotres.repository.crud.ChocolateCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ChocolateRepository
{
   
    @Autowired
    private ChocolateCrudRepository repository;
    public List<Chocolate> getAll() 
    {
        return repository.findAll();
    }
  
    public Optional<Chocolate> getClothe(String reference) 
    {
        return repository.findById(reference);
    }

    public Chocolate create(Chocolate clothe) 
    {
        return repository.save(clothe);
    }
    
    public void update(Chocolate clothe) 
    {
        repository.save(clothe);
    }
   
    public void delete(Chocolate clothe) 
    {
        repository.delete(clothe);
    }
    
}
