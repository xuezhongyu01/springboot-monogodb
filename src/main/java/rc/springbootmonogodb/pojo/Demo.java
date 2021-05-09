package rc.springbootmonogodb.pojo;

import org.springframework.data.annotation.Id;

public class Demo {
    @Id
    private String id;
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
