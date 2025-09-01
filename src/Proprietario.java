import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proprietario {
    public String nome;
    public int tentativas = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if((!contemNumeros(nome))) {
            this.nome = nome;
        }
        else{
            System.out.println("Erro: Na resposta não pode conter números.");
        }
    }

    public boolean contemNumeros(String texto) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(texto);
        return matcher.find();
    }
}
