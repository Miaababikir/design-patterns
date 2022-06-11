package AbstractFactory.Form.Windows;

import AbstractFactory.Form.Component;

public class Checkbox implements Component {
    @Override
    public void show() {
        System.out.println("Checkbox");
    }
}
