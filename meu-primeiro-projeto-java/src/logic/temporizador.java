// Classe Temporizador.java
package logic;
import javax.swing.*;

public class Temporizador {
    private JLabel label;
    private Timer timer;
    private int segundos = 60; // Defina o tempo inicial aqui

    public Temporizador(JLabel label) {
        this.label = label;
    }

    public void iniciar() {
        if (timer == null) {
            timer = new Timer(1000, e -> {
                if (segundos > 0) {
                    segundos--;
                    label.setText("Temporizador: " + formatarTempo(segundos));
                } else {
                    timer.stop();
                    label.setText("Temporizador: FIM!");
                }
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