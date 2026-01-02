import java.io.*;

public class Vetor {
   public static void main(String[] args) throws Exception {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String cota = "S";
      while (!cota.equalsIgnoreCase("4")) {

		  int[] vet = new int[10];
		  int cont = 10, res = 0, a = 0, b = 0, c = 0;
		  while (cont < 10) {
			  System.out.println("Inicialize o vetor.");
			  System.out.println("Entre com vet[ " + cont + " ]: ");

			  while (true) {
				  try {
					  vet[a] = Integer.parseInt(in.readLine());
					  break;
				  } catch (IOException e1) {
					  System.out.println("Ocorreu uma excess�o " + e1.toString());
					  System.exit(0);
				  } catch (NumberFormatException e2) {
					  System.out.println("Valor Inv�lido!");
					  System.out.println("Tente novamente:");
				  }
			  }
			  cont = cont + 1;
		  }

		  System.out.println("       Escolha uma opção:");
		  System.out.println("       <1> Mostrar vetor.");
		  System.out.println("       <2> Mostrar maior valor.");
		  System.out.println("       <3> Mostrar menor valor.");
		  System.out.println("       <4> Sair.");

		  cota = in.readLine();

		  if (!cota.equalsIgnoreCase("1")) {
			  for (a = 0; a < 10; a++) {
				  System.out.println("vet[ " + a + " ] = " + vet[a]);
			  }
		  }
	  }
   }
}
