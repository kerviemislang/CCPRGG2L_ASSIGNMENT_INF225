import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame{
    MainMenu(){
        
        // JLabel
        JLabel imageLabel = new JLabel();
        // Cat image downloaded from internet
        ImageIcon catImage = new ImageIcon("YPDa.gif");
        // Set image label to frame
        imageLabel.setIcon(catImage);

        // JButton
        JButton startButton = new JButton();
        startButton.setText("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 50));

        // Add event to start Button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        // Add label and image to frame
        this.add(imageLabel);
        this.add(startButton);

        // Frame Layout 
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Snake Game");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size 
        this.setSize(500, 500);
        // Puts frame in  the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        //Disable resize
        this.setResizable(false);
        // Set background Color
        this.getContentPane().setBackground(Color.BLACK);


    }
    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to Game Frame
            new ColorMenu();

            // Close Frame
            dispose();
        }

    }
}
