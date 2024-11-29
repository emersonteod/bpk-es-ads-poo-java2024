
package Exercicio08;

public class ProfessorMain {
    public static void main(String[] args) {
        Professor professor = new Professor("teste", "Matemática", 3500.0);
        professor.dar_aula();
        professor.corrigir_prova();
    }
}
