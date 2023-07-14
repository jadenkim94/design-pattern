package creational.example1.factory;

import creational.example1.domain.Button;
import creational.example1.domain.CheckBox;

public interface GuiFactory {
    Button createButton();
    CheckBox createCheckBox();

}
