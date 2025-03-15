import java.util.ArrayList;

public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nomeCurso) {
        Curso cursoProcurado = null;

        for (Curso curso: this.cursos) {
            if (curso.nome.equalsIgnoreCase(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }
}
