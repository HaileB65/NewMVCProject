package Capstone.Project.VacationFinder.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "checklists")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Checklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String item1;
    String item2;
    String item3;


    @Column(name = "timestamp")
    @CreationTimestamp
    private Timestamp timestamp;

    public <T> Checklist(List<T> asList) {
    }
}
