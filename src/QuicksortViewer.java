import javax.swing.*;
import java.awt.*;
public class QuicksortViewer {
    public static void main(String[] args){

        //Creating a basic frame in order to display the animation
        JFrame frame = new JFrame("Quicksort Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(new GridBagLayout());

        //Creating the animation component and setting a size so it can be inputted within the container
        QuicksortComponent component = new QuicksortComponent();
        component.setPreferredSize(new Dimension(600, 400));

        //Creating a white container to display the animation so it can be added to the frame
        JPanel container = new JPanel();
        container.setBackground(Color.WHITE);
        container.setLayout(new GridBagLayout());
        container.setPreferredSize(new Dimension(620, 420));
        container.add(component);

        //Adding the container to the center of the frame
        frame.add(container);

        frame.setVisible(true);
        component.startAnimation();
    }
}
