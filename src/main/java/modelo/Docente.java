
package modelo;

public class Docente {
    
    private int nDocente,nivelDocente;
    private String nomDocente,domDocente,hImpartida;
    private float pHImpartida;
    
    public Docente(){
        
    }
    
    public Docente(Docente Doc){
        
    }
    
    public Docente(int a, String b, String c,int d,float e,String f){
        this.nDocente = a;
        this.nomDocente=b;
        this.domDocente=c;
        this.nivelDocente = d;
        this.pHImpartida=e;
        this.hImpartida=f;
    }

    public int getnDocente() {
        return nDocente;
    }

    public int getNivelDocente() {
        return nivelDocente;
    }

    public String getNomDocente() {
        return nomDocente;
    }

    public String getDomDocente() {
        return domDocente;
    }

    public String gethImpartida() {
        return hImpartida;
    }

    public float getpHImpartida() {
        return pHImpartida;
    }

    public void setnDocente(int nDocente) {
        this.nDocente = nDocente;
    }

    public void setNivelDocente(int nivelDocente) {
        this.nivelDocente = nivelDocente;
    }

    public void setNomDocente(String nomDocente) {
        this.nomDocente = nomDocente;
    }

    public void setDomDocente(String domDocente) {
        this.domDocente = domDocente;
    }

    public void sethImpartida(String hImpartida) {
        this.hImpartida = hImpartida;
    }

    public void setpHImpartida(float pHImpartida) {
        this.pHImpartida = pHImpartida;
    }
    
    public float CalcularPago(){
        float cantPago;
        if(nivelDocente==1){
            cantPago=getpHImpartida()*50/100;
            return cantPago*getpHImpartida();
        }
        if(nivelDocente==2){
            cantPago=getpHImpartida()*50/100;
            return cantPago*getpHImpartida();
        }
        if(nivelDocente==3){
            cantPago=getpHImpartida()*100/100;
            return cantPago*getpHImpartida();
        }
        
    }
    
    public float CalcularImpuesto(){
        return CalcularPago()*16/100;
    }
    
    public float CalcularDeBono(int nHijos){
        if(nHijos>=1 && nHijos<=2){
            return CalcularPago()*5/100;
 
        }
        if(nHijos>=3 && nHijos<=5){
            return CalcularPago()*10/100;
 
        }
        if(nHijos>=5){
            return CalcularPago()*20/100;
 
        }
    }
    
}
