
package boletin_18;

import Boletin_18_2.Persoal;

/**
 *
 * @author ifernandezblanco
 */
public class Academica {
    private static int numReferencia2 = 2017;
    private int numReferencia;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academica() {
        numReferencia2++;
        numReferencia = numReferencia2;
    }

    public Academica(String nome, int nota, Persoal alumno) {
        numReferencia2++;
        numReferencia = numReferencia2;
        this.nome = nome;
        this.nota = Nota(nota);
        this.alumno = alumno;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = Nota(nota);
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Datos alumno: " + "numReferencia=" + numReferencia + ", nome=" + nome + ", nota=" + nota + ", " + alumno.toString();
    }
    
    private int Nota(int nota){
        if(nota < 1 || nota > 10){
            System.out.println("Nota inválida");
            return 0;
        }
        else{
            return nota;
        }
    }
    
}