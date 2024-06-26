package alessiovulpinari.u2_w2_d3_Java.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlogPostPayload {

    private String category;
    private String title;
    private String content;
    private String cover;
    private int times;
    private UUID authorId;
}
