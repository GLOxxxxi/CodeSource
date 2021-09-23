package javaadvanced.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            User user = new User(i, "xx");
            list.add(user);
        }
        List<User> collect = list.parallelStream().filter(t -> t.getAge() <= 20).collect(Collectors.toList());
        System.out.println("stream：" + collect);
    }

}
class User {
    private Integer age;
    private String name;

    public User() {
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
