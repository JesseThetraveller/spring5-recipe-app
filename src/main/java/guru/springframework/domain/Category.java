package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String categoryName;

    @ManyToMany (mappedBy = "categories")
    private Set<Receipe> receipes;

    //Getter/Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Receipe> getReceipes() {
        return receipes;
    }

    public void setReceipes(Set<Receipe> receipes) {
        this.receipes = receipes;
    }
}
