package Static_Inner;

public class TesKelasKeluar {
    public static void main(String[] args) {
        KelasKeluar.KelasDalam diDalam = new KelasKeluar.KelasDalam();
        int x = KelasKeluar.KelasDalam.value;
        System.out.println(x);
    }
}
