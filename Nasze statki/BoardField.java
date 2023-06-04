public class BoardField {
    private boolean hasShip;
    private boolean hasBeenShot;

    public BoardField() {
        this.hasShip = false;
        this.hasBeenShot = false;
    }

    public boolean hasShip() {
        return hasShip;
    }

    public boolean hasBeenShot() {
        return hasBeenShot;
    }

    public void setShip() {
        this.hasShip = true;
    }

    public void markAsShot() {
        this.hasBeenShot = true;
    }
}