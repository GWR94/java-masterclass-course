package jamesChallenge;

/**
 * Created by HP on 19/05/2017.
 */
public class Dimension {
    private int width;
    private int height;
    private int depth;

    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
