package code._4_student_effort.challenge4;

public interface ObservedSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObserver(String message);
}
