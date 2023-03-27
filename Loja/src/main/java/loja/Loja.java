package loja;

import loja.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario user){
        if (verificarUsuarioExistente(user.getEmail()))
            usuarios.add(user);
    }

    public boolean verificarUsuarioExistente(String email){
        for (Usuario user: usuarios){
            if(user.getEmail().equals(email))
                return false;
        }
        return true;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
