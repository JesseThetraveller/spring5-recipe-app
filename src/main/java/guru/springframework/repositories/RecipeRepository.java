package guru.springframework.repositories;

import guru.springframework.domain.Receipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository <Receipe, Long> {
}
