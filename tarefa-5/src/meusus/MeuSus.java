package meusus;

public class MeuSus {
    public static void main(String[] args) {
        Paciente psc = new Paciente("Ana", "Feminino", "ana@gmail.com", "21/03/1996");
        psc.status();
        
        Agendamento agen = new Agendamento("Hospital Regional", "20/11/2021", "11:00", "Doutora Juliana");
        agen.status();
        
        Detalhes_Agendamento detAgen = new Detalhes_Agendamento("verificar se tem consulta", "");
        detAgen.status();
    }
}

/**
 * Alunos:
 * 
 * Glauber Felipe Costa Silva RA: 12110440
 * 
 * Michelle Mendes de Carvalho RA: 10820489
 * 
 * Rafael Soares Miranda Oliveira RA: 12108150
 * 
 */