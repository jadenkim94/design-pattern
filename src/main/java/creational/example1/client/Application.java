package creational.example1.client;

import creational.example1.domain.Button;
import creational.example1.domain.CheckBox;
import creational.example1.factory.GuiFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }

}
