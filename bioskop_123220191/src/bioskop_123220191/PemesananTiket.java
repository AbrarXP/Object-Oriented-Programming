package bioskop_123220191;

import java.util.List;
import java.util.ArrayList;

final class PemesananTiket extends Film {
    private String namaTiket;
    private int jumlahBangku;
    private List<String> listBangku;

    public PemesananTiket(String namaFilm,String genre, double harga) {
    	//ISI SENDIRI YA GES DISINI UNTUK CONSTRUCTOR PROPERTI CLASS BERSIFAT FINAL(TIDAK BISA DI SET ULANG)   
        namaTiket = namaFilm;
        this.setGenre(genre);
        this.setHarga(harga);
    }

	//TODO
	// BUATKAN METODE:
	// 1. MENGAMBIL SETIAP NILAI PROPERTI done
	// 2. BUATKAN SETTER UNTUK SETIAP PROPERTI done

    public String getNamaTiket() {
        return namaTiket;
    }

    public int getJumlahBangku() {
        return jumlahBangku;
    }

    public List<String> getListBangku() {
        return listBangku;
    }
    
    

    public void setNamaTiket(String namaTiket) {
        this.namaTiket = namaTiket;
    }

    public void setJumlahBangku(int jumlahBangku) {
        this.jumlahBangku = jumlahBangku;
    }

    public void setListBangku(List<String> listBangku) {
        this.listBangku = listBangku;
    }
    
    


    private double calculateTotalPrice() {
        // Mengembalikan total harga
    }
}
