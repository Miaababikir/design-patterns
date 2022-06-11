package AbstractFactory.Form.Factory;

import AbstractFactory.Form.Component;
import AbstractFactory.Form.Windows.Button;
import AbstractFactory.Form.Windows.Checkbox;
import AbstractFactory.Form.Windows.TextField;

public class WindowsFactory implements AbstractFactory{
    @Override
    public Component createButton() {
        return new Button();
    }

    @Override
    public Component createTextField() {
        return new TextField();
    }

    @Override
    public Component createCheckbox() {
        return new Checkbox();
    }
}
