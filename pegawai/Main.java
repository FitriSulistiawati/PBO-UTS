package pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek pegawai
        Pegawai pegawai1 = new Pegawai("John", 30, 5000);

        // Membuat objek manager
        Manager manager1 = new Manager("Jane", 35, 8000, "HR");

        // Memanggil method displayInfo() dari objek pegawai dan manager
        System.out.println("Informasi Pegawai:");
        pegawai1.displayInfo();

        System.out.println("\nInformasi Manager:");
        manager1.displayInfo();
    }
    
}
