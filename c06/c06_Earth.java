package c06;

public class c06_Earth {
    static final double EARTH_RADIUS = 6400; //상수 선언
    static final double EARTH_SURFACE_AREA;

    static  {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }

}
