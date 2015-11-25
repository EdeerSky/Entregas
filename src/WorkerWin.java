import javax.swing.*;
import java.awt.event.*;

public class WorkerWin extends JDialog {
    private JPanel contentPane;
//    private JButton buttonOK;
    private JButton sairButton;
    private JTextField motoristaIDTextField;
    private JButton solicitarManutençãoButton;
    private JComboBox veiculomanutComboBox;
    private JTextField códigoDaEntregaTextField;
    private JComboBox veiculodeliverComboBox;
    private JButton entregaRealizadaButton;
    private JButton confirmarSaídaButton;

    public WorkerWin(String workerID) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(sairButton);
        motoristaIDTextField.setText(workerID);

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSair();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onSair();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSair();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onSair() {
// add your code here if necessary
        dispose();
    }
}
