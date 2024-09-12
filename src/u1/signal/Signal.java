/*
 * ITESS-TICS
 * AGOSTO-DICIEMBRE 2024
 * ANALISIS DE SEÑALES Y SISTEMAS DE COMUNICACIONES
 * DOCENTE: Fracisco Javier Montecillo Puente
 * PROGRAMADOR: FJMP
 * DESCRIPSION: clase señal
 * 02/Septiembre/2024
 *
*/

package u1.signal;

// import
public class Signal {
    // datos, variables, atributos
    private float A;
    private float f;
    private float p; 
    
    //metodos
    public Signal() {
    }

    public Signal(float A, float f, float p) {
        this.A = A;
        this.f = f;
        this.p = p;
    }

    public float getA() {
        return A;
    }

    public void setA(float A) {
        this.A = A;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Signal{" + "A=" + A + ", f=" + f + ", p=" + p + '}';
    } 
}
