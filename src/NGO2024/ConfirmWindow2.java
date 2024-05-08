/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NGO2024;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfirmWindow2 extends JDialog {

    private boolean confirm;

    public ConfirmWindow2(JFrame parent) {
        super(parent, true); // Set the dialog as modal
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        JButton confirmButton = new JButton("Confirm");
        JButton cancelButton = new JButton("Cancel");
        JLabel label = new JLabel("Commit changes?");
        
        confirmButton.addActionListener(evt -> {
            confirm = true;
            dispose(); // Close the dialog
        });

        cancelButton.addActionListener(evt -> {
            confirm = false;
            dispose(); // Close the dialog
        });

        panel.add(label);
        panel.add(confirmButton);
        panel.add(cancelButton);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null); // Center the dialog
    }

    public boolean isConfirmed() {
        return confirm;
    }

public class Main {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Main Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create an instance of ConfirmWindow and set it visible
        ConfirmWindow2 confirmWindow2 = new ConfirmWindow2(frame);
        confirmWindow2.setVisible(true);

        // Once ConfirmWindow is closed, check if the user confirmed
        boolean confirmed = confirmWindow2.isConfirmed();
        if (confirmed) {
            System.out.println("User confirmed!");
        } else {
            System.out.println("User canceled!");
        }
    }
}

}
