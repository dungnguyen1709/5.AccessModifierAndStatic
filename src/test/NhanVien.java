package test;

public class NhanVien {
    private int id;
    private String name;
    private String phongBan;

   public  static final String COMP = "CodeGym";

   static {
       System.out.println("OK");
   }

   public static void testStatic() {
       System.out.println(COMP);
   }

    public NhanVien() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String toString() {
        return " Ma : " + this.id +
                "\n name : " + this.name +
                "\n Ma : " + this.phongBan;
    }

}

