import javax.swing.*;

public class HelloJava2 {
    public static void main( String[] args ) {
        // System.out.println("Hello Averie");

        JFrame frame = new JFrame("Hello, Averie");
        JLabel label = new JLabel("Hello, Averie Paschall", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300,300);
        frame.setVisible( true );

    }
}
