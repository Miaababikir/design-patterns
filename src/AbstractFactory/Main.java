package AbstractFactory;

import AbstractFactory.Form.Factory.AbstractFactory;
import AbstractFactory.Form.Factory.MacFactory;
import AbstractFactory.Form.Factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();

        String os = "MAC";

        AbstractFactory factory = null;

        if (os.equals("MAC")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }


        application.run(factory);
    }
}
