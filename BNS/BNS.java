import java.text.DecimalFormat;
import java.util.Scanner;

public class BNS {
	private static final String black="\033[30m"; 
	private static final String red="\033[31m"; 
	private static final String green="\033[32m"; 
	private static final String yellow="\033[33m"; 
	private static final String blue="\033[34m"; 
	private static final String purple="\033[35m"; 
	private static final String cyan="\033[36m"; 
	private static final String white="\033[37m";
	private static final String reset="\u001B[0m";
	
	public static void main(String[] args) {
		System.out.println(green);
		System.out.println("**********************************************************************");
		System.out.println("*              Calculo de Indice de Masa Corporal IMC                *");
		System.out.println("**********************************************************************");
		System.out.println(yellow);
		System.out.print("Ingrese su peso en kilogramos: ");
		double peso=new Scanner(System.in).nextInt();
		System.out.print("Ingrese su estatura en centimetros: ");
		double estatura=new Scanner(System.in).nextInt();
		double imc=(peso/Math.pow(estatura/100, 2));
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.println("Su Indice de Masa Corporal es: "+df.format(imc));
		
		if(imc<15) 					System.out.println(red+"Usted tiene Delgadez muy severa!");
		if(imc>=15 && imc<16)		System.out.println(red+"Usted tiene Delgadez severa!");
		if(imc>=16 && imc<18.5)		System.out.println("Usted tiene Delgadez!");
		if(imc>=18.5 && imc<25)		System.out.println("Usted tiene Peso Correcto!");
		if(imc>=25 && imc<30)		System.out.println("Usted tiene Sobrepeso!");
		if(imc>=30 && imc<35)		System.out.println(red+"Usted tiene Obesidad moderada!");
		if(imc>=35 && imc<40)		System.out.println(red+"Usted tiene Obesidad severa!");
		if(imc>=40)					System.out.println(red+"Usted tiene Obesidad morbida!");
		System.out.println(reset);
		
	}

}
