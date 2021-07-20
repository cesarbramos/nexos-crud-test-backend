package test.nexos.NexosTest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.nexos.NexosTest.Model.Mercancia;
import test.nexos.NexosTest.Repository.MercanciaRepo;

import java.util.List;

@Service
public class MercanciaService {

    @Autowired
    MercanciaRepo repo;

    public List<Mercancia> findAll() {
        return (List<Mercancia>) repo.findAll();
    }

}
