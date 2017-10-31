package se.exam.config;

public enum UserType {
    STUDENT(1), TEACHER(2), ADMIN(3);
    private int value;

    private UserType(int value){
        this.value = value;
    }
}
