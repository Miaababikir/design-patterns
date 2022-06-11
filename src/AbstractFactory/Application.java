package AbstractFactory;

import AbstractFactory.Form.Component;
import AbstractFactory.Form.Factory.AbstractFactory;
import AbstractFactory.Form.Windows.Button;
import AbstractFactory.Form.Windows.Checkbox;
import AbstractFactory.Form.Windows.TextField;

public class Application {

    public void run(AbstractFactory factory) {
        Component button = factory.createButton();
        Component textField = factory.createTextField();
        Component checkbox = factory.createCheckbox();

        button.show();
        textField.show();
        checkbox.show();
    }

}
