package application;

public class fimlDetals {
    private int filmId;
    private String filmname;
    private int year;
    private String filmLang;
    private int filmRating;

    public fimlDetals( String filmname, int year, String filmLang, int filmRating) {
        this.filmname = filmname;
        this.year = year;
        this.filmLang = filmLang;
        this.filmRating = filmRating;
    }

    public fimlDetals(int filmId, String filmname, int year, String filmLang, int filmRating) {
        this.filmId = filmId;
        this.filmname = filmname;
        this.year = year;
        this.filmLang = filmLang;
        this.filmRating = filmRating;
    }

    public fimlDetals(){

    }

    public int getFilmId() {
        return filmId;
    }
//
//    public void setFilmId(int filmId) {
//        this.filmId = filmId;
//    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFilmLang() {
        return filmLang;
    }

    public void setFilmLang(String filmLang) {
        this.filmLang = filmLang;
    }

    public int getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(int filmRating) {
        this.filmRating = filmRating;
    }
}
