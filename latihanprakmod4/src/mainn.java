public class mainn {
    public static void main(String[] args) throws Exception {
        mahasiswa mhsbru = new mahasiswa("cip", 30, "cs");
        
        //panggil method
        mhsbru.Belajar();
        mhsbru.tampilkan();

        mhsbru.gantiProdi("hahaha");
        mhsbru.tampilkan();

    }
}
