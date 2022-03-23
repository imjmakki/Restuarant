package app.restaurant.restauring.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="cat_id", nullable=false)
    private Category category;

    private String ordName;
    private Integer Price;
    private String Image;

    @Lob
    private String description;

    @Column(name = "create_at")
    @CreationTimestamp
    private Date ordCreate;

    @Column(name = "update_at")
    @UpdateTimestamp
    private Date ordUpdate;
}
