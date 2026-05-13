/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author carlo
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String clave = JOptionPane.showInputDialog(null,
                "Digite la clave: ",
                "Agencia de Viajes",
                JOptionPane.QUESTION_MESSAGE);

        if ("Ana".equals(clave)) {
            AgenciaViajes ventana = new AgenciaViajes();
            ventana.setVisible(true);
        } else if (clave != null) {
            JOptionPane.showMessageDialog(null,
                    "Clave incorrecta",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
