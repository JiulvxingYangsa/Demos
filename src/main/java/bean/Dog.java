package bean;

public class Dog {
    private String d_name;
    private Integer age;

    public Dog() {
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog(String d_name, Integer age) {
        this.d_name = d_name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "d_name='" + d_name + '\'' +
                ", age=" + age +
                '}';
    }
}
