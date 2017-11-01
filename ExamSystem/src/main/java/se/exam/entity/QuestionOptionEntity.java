package se.exam.entity;//package se.exam.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "question_option")
//public class QuestionOptionEntity {
////    private int oid;
//    private QuestionEntity question;
//    private boolean isCorrect;
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    public int getOid() {
//        return oid;
//    }
//
//    public void setOid(int oid) {
//        this.oid = oid;
//    }
//
//    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//    @JoinColumn(name="qid")
//    public QuestionEntity getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(QuestionEntity question) {
//        this.question = question;
//    }
//
//    public boolean isCorrect() {
//        return isCorrect;
//    }
//
//    public void setCorrect(boolean correct) {
//        isCorrect = correct;
//    }
//}
