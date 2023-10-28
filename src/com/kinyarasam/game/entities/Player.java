package com.kinyarasam.game.entities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
    private int x, y; // Player's coordinates
    private int width, height; // Player's dimensions
    private BufferedImage playerImage; // Player's image

    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        // Load Player Image from a File
        try {
            playerImage = ImageIO.read(new File("assets/player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public BufferedImage getPlayerImage() {
        return playerImage;
    }

    public void moveLeft() {
        x -= 5;
    }

    public void moveRight() {
        x -= 5;
    }

    public void jump() {
        y -= 10;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}