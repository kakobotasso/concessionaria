package br.com.fiap.concessionaria.controller;

import br.com.fiap.concessionaria.model.Carro;
import br.com.fiap.concessionaria.model.Fabricante;
import br.com.fiap.concessionaria.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carro")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public List<Carro> getAll(){
        return carroRepository.findAll();
    }

    @GetMapping("/{idfabricante}")
    public List<Carro> getByFabricante(@PathVariable(value = "idfabricante") int idFabricante){
        Fabricante f = new Fabricante();
        f.setId(idFabricante);
        return carroRepository.findByFabricante(f);
    }

    @PostMapping
    public void salvar(@RequestBody Carro carro){
        carroRepository.save(carro);
    }
}
