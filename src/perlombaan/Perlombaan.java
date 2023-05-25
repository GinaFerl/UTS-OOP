package perlombaan;

public class Perlombaan {

    public static void main(String[] args) {
    	// Membuat objek peserta 1 dan mengisi nilai masing-masing
        Peserta peserta1 = new Peserta("Andi");
        peserta1.setNilaiWeb(80);
        peserta1.setNilaiBackend(70);
        peserta1.setNilaiJaringan(90);

        // Membuat objek peserta 2 dan mengisi nilai masing-masing
        Peserta peserta2 = new Peserta("Budi");
        peserta2.setNilaiWeb(75);
        peserta2.setNilaiBackend(80);
        peserta2.setNilaiJaringan(85);

        // Membuat objek lomba web dan mengisi nilai masing-masing
        LombaWeb lombaWeb = new LombaWeb();
        lombaWeb.setNilaiHTML(85);
        lombaWeb.setNilaiCSS(90);
        lombaWeb.setNilaiJS(95);
        lombaWeb.setWaktuMengerjakan(new Waktu(2, 30));

        // Membuat objek lomba backend dan mengisi nilai masing-masing
        LombaBackend lombaBackend = new LombaBackend();
        lombaBackend.setNilaiCRUD(90);
        lombaBackend.setWaktuMengerjakan(new Waktu(1, 45));

        // Membuat objek lomba jaringan dan mengisi nilai masing-masing
        LombaJaringan lombaJaringan = new LombaJaringan();
        lombaJaringan.setNilaiKoneksi(80);
        lombaJaringan.setWaktuMengerjakan(new Waktu(1, 0));

        // Menampilkan informasi nilai total dan waktu mengerjakan masing-masing peserta pada setiap lomba
        System.out.println("Informasi Peserta:");
        System.out.println("Nama: " + peserta1.getNama());
        System.out.println("Total Nilai: " + peserta1.getTotalNilai());
        System.out.println("Waktu Mengerjakan Lomba Web: " + lombaWeb.getWaktuMengerjakan() + " menit");
        System.out.println("Waktu Mengerjakan Lomba Backend: " + lombaBackend.getWaktuMengerjakan() + " menit");
        System.out.println("Waktu Mengerjakan Lomba Jaringan: " + lombaJaringan.getWaktuMengerjakan() + " menit\n");

        System.out.println("Nama: " + peserta2.getNama());
        System.out.println("Total Nilai: " + peserta2.getTotalNilai());
        System.out.println("Waktu Mengerjakan Lomba Web: " + lombaWeb.getWaktuMengerjakan() + " menit");
        System.out.println("Waktu Mengerjakan Lomba Backend: " + lombaBackend.getWaktuMengerjakan() + " menit");
        System.out.println("Waktu Mengerjakan Lomba Jaringan: " + lombaJaringan.getWaktuMengerjakan() + " menit\n");

        // Menampilkan informasi nilai total dan waktu mengerjakan masing-masing lomba
        System.out.println("Informasi Lomba:");
        System.out.println("Total Nilai Lomba Web: " + lombaWeb.getTotalNilai());
        System.out.println("Total Nilai Lomba Backend: " + lombaBackend.getTotalNilai());
        System.out.println("Total Nilai Lomba Jaringan: " + lombaJaringan.getTotalNilai());
    }
}
