package test.nexos.NexosTest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.nexos.NexosTest.Model.Usuario;
import test.nexos.NexosTest.Repository.UsuarioRepo;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepo repo;

    public List<Usuario> findAll() {
        return (List<Usuario>) repo.findAll();
    }

}
