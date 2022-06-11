package AbstractFactory.Form.Factory;

import AbstractFactory.Form.Component;

public interface AbstractFactory {

    public Component createButton();
    public Component createTextField();
    public Component createCheckbox();

}
