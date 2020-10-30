package modelo;

/**
 *
 * @author bruno
 */
public class Calculadora {
        
    //atributos
    private double num1;
    private double num2;
   

    //construtor com e sem campos
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
       
    
    }
  
    public Calculadora(){}
    
    //metodos
    public double subtracao(){
        return (this.num1 - this.num2);
    }
    
    public double adicao(){
        return (this.num1 + this.num2);
    }
    
    public double multiplicacao(){
        return (this.num1 * this.num2);
    }
    
    public double divisao(){
        return (this.num1 / this.num2);
    }
    
    
    
    // get e set
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //toString
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

    

   
    
    
    
    
    
    
}
