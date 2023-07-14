package creational.example1.factory;

import creational.example1.domain.Button;
import creational.example1.domain.CheckBox;
import creational.example1.domain.MacOsButton;
import creational.example1.domain.MacOsCheckBox;

public class MacOsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
