/**
 * 
 */
package com.cuatroa.retotres.repository.crud;
/**
 * 
 */
import com.cuatroa.retotres.model.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;
/**
 *
 *  @author Ernesto Trompa 
 *  G18 MINTIC
 * 
 */
public interface ChocolateCrudRepository extends MongoRepository<Chocolate, String> 
{
    public List<Chocolate> findByPriceLessThanEqual(double precio);
    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Chocolate> findByDescriptionLike(String description);
}
