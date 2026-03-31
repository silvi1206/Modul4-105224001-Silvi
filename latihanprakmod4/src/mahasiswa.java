class mahasiswa{
    String nama ;
    int umur;
    String jurusan;

    //konstruktor
    public mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    //method
    public void Belajar(){
        System.out.println(nama + " Sedang Belajar");
    }

    public void gantiProdi(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void tampilkan(){
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("jurusan : " + jurusan);
    }
}
