package AbstractFactory.Form.Factory;

import AbstractFactory.Form.Component;
import AbstractFactory.Form.Mac.ButtonMac;
import AbstractFactory.Form.Mac.CheckboxMac;
import AbstractFactory.Form.Mac.TextFieldMac;

public class MacFactory implements AbstractFactory{
    @Override
    public Component createButton() {
        return new ButtonMac();
    }

    @Override
    public Component createTextField() {
        return new TextFieldMac();
    }

    @Override
    public Component createCheckbox() {
        return new CheckboxMac();
    }
}
