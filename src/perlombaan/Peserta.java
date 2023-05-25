package perlombaan;

public class Peserta {
    private String nama;
    private int nilaiWeb;
    private int nilaiBackend;
    private int nilaiJaringan;

    public Peserta(String nama) {
        this.nama = nama;
        this.nilaiWeb = 0;
        this.nilaiBackend = 0;
        this.nilaiJaringan = 0;
    }

    public void setNilaiWeb(int nilai) {
        this.nilaiWeb = nilai;
    }

    public void setNilaiBackend(int nilai) {
        this.nilaiBackend = nilai;
    }

    public void setNilaiJaringan(int nilai) {
        this.nilaiJaringan = nilai;
    }

    public String getNama() {
        return this.nama;
    }

    public int getTotalNilai() {
        return this.nilaiWeb + this.nilaiBackend + this.nilaiJaringan;
    }
}

class Waktu {
    private int jam;
    private int menit;

    public Waktu(int jam, int menit) {
        this.jam = jam;
        this.menit = menit;
    }

    public int toMenit() {
        return this.jam * 60 + this.menit;
    }
}

class LombaWeb {
    public int nilaiHTML;
    public int nilaiCSS;
    public int nilaiJS;
    public Waktu waktuMengerjakan;

    public LombaWeb() {
        this.nilaiHTML = 0;
        this.nilaiCSS = 0;
        this.nilaiJS = 0;
        this.waktuMengerjakan = new Waktu(0, 0);
    }

    public void setNilaiHTML(int nilai) {
        this.nilaiHTML = nilai;
    }

    public void setNilaiCSS(int nilai) {
        this.nilaiCSS = nilai;
    }

    public void setNilaiJS(int nilai) {
        this.nilaiJS = nilai;
    }

    public void setWaktuMengerjakan(Waktu waktu) {
        this.waktuMengerjakan = waktu;
    }

    public int getTotalNilai() {
        return this.nilaiHTML + this.nilaiCSS + this.nilaiJS;
    }

    public int getNilaiHTML() {
        return this.nilaiHTML;
    }

    public int getNilaiCSS() {
        return this.nilaiCSS;
    }

    public int getNilaiJS() {
        return this.nilaiJS;
    }

    public int getWaktuMengerjakan() {
        return this.waktuMengerjakan.toMenit();
    }
}

class LombaBackend {
	public int nilaiCRUD;
	public Waktu waktuMengerjakan;
	
	public LombaBackend() {
		this.nilaiCRUD = 0;
		this.waktuMengerjakan = new Waktu(0, 0);
	}
	
	public void setNilaiCRUD(int nilai) {
		this.nilaiCRUD = nilai;
	}
	
	public void setWaktuMengerjakan(Waktu waktu) {
		this.waktuMengerjakan = waktu;
	}
	
	public int getTotalNilai( ) {
		return this.nilaiCRUD;
	}
	
	public int getWaktuMengerjakan() {
		return this.waktuMengerjakan.toMenit();
	}
}

class LombaJaringan {
    public int nilaiKoneksi;
    public Waktu waktuMengerjakan;

    public LombaJaringan() {
        this.nilaiKoneksi = 0;
        this.waktuMengerjakan = new Waktu(0, 0);
    }

    public void setNilaiKoneksi(int nilai) {
        this.nilaiKoneksi = nilai;
    }

    public void setWaktuMengerjakan(Waktu waktu) {
        this.waktuMengerjakan = waktu;
    }

    public int getTotalNilai() {
        return this.nilaiKoneksi;
    }
    
    public int getWaktuMengerjakan() {
        return this.waktuMengerjakan.toMenit();
    }
}
