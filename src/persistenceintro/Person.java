package persistenceintro; 
public class Person {
 
    private String name;
    private int age;
    private String pid;
    private String city;

    public String getCity() { return city; }

    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public String getPid() {
        return pid;
    }

    public void setCity(String city) { this.city = city; }

    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setPid(String pid) {
        this.pid = pid;
    }

    public Person(String name, int age, String pid, String city) {
        this.name = name;
        this.age = age;
        this.pid = pid;
        this.city = city;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return this.getName() + ";" + this.getAge()+";"+this.getPid()+";"+this.getCity();
    }
}