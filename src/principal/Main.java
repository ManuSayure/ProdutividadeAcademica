package principal;
import principal.Colaborador;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Colaborador maria = new Colaborador("Maria", "maria@gmail.com");
		Colaborador jose = new Colaborador("jose", "jose@gmail.com");
		Colaborador ana = new Colaborador("Ana", "ana@gmail.com");
	
		
		System.out.println(maria);
		System.out.println(ana);
		System.out.println(jose);

	}

}
