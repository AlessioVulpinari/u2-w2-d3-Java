package alessiovulpinari.u2_w2_d3_Java.repositories;

import alessiovulpinari.u2_w2_d3_Java.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {

    Optional<Author> findByNameAndSurname(String name, String surname);
}
