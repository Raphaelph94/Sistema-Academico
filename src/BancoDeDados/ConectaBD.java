/*
CLASSE USADA PARA SE CONECTAR AO BANCO DE DADOS
 */

package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author  Raphael e Leonardo
 */
public class ConectaBD {
    
    public Statement stm;//prepara e realiza pesquisas no BD
    public ResultSet rs;//armazena o resultado de uma pesquisa passada para o statement 
    private String driver = "com.mysql.jdbc.Driver";//responsavel por identificar o serviço de BD
    private String caminho = "jdbc:mysql://localhost:3306/ControleAcademico";
    private String usuario = "root";
    private String senha = null;
    public Connection conn; //realiza a conexao
    
    public void conexao(){//metodo que realiza a conexao
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn=DriverManager.getConnection(caminho,usuario,senha);
           // JOptionPane.showMessageDialog(null,"A conexão com o Banco de Dados obteve sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro de conexão com o Banco de Dados! \n"+ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs=stm.executeQuery(sql);
        } catch (SQLException ex) {
            
        }
        
    }
    
    public void desconeta(){
        try{
            conn.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao fechar a conexao! \n"+ex.getMessage());
        }
    }
}
