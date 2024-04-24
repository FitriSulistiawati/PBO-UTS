package pegawai;

public class Manager extends Pegawai {
    private String departemen;

    public Manager(String nama, int umur, double gaji, String departemen) {
        super(nama, umur, gaji);
        this.departemen = departemen;
    }

    // Method override untuk menampilkan informasi khusus manager
    @Override
    public void displayInfo() {

    }

    // Getter dan setter untuk variabel instance khusus manager
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}