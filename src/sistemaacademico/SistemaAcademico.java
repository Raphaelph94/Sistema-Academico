/*
 CLASSE PRINCIPAL
 */

package sistemaacademico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Raphael e Leonardo
 */
public class SistemaAcademico {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //Chama a tela Principal
         TelaPrincipal   telaAlluno = new   TelaPrincipal();           
         telaAlluno.setLocationRelativeTo(null); // Frame no centro 
         telaAlluno.setVisible(true); // Mostra o Frame
    
}
}
