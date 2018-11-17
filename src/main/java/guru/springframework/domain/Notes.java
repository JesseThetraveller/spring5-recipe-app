package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Receipe receipe;

    @Lob
    private String receipeNotes;


    //Getter/Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Receipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Receipe receipe) {
        this.receipe = receipe;
    }

    public String getReceipeNotes() {
        return receipeNotes;
    }

    public void setReceipeNotes(String receipeNotes) {
        this.receipeNotes = receipeNotes;
    }
}
