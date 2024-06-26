package alessiovulpinari.u2_w2_d3_Java.repositories;

import alessiovulpinari.u2_w2_d3_Java.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, UUID> {
}
