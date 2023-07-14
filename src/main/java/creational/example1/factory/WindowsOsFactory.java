package creational.example1.factory;

import creational.example1.domain.Button;
import creational.example1.domain.CheckBox;
import creational.example1.domain.WindowsOsButton;
import creational.example1.domain.WindowsOsCheckBox;

public class WindowsOsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsOsCheckBox();
    }
}
