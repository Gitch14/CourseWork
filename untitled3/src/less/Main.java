package less;

import java.util.ArrayList;
import java.util.Scanner;



class Client {
    public static void AddList(User user) {
        list.add(user);
    }

    static class User {
        public String name;
        public String age;
        public String mail;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", mail='" + mail + '\'' +
                    '}';
        }

        public User(String name, String age, String mail) {
            this.name = name;
            this.age = age;
            this.mail = mail;
        }
    }


    static ArrayList<Object> list = new ArrayList<>();

    public void AddList(String name, String age, String mail) {
        list.add(new User(name, age, mail));
    }

    @Override
    public String toString()
    {
        return String.valueOf(list);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Give info plz");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String mail = scanner.nextLine();

        Client.AddList(new Client.User(name,age,mail));

        for(Object s : Client.list) {
            System.out.println(s);
        }
//first version

    }

}
