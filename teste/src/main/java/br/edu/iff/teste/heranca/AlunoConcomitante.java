package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    
    public boolean podeSolicitarDiploma() {
        if (super.podeSolicitarDiploma() && apresentouCertificadoEM) {
            return true;
        } else {
            return false;
        }
    }

}
