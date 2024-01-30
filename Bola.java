
package bangunruang;


public class Bola extends BangunRuang{
    float r;
    
   
    @Override
    float volume(){
        float volume = 4/3* (float)(Math.PI*r*r*r);
        System.out.println("volume bola:"+ volume);
        return volume;
        
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = 4*(float)(Math.PI*r*r);
        System.out.println("luas permukaan : " + luaspermukaan);
        return luaspermukaan;
        
    }
    
    
    
}
