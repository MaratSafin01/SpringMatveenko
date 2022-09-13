package repo;

import java.util.Optional;

public interface CrudRepository <K, E>{

    Optional<E> findById(int id);

    void delete(E entity);
}
