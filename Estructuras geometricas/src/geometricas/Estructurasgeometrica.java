package geometricas;

import javax.swing.JOptionPane;

  
public class Estructurasgeometrica {

	public static void main(String[] args) {
	
		 //circulo 	 
	 double Pi = 3.14, R = 0, A = 0,  P= 0;
	 R = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio"));
	 A = (Pi)* R*R;
	 System.out.println("El area del circulo es : " + A );
 	  
     R = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio"));
	 P =  (Pi*Pi)*R	;
	 System.out.println("El perimetro  del circulo es : " + P );
     
	 //cuadrado 
	 double l1=12, l2=12, l3=12, l4=12;
	  P= l1+l2+l3+l4;
	  System.out.println("El perimetro  del cuadrado es : " + P );
	  
	  A=l1*l2;
	  System.out.println("El  area de cuadrado es  : " + A );
	  
	  //Triangulo 
	  double Al=12,B=10,A1=12,A2=13,A3=13;
	  Al=(B*Al)/2;
	  System.out.println("El  area del trinagulo es  : " + Al );
	  
	  P= A1+A2+A3;
	  System.out.println("El perimetro  del trinagulo es  : " + P );
	  
	   //Rectangulo 
	  
	  double Ba=120,Ha=60;
	  A=Ba*Ha;
	  System.out.println("El area del rectangulo  es  : " + A );
	  
	  
	  P = (Ba*2)+(Ha*2);
	  System.out.println("El perimetro  del rectangulo es  : " + P );
	  
	 	
	}
}