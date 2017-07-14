
import javax.swing.JFrame;


public class Main {
    
        public static void main(String[] args) {
        EmptyFrame frame = new EmptyFrame();
        frame.initialize();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
