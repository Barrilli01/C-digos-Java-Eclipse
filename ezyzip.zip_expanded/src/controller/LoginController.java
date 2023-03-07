package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

import nota3.Login;
import nota3.MenuCadastro;
import nota3.MenuUsuario;

public class LoginController {

    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {

        String nome = view.getTextFieldNome().getText();
        String senha = view.getjPasswordFieldSenha().getText();

        Usuario usuarioAutenticar = new Usuario(nome, senha, nome, senha, senha, senha, senha, nome, nome);

        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

        boolean existe = usuarioDao.existeNoBancoPorNomeESenha(usuarioAutenticar);
        if (existe) {

            MenuUsuario menuUsuario = new MenuUsuario();
            menuUsuario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos!    ");
        }
    }

}
