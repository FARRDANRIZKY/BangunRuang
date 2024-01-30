
package bangunruang;


public class Balok extends BangunRuang {
    float panjang;
    float lebar;
    float tinggi;
    
    @Override
    float volume(){
        float volume = panjang*lebar*tinggi;
        System.out.println("volume balok :" + volume);
        return volume;
        
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = 2*((panjang*lebar)+ (lebar*tinggi)+(panjang*tinggi));
        System.out.println("luas permukaan balok :" + luaspermukaan);
        return luaspermukaan;
        
    }
    
}
