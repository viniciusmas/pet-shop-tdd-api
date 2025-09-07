package br.edu.infnet.petshoptddapi.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private LocalDateTime clienteDeste;

    private Boolean status;

    private List<Pet> pets = new ArrayList<>();

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("Cliente { %s Cliente Deste = %s, Status = %s }", super.toString(), clienteDeste.format(dateTimeFormatter), status ? "Ativo" : "Inativo");
    }

    public LocalDateTime getClienteDeste() {
        return clienteDeste;
    }

    public void setClienteDeste(LocalDateTime clienteDeste) {
        this.clienteDeste = clienteDeste;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
