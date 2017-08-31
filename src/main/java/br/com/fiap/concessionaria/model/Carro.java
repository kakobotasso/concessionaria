package br.com.fiap.concessionaria.model;

import javax.persistence.*;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String modelo;
    private String ano;
    @ManyToOne(targetEntity = Fabricante.class)
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
