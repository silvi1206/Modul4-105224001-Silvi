public class mainn {
    public static void main(String[] args) {

        MesinKopi mesinlobby = new MesinKopi(34.99, 67.99, 57.88);

        mesinlobby.isiUlangBahan(34.0, 67.0, 120.0);
        mesinlobby.tampilkan();

        boolean cek = mesinlobby.cekKetersediaanCappuccino();
        System.out.println("Ketersediaan Cappuccino: " + cek);
    }
}
