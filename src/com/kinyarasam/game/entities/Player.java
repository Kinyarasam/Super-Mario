package com.kinyarasam.game.entities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player {
    private int x, y; // Player's coordinates
    private int width, height; // Player's dimensions
    private BufferedImage playerImage; // Player's image
    private int jumpVelocity; // jump velocity
    private int gravity;  // gravity affecting the player's vertical motion

    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        jumpVelocity = -15;
        gravity = 2;

        // Load Player Image from a File
        try {
            playerImage = ImageIO.read(new File("assets/player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isOnGround(int groundHeight) {
        return y <= groundHeight - height;
    }

    public BufferedImage getPlayerImage() {
        return playerImage;
    
    }
    public void applyGravity(int groundHeight) {
        if (y < groundHeight - height) {
            y += gravity;  // Apply gravity to move downward
        } else {
            y = groundHeight - height; // Prevent player from falling through the ground
        }
    }

    public void moveLeft() {
        x -= 5;
    }

    public void moveRight() {
        x += 5;
    }

    public void jump() {
        if (y > 0) {
            y += jumpVelocity;
        }
    }

    public void moveDown() {
        y += 10;
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