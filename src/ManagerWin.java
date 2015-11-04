import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Drayton on 28/10/2015.
 */
public class ManagerWin extends JDialog {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JButton sairButton;

    public ManagerWin(){
        setContentPane(panel1);
        setModal(true);
        getRootPane().setDefaultButton(sairButton);

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {onSair();}
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onSair();
            }
        });

        panel1.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSair();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    }private void onSair() {
        dispose();
    }

}
