import br.com.dio.desafio.dominio.Conteudos;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso 1");
        curso1.setDescricao("Descrição curso1");
        curso1.setCargaHoraria(8);

        Conteudos conteudos = new Curso();
        Conteudos conteudos1 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Descrição mentoria 1");
        mentoria1.setData(LocalDate.now());
    }
}
