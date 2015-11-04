import javax.swing.*;
import java.awt.event.*;

public class Inicial extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonSair;
    private JRadioButton gerenteRadioButton;
    private JRadioButton colaboradorRadioButton;
    private JTextField IDTextField;
    private JPasswordField senhaPasswordField;
    private boolean usertype = true;

    public Inicial() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSair();
            }
        });

        gerenteRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onGerente();
            }
        });

        colaboradorRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onColaborador();
            }
        });

// call onSair() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onSair();
            }
        });

// call onSair() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSair();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onGerente(){
        IDTextField.setEditable(false);
        usertype = true;
    }

    private void onColaborador(){
        IDTextField.setEditable(true);
        usertype = false;
    }
    private void onOK() {
        if (usertype){
            ManagerWin janela = new ManagerWin();
            janela.pack();
            janela.setVisible(true);
        }
//        dispose();
    }

    private void onSair() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Inicial dialog = new Inicial();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
