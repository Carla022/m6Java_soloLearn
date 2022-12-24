
public class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        //set priority
        name.setPriority(1);


        Welcome welcome = new Welcome();
        //set priority
        welcome.setPriority(2);

        welcome.start();
        name.start();
    }

}

