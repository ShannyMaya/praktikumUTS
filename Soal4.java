public class Java4 {
    public static void main(String[] args) {
        Limas limas1 = new Limas (1, 1, 1);
        Limas limas2 = new Limas (30, 40, 50);
        Limas limas3 = new Limas (25, 35, 45);
        
        double VolumeLimas1 = limas1.getVolume();
        double LuasLimas1 = limas1.getLuas();
        double VolumeLimas2 = limas2.getVolume();
        double LuasLimas2 = limas2.getLuas();
        double VolumeLimas3 = limas3.getVolume();
        double LuasLimas3 = limas3.getLuas();
        
        System.out.println("Limas Segiempat 1 :");
        System.out.println("Volume: " + VolumeLimas1);
        System.out.println("Luas: " + LuasLimas1);
        
        System.out.println("Limas Segiempat 2 :");
        System.out.println("Volume: " + VolumeLimas2);
        System.out.println("Luas: " + LuasLimas2);
        
        System.out.println("Limas Segiempat 3 :");
        System.out.println("Volume: " + VolumeLimas3);
        System.out.println("Luas: " + LuasLimas3);
        
        
    }
    
}

class Limas {
    private double luasAlas;
    private double luasSelubung;
    private double tinggi;
    
    public Limas(){
    }
    
    public Limas(double luasAlasBaru, double luasSelubungBaru, double tinggiBaru){
        this. luasAlas= luasAlasBaru;
        this. luasSelubung = luasSelubungBaru;
        this. tinggi = tinggiBaru;
    }
    
    public double getVolume(){
        return (0.33 * luasAlas * tinggi);
    }
    
    public double getLuas(){
        return luasAlas + luasSelubung;
    }
    
    public void setLuasAlas(double luasAlasBaru){
        this.luasAlas = luasAlasBaru;
    }
    
    public void setLuasSelubung(double luasSelubungBaru){
        this.luasSelubung = luasSelubungBaru;
    }
    
    public void setTinggi(double tinggiBaru){
        this.tinggi = tinggiBaru;
    }
    
    public double getLuasAlas() {
        return luasAlas;
    }

    public double getLuasSelubung() {
        return luasSelubung;
    }

    public double getTinggi() {
        return tinggi;
    }
}
