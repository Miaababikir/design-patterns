package AbstractFactory.Form.Windows;

import AbstractFactory.Form.Component;

public class TextField implements Component {
    @Override
    public void show() {
        System.out.println("Text Field");
    }
}
