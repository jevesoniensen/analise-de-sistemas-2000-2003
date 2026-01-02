package gerenciadortarefas20;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.awt.FileDialog;
import javax.swing.*;
import java.util.Vector;
public class Serial
{

	public void salvar(String arquivo,Vector v)
	{
			try
			{
				FileOutputStream fos = new FileOutputStream(arquivo);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(v);
				oos.flush();
				oos.close();
			}
			catch(Exception ex)
			{ex.printStackTrace();}		
	}

	public String salvarComo(JFrame pai,Vector v)
	{
		FileDialog fd = new FileDialog(pai,"Salvar Como",FileDialog.SAVE);
		fd.setVisible(true);
		if(fd.getDirectory() != null)
		{
			salvar((fd.getDirectory() + fd.getFile()),v);
			return fd.getDirectory() + fd.getFile();
		}
		return null;
	}
	
	public String abrir(JFrame pai,DropPanel dp)
	{
		FileDialog fd = new FileDialog(pai,"Abrir",FileDialog.LOAD);
		fd.setVisible(true);
		String arquivo = null;
		Vector aux;
		if(fd.getDirectory() != null)
		{
			try
			{
				arquivo = fd.getDirectory() + fd.getFile();
				System.out.println(arquivo);
				FileInputStream fis = new FileInputStream(arquivo);
				ObjectInputStream ois = new ObjectInputStream(fis);
				aux =(Vector)ois.readObject();
				ois.close();
				fis.close();
				dp.vecSalvar=aux;
			}
			catch(Exception e1)
			{	
				System.out.println("Deu pau!!");
			}
		}
		return arquivo;
	}
}