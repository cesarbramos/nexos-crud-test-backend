package test.nexos.NexosTest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.nexos.NexosTest.Model.Usuario;

@Repository
public interface UsuarioRepo extends CrudRepository<Usuario, Long> {
}
