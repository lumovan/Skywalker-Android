package es.uva.tfg.hector.SkyWalkerApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hector Del Campo Pando on 14/07/2016.
 */
public class PointOfInterest {

    /**
     * Coordinates
     */
    private int x,
         y,
         z;

    /**
     * Name of the point.
     */
    private String name;

    /**
     * Stub for direction in angles.
     */
    private float direction;
    private int modifier;

    /**
     * Retrieves a list of all points
     * @return the list of points
     */
    public static List<PointOfInterest> getPoints() {
        //TODO stub
        List<PointOfInterest> points = new ArrayList<>();
        points.add(new PointOfInterest("Wally", 0, 0, 0));    //TODO demo
        points.add(new PointOfInterest("Robin", 135, 0, 45));
        return points;
    }

    /**
     * Creates a new point of interest in a 3 axes plane.
     * @param x
     * @param y
     * @param z
     */
    public PointOfInterest(String name, int x, int y, int z){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        direction = 0;
        modifier = 1;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Gets direction of the point. </br>
     * THIS IS A STUB FOR NOW!
     * @return direction angle.
     */
    public float getDirection(){
        //TODO stub for demo
        final int LENGTH = 40;
        final int INITIAL_POS = LENGTH/2;
        float value = (float) ((System.currentTimeMillis()*0.035) % LENGTH);
        if (value >= LENGTH/2) return LENGTH - value - INITIAL_POS ;
        else return value - INITIAL_POS;
    }

    public String getID() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PointOfInterest)) {
            return false;
        }
        return getID().equals(((PointOfInterest)obj).getID());
    }
}
