package atividades.metodos;

import java.time.Instant;
import java.util.Date;

public class VerificarPeriodoDoDia {

    public static String retornarFrasePeloHorario(int horas) {
        String returnTexto;
        if(horas <= 12){
            returnTexto = "Bom dia!";
        } else if (horas > 12 && horas <= 18) {
            returnTexto = "Boa Tarde!";
        }else {
            returnTexto = "Boa Noite!";
        }

        return returnTexto;
    }
}
