import javax.swing.*;

public class HelloJava2 {
    public static void main( String[] args ) {
        // System.out.println("Hello Averie");

        JFrame frame = new JFrame("Hello, Averie Tutti");
        frame.add( new HelloComponent() );

        frame.setSize(300,300);
        frame.setVisible( true );
/*
        JFrame frame2 = new JFrame("Hello, Logan Tutti");
        JLabel label2= new JLabel("Hello, Logan Paschall", JLabel.CENTER);
        frame2.add(label2);
        frame2.setSize(300,300);
        frame2.setVisible( true );
*/

    }
}
