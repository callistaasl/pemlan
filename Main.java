public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();

        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Novita Karina");
        karyawan1.setGajiPokok(4500000);
        karyawan1.setPerusahaan(perusahaan);

        Karyawan karyawan2 = new Karyawan();
        karyawan2.setNama("Januar Putra");
        karyawan2.setGajiPokok(6700000);
        karyawan2.setPerusahaan(perusahaan);

        System.out.println("Informasi Karyawan");
        System.out.println("1. " + karyawan1.info());
        System.out.println("Nama Perusahaan: " + karyawan1.getPerusahaan());
        System.out.println("2. " + karyawan2.info());
        System.out.println("Nama Perusahaan: " + karyawan2.getPerusahaan());
        
    }
}
