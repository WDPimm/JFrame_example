import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Theater seat search");
        final JTextField input = new JTextField();
        JLabel response = new JLabel();
        input.setBounds(50, 50, 50, 20);
        JButton button = new JButton("Check seat and reserve");
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, input);
        frame.getContentPane().add(BorderLayout.CENTER, response);
        frame.setSize(200, 200);
        frame.setVisible(true);

        Theater theater = new Theater("Micon", 8, 12);
        theater.getSeats();

        button.addActionListener(ae -> {
            String getValue = input.getText();
            if (theater.reserveSeat(getValue)) {
                response.setText("Please pay");
            } else {
                response.setText("This seat is already taken or doesn't exist");
            }
        });


    }
}
