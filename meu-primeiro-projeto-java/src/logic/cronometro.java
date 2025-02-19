package logic;
import javax.swing.*;

public class Cronometro {
    private JLabel label;
    private Timer timer;
    private int segundos = 0;

    public Cronometro(JLabel label) {
        this.label = label;
    }

    public void iniciar() {
        if (timer == null) {
            timer = new Timer(1000, e -> {
                segundos++;
                label.setText("Cronômetro: " + formatarTempo(segundos));
            });
        }
        timer.start();
    }

    public void pausar() {
        if (timer != null) {
            timer.stop();
        }
    }

    private String formatarTempo(int segundos) {
        int minutos = segundos / 60;
        int seg = segundos % 60;
        return String.format("%02d:%02d", minutos, seg);
    }
}