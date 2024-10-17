import java.awt.*;
import java.awt.event.*;

public class TYBBACAFrame extends Frame {
    
    // Constructor to set up the Frame
    public TYBBACAFrame() {
        // Set the title of the Frame
        setTitle("TYBBACA");
        
        // Set the background color to red
        setBackground(Color.RED);

        // Set the size of the Frame
        setSize(400, 300);

        // Add a window listener to handle closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                // Close the Frame when the close button is clicked
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Create an instance of TYBBACAFrame
        TYBBACAFrame frame = new TYBBACAFrame();
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
