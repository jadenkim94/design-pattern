package creational.example1;

import creational.example1.client.Application;
import creational.example1.factory.GuiFactory;
import creational.example1.factory.MacOsFactory;
import creational.example1.factory.WindowsOsFactory;

public class Demo {

    private static Application configurerApplication() {
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.equals("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsOsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application application = configurerApplication();
        application.paint();
    }

}
