package com.kinyarasam.game;

import com.kinyarasam.game.entities.Player;
import com.kinyarasam.game.inputs.KeyboardInput;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
// import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class GameApp extends JPanel {
    private Player player;

    public GameApp() {
        player = new Player(100, 100, 50, 50);
        addKeyListener(new KeyboardInput(player));
        setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);

        g.setColor(Color.RED);
        g.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mario Game");
        GameApp gameApp = new GameApp();
        frame.add(gameApp);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        // Game Loop
        while (true) {
            gameApp.repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}