package org.example.datos;

import org.example.mdUsuario;

import java.util.ArrayList;
import java.util.List;

public class ClsDatosManager {


        public List<mdUsuario> cargarDatosTest(){
            mdUsuario usuario = new mdUsuario();
            List<mdUsuario> usuarios = new ArrayList<>();
            //crear datos de prueba
            usuario.setId(8212872661111L);
            usuario.setNombre("Juan Perez");
            usuarios.add(usuario);
            return usuarios;
            //
        }


        //buscar usuario por id
        public mdUsuario buscarUsuarioPorId(long id, List<mdUsuario> Usuarios) {
            return Usuarios.stream()
                    .filter(usuario -> usuario.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        public void actualizarUsuario(long id, String nuevoNombre, List<mdUsuario> Usuarios) {
            for (mdUsuario usuario : Usuarios) {
                if (usuario.getId() == id) {
                    usuario.setNombre(nuevoNombre);
                    break;
                }
            }
        }

        public void eliminarUsuarioPorId(long id, List<mdUsuario> Usuarios) {
            Usuarios.removeIf(usuario -> usuario.getId() == id);
        }

    }


