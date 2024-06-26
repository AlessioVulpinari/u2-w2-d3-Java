package alessiovulpinari.u2_w2_d3_Java.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "posts_del_blog")
public class BlogPost {

    @Id
    @GeneratedValue
    @Column(name = "id_blog_post", nullable = false)
    private UUID blogPostId;

    @Column(name = "categoria", nullable = false)
    private String category;

    @Column(name = "titolo", nullable = false)
    private String title;

    @Column(nullable = false)
    private String cover;

    @Column(name = "contenuto", nullable = false)
    private String content;

    @Column(name = "minuti", nullable = false)
    private int times;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

}
