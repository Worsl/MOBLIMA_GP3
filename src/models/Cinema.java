package models;

/**
 * Represents a single cinema within a cineplex;
 */
public class Cinema {

    /**
     * The code of the cinema.
     */
    private String cinemaCode;

    /**
     * The class of the cinema.
     */
    private CinemaClass cinemaClass;

    /**
     * The Cineplex the cinema is in.
     */
    private Cineplex cineplex;

    /**
     * Creates a new Cinema from the given parameters
     * @param cinemaCode the Cinema's code
     * @param cinemaClass the Cinema's class
     * @param cineplex the Cinema's cineplex
     */
    public Cinema(String cinemaCode, CinemaClass cinemaClass, Cineplex cineplex) {
        this.cinemaCode = cinemaCode;
        this.cinemaClass = cinemaClass;
        this.cineplex = cineplex;
    }

    /**
     * Gets the code of this Cinema.
     * @return this Cinema's name.
     */
    public String getCinemaCode() {
        return this.cinemaCode;
    }

    /**
     * Sets the code of this Cinema.
     * @param cinemaCode this Cinema's new code
     */
    public void setCinemaCode(String cinemaCode) {
        this.cinemaCode = cinemaCode;
    }

    /**
     * Gets the class of this Cinema.
     * @return this Cinema's class.
     */
    public CinemaClass getCinemaClass() {
        return this.cinemaClass;
    }

    /**
     * Sets the class of this Cinema.
     * @param cinemaClass this Cinema's new class
     */
    public void setCinemaClass(CinemaClass cinemaClass) {
        this.cinemaClass = cinemaClass;
    }

    /**
     * Gets the cineplex of this Cinema.
     * @return this Cinema's cineplex.
     */
    public Cineplex getCineplex() {
        return this.cineplex;
    }

}
