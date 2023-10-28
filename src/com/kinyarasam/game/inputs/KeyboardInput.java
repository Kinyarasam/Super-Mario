package com.kinyarasam.game.inputs;

import com.kinyarasam.game.entities.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;


public class KeyboardInput extends KeyAdapter {
    private Player player;

    public KeyboardInput(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            player.moveLeft();
        }

        if (key == KeyEvent.VK_RIGHT) {
            player.moveRight();
        }

        if (key == KeyEvent.VK_UP) {
            player.jump();
        }
    }
}
