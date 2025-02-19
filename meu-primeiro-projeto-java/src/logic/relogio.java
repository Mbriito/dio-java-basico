//Classe Relogio.java
package logic;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Relogio {
    private JLabel label;
    private Timer timer;

    public Relogio(JLabel label) {
        this.label = label;
        iniciar();
    }

    private void iniciar() {
        timer = new Timer(1000, e -> {
            String horaAtual = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            label.setText("Relógio: " + horaAtual);
        });
        timer.start();
    }
}
