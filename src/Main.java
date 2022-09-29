import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user1=new User("simon","simon20") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: raro");
            }
        };
    }
}
