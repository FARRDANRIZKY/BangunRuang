
package bangunruang;


public class Kubus extends BangunRuang{
    float sisi;
    
    @Override
    float volume(){
        float hasil = sisi*sisi*sisi;
        System.out.println("volume kubus :" + hasil);
        return hasil;
        
    }
    @Override
    float luaspermukaan(){
        float hasil = 6*sisi*sisi;
        System.out.println("luas permukaan kubus :" + hasil);
        return hasil;
        
    }
    
}
