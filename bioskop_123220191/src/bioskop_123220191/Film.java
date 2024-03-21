package bioskop_123220191;
public class Film {
    private String title;
    private String genre;
    private double harga;

    public Film(String title, String genre, double harga) {
        this.title = title;
        this.genre = genre;
        this.harga = harga;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}