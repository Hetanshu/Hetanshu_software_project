package com.internship.repository;
        import com.internship.entity.Ingredient;
        import com.internship.entity.User;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface IIngredientRepository extends CrudRepository<Ingredient,Integer> {

    // Optional<User> findByIngredient(int ingredientId);

}