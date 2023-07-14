package creational.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    private static final String MAC_OS = "mac";
    private static final String WINDOWS_OS = "windows";

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void convertingOsTest() throws IOException {
        System.setProperty("os.name", MAC_OS);
        Demo demo = new Demo();
        demo.main(new String[]{});
        assertEquals("create MacOS Button\n" +
                "You have created MacOSCheckbox.", outputStreamCaptor.toString()
                .trim());

        outputStreamCaptor.reset();
        System.setProperty("os.name", WINDOWS_OS);
        demo.main(new String[]{});
        assertEquals("create WindowsOS button\n" +
                "You have created WindowsOsCheckBox.", outputStreamCaptor.toString()
                .trim());
    }

}