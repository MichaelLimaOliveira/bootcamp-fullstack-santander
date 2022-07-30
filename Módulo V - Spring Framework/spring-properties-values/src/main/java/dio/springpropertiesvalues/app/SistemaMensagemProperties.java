package dio.springpropertiesvalues.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagemProperties implements CommandLineRunner {
    @Autowired
    Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada2 por: " + remetente.getName()
                + "\nE-mail:" + remetente.getEmail()
                + "\nCom telefones para contato: " + remetente.getPhones());

        System.out.println("Seu cadastro foi aprovado");
    }
}
