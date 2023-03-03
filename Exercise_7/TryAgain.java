import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame{
    TryAgain(){

            JButton tryAgainButton = new JButton();
            JButton exitButton = new JButton();

            tryAgainButton.setText("Play Again");
            tryAgainButton.setFont(new Font("Arial", Font.BOLD, 50));
            EventHandler handler = new EventHandler();
            tryAgainButton.addActionListener(handler);

            exitButton.setText("Exit");
            exitButton.setFont(new Font("Arial", Font.BOLD, 50));
            ExitHandler Exit = new ExitHandler();
            exitButton.addActionListener(Exit);

            this.add(tryAgainButton);
            this.add(exitButton);

            // Add label and image to frame
            this.add(tryAgainButton);
            this.add(exitButton);

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
            new MainMenu();

            // Close Frame
            dispose();
        }
}
private class ExitHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){
        
        // Close Frame
        dispose();
    }
}
}
