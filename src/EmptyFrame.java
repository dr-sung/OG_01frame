
import javax.swing.JFrame;


public class EmptyFrame extends JFrame {
    
    public EmptyFrame() {
        
    }
    
    public void initialize() {
        setTitle("Frame Test");
        setSize(300, 300); // width height in pixels
        setLocation(100, 100); // origin: upper-left corner of screen
    }
}
