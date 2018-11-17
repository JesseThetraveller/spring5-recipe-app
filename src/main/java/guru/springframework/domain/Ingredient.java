package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Receipe receipe;

    @OneToOne (fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    //Getter/Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Receipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Receipe receipe) {
        this.receipe = receipe;
    }
}
