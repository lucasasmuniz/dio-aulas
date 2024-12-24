import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(30);
        curso1.setTitulo("Curso Java DIO");
        curso1.setDescricao("Curso Java DIO Descrição");

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(40);
        curso2.setTitulo("Curso Js DIO");
        curso2.setDescricao("Curso Js DIO Descrição");

        System.out.println(curso1);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria Java DIO Descrição");
        mentoria1.setTitulo("Mentoria Java DIO");

        System.out.println(mentoria1);

    }
}
