package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos{

    private LocalDate data;



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return 0;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + data +
                '}';
    }

}
