
package bangunruang;


public class LimasSegitiga extends BangunRuang {
    float a;
    float ts;
    float tl;
    float tst;
    
    @Override
    float volume(){
        float volume = 1/3 *(1/2*a*ts)*tl;
        System.out.println("volume limas segitiga :" + volume);
        return volume;
        
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = (1/2*a*ts) + (3*(1/2*a*tst));
        System.out.println("luas permukaan limas limas segitiga :" + luaspermukaan);
        return luaspermukaan;
        
    }
    
}
