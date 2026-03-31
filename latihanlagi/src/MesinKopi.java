public class MesinKopi {
    Double bijikopi;
    Double air;
    Double susu; 
    
    public MesinKopi(Double bijikopi, Double air, Double susu) {
        this.bijikopi = bijikopi;
        this.air = air;
        this.susu = susu;
    }

    public MesinKopi() {
        this.bijikopi = 0.0;
        this.air = 0.0;
        this.susu = 0.0;
    }

    public void isiUlangBahan(Double bijikopi, Double air, Double susu) {
        this.bijikopi = bijikopi + this.bijikopi;
        this.air = air + this.air;
        this.susu = susu + this.susu;

        System.out.println("Bahan baku berhasil diisi ulang!");
    }

   
    public void tampilkan() {
        System.out.println("Biji kopi: " + this.bijikopi);
        System.out.println("Air: " + this.air);
        System.out.println("Susu: " + this.susu);
    }

    
    public boolean cekKetersediaanCappuccino() {
        return this.bijikopi >= 15 && this.air >= 50 && this.susu >= 100;
    }
}