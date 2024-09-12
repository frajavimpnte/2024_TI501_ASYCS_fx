/*
*   ITESS-TICS 
*   Agosto-Diciembre 2024
*   Análsisis de Señales y Sistemas de Comunicaciones
*   Unidad 1. Introducción a Señales
*   Actividad: Operaciones con números complejos, ejemplos
*   Docente: Franacisco Javier Montecillo Puente
*   Programador: FJMP
*   Fecha: 04 de Agosto 2024
*/

package complex;

public class ComplexNumberTest {
    public static void main(String ...arg){
       //ejemplo();
       //P3a();
       //P1i();
       //P4d();
       complexFunctions();
    }
    
    public static void complexFunctions() {
        /*
        ComplexNumber z0 = new ComplexNumber (1, 1);
        ComplexNumber z1 = new ComplexNumber (-1, 1);
        ComplexNumber z2 = new ComplexNumber (-1, -1);
        ComplexNumber z3 = new ComplexNumber (1, -1);
        */
        ComplexNumber z[] = {
            new ComplexNumber (1, 1),
            new ComplexNumber (-1, 1),
            new ComplexNumber (-1, -1),
            new ComplexNumber (1, -1)
        };
        
        // Funcion w = f(z) =  z^2 + i
        System.out.println("w = f(z) =  z^2 + i  -----------------------------");
        for (int i = 0; i < z.length; i++) {
            ComplexNumber r = z[i].mult(z[i]).add( new ComplexNumber(0, 1));
            System.out.println("w" + i + " = " + r.toString());
        }  
    }
    
    public static void P4d() {
        ComplexNumber c1 = new ComplexNumber();
        c1.setMod(3);
        c1.setArg(3.14159f/6);
        c1.rectangularRad();
        System.out.println(c1.toString());
        
        ComplexNumber c2 = new ComplexNumber();
        c2.setMod(2);
        c2.setArg(-5*3.14159f/4);
        c2.rectangularRad();
        System.out.println(c2.toString());
        
        ComplexNumber c3 = new ComplexNumber();
        c3.setMod(6);
        c3.setArg(5*3.14159f/3);
        c3.rectangularRad();
        System.out.println(c3.toString());
    
        ComplexNumber c4 = new ComplexNumber();
        c4.setMod(4);
        c4.setArg(2*3.14159f/3);
        c4.rectangularRad();
        System.out.println(c4.toString());
        
        ComplexNumber p4d = c1.mult(c2).mult(c3).div(c4.mult(c4));
        System.out.println("p4d: " + p4d.toString());
    }
    
    
    public static void P1i() {
        ComplexNumber p1i = ComplexNumber.i2n(4).add( ComplexNumber.i2n(9) )
                            .add( ComplexNumber.i2n(16))
                            .div( (new ComplexNumber(2,0))
                                  .sub(ComplexNumber.i2n(5))
                                  .add(ComplexNumber.i2n(10)
                                  .sub(ComplexNumber.i2n(15))));
        System.out.println("p1i: " + p1i.toString());
    }
    
    public static void P3a() {
        ComplexNumber c1 = new ComplexNumber(-1,  2);
        ComplexNumber c2 = new ComplexNumber( 4,  0);
        ComplexNumber c3 = new ComplexNumber( 1, -1);
        ComplexNumber c4 = new ComplexNumber( 2, -1);
        ComplexNumber c5 = new ComplexNumber( 1,  1);
        
        
        ComplexNumber t1 = c1.mult(c1);
        System.out.println("t1: " + t1.toString());
        
        ComplexNumber t2 = c2.div(c3);
        System.out.println("t2: " + t2.toString());
        
        ComplexNumber res = c1.mult(c1).mult(
            c2.div(c3).add(c4.div(c5))
        );
        System.out.println("P3a:");
        System.out.println(res.toString());
    }
    
    public static void P3aVer2() {
        ComplexNumber c1 = new ComplexNumber(-1,  2);
        ComplexNumber c2 = new ComplexNumber( 4,  0);
        ComplexNumber c3 = new ComplexNumber( 1, -1);
        ComplexNumber c4 = new ComplexNumber( 2, -1);
        ComplexNumber c5 = new ComplexNumber( 1,  1);
        
        
        ComplexNumber t1 = c1.mult(c1);
        System.out.println("t1: " + t1.toString());
        
        ComplexNumber t2 = c2.div(c3);
        System.out.println("t2: " + t2.toString());
        
    }
    
    public static void ejemplo() {
        ComplexNumber c1=new ComplexNumber(1,1);
        ComplexNumber c2=new ComplexNumber(2,3);
        
        // Ejemplos: suma, resta, multiplicación, division, polar
        System.out.println("Suma:");
        ComplexNumber suma = c1.add(c2);
        System.out.println(suma.toString());
         
        System.out.println("Resta:");
        ComplexNumber resta = c1.sub(c2);
        System.out.println(resta.toString());
        
        System.out.println("Multiplicación:");
        ComplexNumber mult = c1.mult(c2);
        System.out.println(mult.toString());
        
        System.out.println("División:");
        ComplexNumber div = c1.div(c2);
        System.out.println(div.toString());
        
        System.out.println("PolarDeg:");
        c1.polarDeg();
        System.out.println(c1.toStringPolar());
        
        System.out.println("PolarRad:");
        c1.polarRad();
        System.out.println(c1.toStringPolar());
    }
}
