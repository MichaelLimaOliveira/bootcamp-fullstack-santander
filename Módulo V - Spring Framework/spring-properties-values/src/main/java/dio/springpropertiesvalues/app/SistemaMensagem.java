package dio.springpropertiesvalues.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
   @Value("${nome:NoReply-DIO}")
    private String nome;
    @Value("${email:None}")
    private String email;
    @Value("${telefones:Null}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail:" + email
                + "\nCom telefones para contato: " + telefones);

        System.out.println("Seu cadastro foi aprovado");
    }
}
