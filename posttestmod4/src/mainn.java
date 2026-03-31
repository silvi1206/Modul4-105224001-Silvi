import java.util.Scanner;

class mainn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input user
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("No HP: ");
        String hp = input.nextLine();

    DuitKu user = new DuitKu (nama, hp);


        user.setor(50000);
        user.bayar(60000);
        user.setor(20000);
        user.bayar(60000);

        System.out.println("Sisa saldo: Rp " + user.saldo);
    }
}