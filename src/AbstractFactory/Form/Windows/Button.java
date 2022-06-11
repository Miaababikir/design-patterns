package AbstractFactory.Form.Windows;

import AbstractFactory.Form.Component;

public class Button implements Component {
    @Override
    public void show() {
        System.out.println("Button");
    }
}
