/**
 * 
 */
package com.cuatroa.retotres.repository.crud;
/**
 * 
 */
import com.cuatroa.retotres.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
/**
 *
 *  @author Ernesto Trompa 
 *  G18 MINTIC
 * 
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> 
{
    /**
     * 
     * @param email
     * @return
     */
    Optional<User> findByEmail(String email);
    /**
     * 
     * @param email
     * @param password
     * @return
     */
    Optional<User> findByEmailAndPassword(String email, String password);
    /**
     * 
     * @return
     */
    Optional<User> findTopByOrderByIdDesc();

    List<User> findByMonthBirthtDay(String monthBirthtDay);
   
    
}
