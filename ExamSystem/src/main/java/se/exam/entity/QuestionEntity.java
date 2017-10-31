package se.exam.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
public class QuestionEntity {
    private int qid;
    private String description;
    private Set<QuestionOptionEntity> options;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy="question_option",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    public Set<QuestionOptionEntity> getOptions() {
        return options;
    }

    public void setOptions(Set<QuestionOptionEntity> options) {
        this.options = options;
    }
}
