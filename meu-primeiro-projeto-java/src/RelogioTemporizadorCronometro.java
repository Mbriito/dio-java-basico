//*package ui;

import logic.Temporizador;
import logic.Cronometro;
import logic.Relogio;

import javax.swing.*;
import java.awt.*;

public class RelogioTemporizadorCronometro extends JFrame {
    private JLabel relogioLabel, cronometroLabel, temporizadorLabel;
    private JButton iniciarCronometroButton, pausarCronometroButton, iniciarTemporizadorButton, pausarTemporizadorButton;
    private Relogio relogio;
    private Cronometro cronometro;
    private Temporizador temporizador;

    public RelogioTemporizadorCronometro() {
        setTitle("Relógio, Temporizador e Cronômetro");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));
        
        relogioLabel = new JLabel("Relógio: ", SwingConstants.CENTER);
        cronometroLabel = new JLabel("Cronômetro: 00:00", SwingConstants.CENTER);
        temporizadorLabel = new JLabel("Temporizador: 01:00", SwingConstants.CENTER);
        
        iniciarCronometroButton = new JButton("Iniciar Cronômetro");
        pausarCronometroButton = new JButton("Pausar Cronômetro");
        iniciarTemporizadorButton = new JButton("Iniciar Temporizador");
        pausarTemporizadorButton = new JButton("Pausar Temporizador");
        
        JPanel cronometroPanel = new JPanel();
        cronometroPanel.add(iniciarCronometroButton);
        cronometroPanel.add(pausarCronometroButton);
        
        JPanel temporizadorPanel = new JPanel();
        temporizadorPanel.add(iniciarTemporizadorButton);
        temporizadorPanel.add(pausarTemporizadorButton);
        
        add(relogioLabel);
        add(cronometroLabel);
        add(cronometroPanel);
        add(temporizadorLabel);
        add(temporizadorPanel);
        
        relogio = new Relogio(relogioLabel);
        cronometro = new Cronometro(cronometroLabel);
        temporizador = new Temporizador(temporizadorLabel);
        
        configurarBotoes();
    }

    private void configurarBotoes() {
        iniciarCronometroButton.addActionListener(e -> cronometro.iniciar());
        pausarCronometroButton.addActionListener(e -> cronometro.pausar());
        iniciarTemporizadorButton.addActionListener(e -> temporizador.iniciar());
        pausarTemporizadorButton.addActionListener(e -> temporizador.pausar());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RelogioTemporizadorCronometro().setVisible(true);
        });
    }
}