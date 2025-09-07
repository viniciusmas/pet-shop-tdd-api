package br.edu.infnet.petshoptddapi.domain;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

    private String cargo;

    private BigDecimal salario;

    private BigDecimal bonus;

    @Override
    public String toString() {
        return String.format("Funcionario { %s Cargo = %s, Salário = %.2f, Bônus = %.2f }", super.toString(), cargo, salario, bonus);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
