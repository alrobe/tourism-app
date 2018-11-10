package edu.umss.fcyt.tourismapp.circuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@RestController
public class CircuitController {
    @Autowired
    private CircuitService circuitService;

    @GetMapping("/circuitos")
    public List<Circuit> index() {
        return circuitService.getAll();
    }

    @RequestMapping("/circuito/{id}")
    @ResponseBody
    public Optional<Circuit> solo(
        @PathVariable("id") long id) {
            return circuitService.get(id);
        }
    
}
