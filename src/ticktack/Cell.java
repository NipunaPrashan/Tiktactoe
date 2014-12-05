package ticktack;

import javax.swing.JButton;

public class Cell {

    private int x = 3, y = 3;
    private boolean isClicked = false;    // whether it is clicked or not
    private int status = -1;             //the status whether click x or o 
    private int machine;

    public Cell() {
        // System.out.println("bla bla bla...");
    }

    public Cell(int x, int y, int status) {
        this.x = x;
        this.y = y;
        this.status = status;
        isClicked = true;
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        isClicked = false;
    }

    public int getX() {  // getters and setters are as follows
        return x;
    }

    public int getY() {
        return y;
    }

    public int getStatus() {
        return status;
    }

    public int getMachine() {
        return machine;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setIsClicked(boolean isClicked) {
        this.isClicked = isClicked;
    }

    public void setMachine(int machine) {
        this.machine = machine;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
