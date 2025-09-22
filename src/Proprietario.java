import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Proprietario {
            public ArrayList<String> donos = new ArrayList<String>();
        public String nome;
        public int tentativas = 0;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            if (!contemNumeros(nome)) { // 1. valida números
                if (donos.size() < 10) { // 2. valida limite
                    if (existeNome(donos,nome)) { // 3. valida duplicado
                        this.nome = nome;
                        donos.add(nome);
                        System.out.println("Nome cadastrado com sucesso!");
                    } else {
                        System.out.println("Esse nome já está cadastrado!");
                    }
                } else {
                    System.out.println("Limite de 10 nomes atingido!");
                }
            } else {
                System.out.println("Erro: Na resposta não pode conter números.");
            }
        }

        public boolean contemNumeros(String texto) {
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(texto);
            return matcher.find();
        }

        public boolean existeNome(List<String> donos, String nome) {
            for (String d : donos) {
                if (d.equalsIgnoreCase(nome)) {
                    return true;
                }
            }
            return false;
        }

    }
