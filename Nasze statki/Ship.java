public abstract class Ship {
    protected int size;
    protected boolean isDestroyed;

    public Ship(int size) {
        this.size = size;
        this.isDestroyed = false;
    }

    public int getSize() {
        return size;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void destroy() {
        this.isDestroyed = true;
    }
}
