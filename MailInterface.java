package java_homework;

public interface MailInterface <T> {
    String getTo();
    String getFrom();
    T getContent();
}
