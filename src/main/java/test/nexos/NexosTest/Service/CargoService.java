package test.nexos.NexosTest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.nexos.NexosTest.Model.Cargo;
import test.nexos.NexosTest.Repository.CargoRepository;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    CargoRepository repo;

    public List<Cargo> findAll() {
        return (List<Cargo>) repo.findAll();
    }

}
