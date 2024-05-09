package week9;

public class movie {

    private int id;
    private String name;
    private int stars;
    private boolean watched;
}
Movie(String name, int stars, boolean watched) {
    this.name = name;
    this.stars = stars;
    this.watched = watched;

}

@override
public String toString() {

    return “Movie name: " + name + " is rated " + stars + " stars. Have you watched this? " + watched;
}

public String getName() {
    return name;
}
