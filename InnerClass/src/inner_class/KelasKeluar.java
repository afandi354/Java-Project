package inner_class;

public class KelasKeluar {
    private int z = 0;
    private KelasDalam dalam;
    public void methodKeluar(){
        dalam = new KelasDalam();
        dalam.methodDalam();
    }
    public int getZ(){
        return z;
    }
    public class KelasDalam {
        public void methodDalam(){
            z = 11;
        }
    }
}

