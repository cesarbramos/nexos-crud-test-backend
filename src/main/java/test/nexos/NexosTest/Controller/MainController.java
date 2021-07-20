package test.nexos.NexosTest.Controller;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.nexos.NexosTest.Model.Cargo;
import test.nexos.NexosTest.Model.Mercancia;
import test.nexos.NexosTest.Model.Usuario;
import test.nexos.NexosTest.Service.CargoService;
import test.nexos.NexosTest.Service.MercanciaService;
import test.nexos.NexosTest.Service.UsuarioService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class MainController {

    @Autowired
    CargoService cargoService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    MercanciaService mercanciaService;

    @GetMapping("/get-mercancias")
    ResponseEntity<?> getMercancias() {
        Map<String, Object> response = new HashMap<>();
        List<Mercancia> mercancias = mercanciaService.findAll();
        response.put("mercancias", mercancias);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/get-usuarios")
    ResponseEntity<?> getUsuarios() {

        Map<String, Object> response = new HashMap<>();
        List<Usuario> usuarios = usuarioService.findAll();
        response.put("usuarios", usuarios);

        return ResponseEntity.ok(response);
    }

}
