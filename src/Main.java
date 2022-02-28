import br.com.dio.desafio.dominio.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
        curso2.setTitulo("curso java POO");
        curso2.setDescricao("descricao curso java POO");
        curso2.setCargaHoraria(50);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

   /* System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Ja]va Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDanillo = new Dev();
        devDanillo.setNome("Danillo");
        devDanillo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Danillo" + devDanillo.getConteudosInscritos());
        devDanillo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Danillo" + devDanillo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Danillo" + devDanillo.getConteudosConcluidos());
        System.out.println("Xp" + devDanillo.calcularTotalXp());

        System.out.println("------");


        Dev devJose = new Dev();
        devJose.setNome("jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jose" + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Jose" + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jose" + devJose.getConteudosConcluidos());
        System.out.println("Xp" + devDanillo.calcularTotalXp());



    }
}
