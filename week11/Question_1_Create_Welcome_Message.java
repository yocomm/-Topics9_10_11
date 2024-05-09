package week11;

public class Question_1_Create_Welcome_Message {
    public static void main(String[] args) {
        // You don't need to modify the main method.
        String name = stringInput("Enter your name:");
        String message = createWelcomeMessage(name);
        System.out.println(message);
    }
}
public static String createWelcomeMessage(String name) {

}

throw new RuntimeException("Remove this line and finish this method.");

@Test

public void testNoNameMessage() {
// Arrange
    String emptyString = "";

    String message = createWelcomeMessage(emptyString);
    String expectedMessage = “No name entered”;
    assertEquals(expectedMessage, message);
}

