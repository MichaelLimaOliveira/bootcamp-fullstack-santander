package br.com.dio.collections.list.atividades2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<String>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        List<String> answers = List(questions);
        int cont = 0;

        for (int i = 0; i < answers.size(); i++) {
            String answer = answers.get(i);
            if(answer.equals("s")) {
                cont += 1;
            }
        }

        String verdict;
        switch (cont){
            case 0:
            case 1:
                verdict = "Inocente";
                break;
            case 2:
                verdict = "Suspeita";
                break;
            case 3:
            case 4:
                verdict = "Cúmplice";
                break;
            case 5:
                verdict = "Assasina";
                break;
            default:
                verdict = "Algo de muito errado aconteceu pra vc chegar aki por favor volte a estudar";
                break;
        }

        System.out.println(verdict);

    }

    public static List<String> List(List<String> questions) {
        List<String> answers = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String aux = "";
        for (int i = 0; i < questions.size(); i++){
            System.out.println(questions.get(i));
            aux = scan.next();
            answers.add(aux);
        }
        return answers;
    }
}