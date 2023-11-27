/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControleDados;

import Banco.Querys.Querys;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CtrlUsuario {
    
    Querys _Querys = new Querys();
    
    public boolean RealizaLogin(String login, String senha){
        String sql = _Querys.SelectLogin();
        boolean resultado = false;
        
        try (Connection c =  conection.ModuloConexao.conector()) {
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, login); 
            ps.setString(2, senha); 
            
            ResultSet rs = ps.executeQuery();  
            
            while (rs.next()) {
                resultado = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            
            JOptionPane.showMessageDialog(null,"Erro ao tentar executar o banco de dados" ,"ERRO INTERNO", JOptionPane.ERROR_MESSAGE );
        }
        return resultado;
    } 
}
