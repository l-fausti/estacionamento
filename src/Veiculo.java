import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    public String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa != null && placa.length() == 7) {
            this.placa = placa;
        }
        else {
            throw new IllegalArgumentException("Placa inválida. Deve ter exatamente 7 caracteres.");
        }
    }
}

