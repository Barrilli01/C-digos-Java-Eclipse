/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import nota3.MenuCadastro;

public class MenuCadastroController {

    private MenuCadastro view;

    public MenuCadastroController(MenuCadastro view) {
        this.view = view;
    }

    public void salvaUsuario() {
        String nome = view.getTextFieldNome().getText();
        String email = view.getTextFieldEmail().getText();
        String cpf = view.getTextFieldCpf().getText();
        String senha = view.getTextFieldSenha().getText();
        String celular = view.getTextFieldCelular().getText();
        String veiculo = view.getTextFieldVeiculo().getText();
        String placa = view.getTextFieldPlaca().getText();
        String unidade = view.getTextFieldUnidade().getText();
        String bloco = view.getTextFieldBloco().getText();

        Usuario novoUsuario = new Usuario(nome, email, cpf, senha, celular, veiculo, placa, unidade, bloco);

        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(novoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso!");
          

        } catch (SQLException ex) {
            Logger.getLogger(MenuCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
