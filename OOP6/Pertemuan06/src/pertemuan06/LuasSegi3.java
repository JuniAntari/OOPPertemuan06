package pertemuan06;

/**
 *
 * @author Juni Antari 
 * tgl: 2024-04-29
 */
public class LuasSegi3 {
    private float alas, tinggi, luas;
    
    public LuasSegi3(float Al,float Tg){
        alas = Al;
        tinggi = Tg;
    }
    
    public void setAlas(float nVAL){
        alas = nVAL;
    }
    public float getAlas(){
        return alas;    
    }
    public void setTinggi(float nVAL){
        tinggi = nVAL;
    }
    public float getTinggi(){
        return tinggi;
        
    }
    public void HLuasSegi3(){
        luas =(this.alas*this.tinggi)/2;
    }
    public float getLuas(){
        return luas;
    }
    
}
