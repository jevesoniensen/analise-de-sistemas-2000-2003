class DiasDaSemana
{

  	public static void main(String[] args)
 	{  
		int dia_da_semana=1;

 		switch (dia_da_semana)
 		{
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("ter�a");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;

		case 7:
			System.out.println("s�bado");
			break;
		default:
			System.out.println("op��o invalida");
			break;

		}	
			
		if (dia_da_semana==7 || dia_da_semana==1)
			System.out.println("fim de semana");
	}
}