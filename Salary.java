package java_homework;

class Salary implements MailInterface<Integer> {
    private final String from;
    private final String to;
    private final int salary;
    public Salary(String from,String to,int salary){
        this.from = from;
        this.to = to;
        this.salary = salary;
    }
    public String getFrom(){return from;}
    public String getTo(){return to;}
    public Integer getContent(){return salary;}
}
