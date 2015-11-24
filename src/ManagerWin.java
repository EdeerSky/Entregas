import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Drayton on 28/10/2015.
 */
public class ManagerWin extends JDialog {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JButton sairButton;
    private JTextField nomeTextField;
    private JButton limparButton;
    private JButton buscarButton;
    private JButton cadastrarButton;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;
    private JFormattedTextField CPFFormattedTextField;
    private JFormattedTextField RGFormattedTextField;
    private JTextField UIDTextField;
    private JTextField endereçoTextField;
    private JFormattedTextField formattedTextField1;
    private JComboBox tipoComboBox;
    private JComboBox veículoComboBox;
    private JComboBox motoristaComboBox;
    private JTextField clienteTextField;
    private JFormattedTextField saídaFormattedTextField;
    private JTextField assigncódigoTextField;
    private JFormattedTextField formattedTextField2;
    private JButton limparButton1;
    private JButton agendarButton;
    private JButton confirmarButton;
    private JTextField cancelcódigoTextField;
    private JButton verificarButton;
    private JTextField verifycódigoTextField;

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
