import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.security.PrivilegedAction;

public class Ventana {
    private JPanel principal;
    private JTextField txtDatoEntero;
    private JButton btnInsertar;
    private JTextField textField1;
    private JLabel Valortope;
    private JButton btnValorTope;
    private JTextArea txtLitadodeElemenos;
    private Pila coleccion=new Pila();
public Ventana(){

    btnInsertar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            coleccion.ingresarElementos(Integer.parseInt(txtDatoEntero.getText()));
            JOptionPane.showMessageDialog(null,"Dato ingrado a la pila ");
        }
    });
    Valortope.addComponentListener(new ComponentAdapter() {
    });
    txtLitadodeElemenos.addComponentListener(new ComponentAdapter() {
    });
}


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
