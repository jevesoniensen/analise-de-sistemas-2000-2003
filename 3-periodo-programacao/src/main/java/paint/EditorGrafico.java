package paint;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.awt.FileDialog;
import java.awt.Frame;
import java.util.Vector;

public class EditorGrafico
{
	private Vector desenhos;
	
	public EditorGrafico()
	{
		desenhos = new Vector();
	}
	
	public Vector getGraficos()
	{
		return desenhos;
	}
	
	public void setGraficos(Vector g)
	{
		desenhos = g;
	}
	
	public void delete(Primitiva p)
	{
		for(int i=0;i<desenhos.size();i++)
			if(p == (Primitiva)desenhos.elementAt(i))
				desenhos.removeElementAt(i);
	}
	
	public void apaga()
	{
		desenhos.clear();
	}
	
	public void addDesenho(Primitiva p)
	{
		desenhos.add(p);
	}

	public void salvar(String arquivo)
	{
			try
			{
				FileOutputStream fos = new FileOutputStream(arquivo);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(getGraficos());
				oos.flush();
				//System.out.println("Salvo com sucesso!");
				oos.close();
			}
			catch(Exception ex)
			{}		
	}

	public String salvarComo(Frame pai)
	{
		FileDialog fd = new FileDialog(pai,"Salvar Como",FileDialog.SAVE);
		fd.setVisible(true);
		if(fd.getDirectory() != null)
		{
			salvar(fd.getDirectory() + fd.getFile());
			return fd.getDirectory() + fd.getFile();
		}
		return null;
	}
	
	public String abrir(Frame pai)
	{
		FileDialog fd = new FileDialog(pai,"Abrir",FileDialog.LOAD);
		fd.setVisible(true);
		String arquivo = null;
		if(fd.getDirectory() != null)
		{
			try
			{
				arquivo = fd.getDirectory() + fd.getFile();
				FileInputStream fis = new FileInputStream(arquivo);
				ObjectInputStream ois = new ObjectInputStream(fis);
				setGraficos((Vector)ois.readObject());
				fis.close();
			}
			catch(Exception ex)
			{}
		}
		return arquivo;
	}
	
	public Primitiva selecionaFigura(int x, int y) throws Exception
	{
		for(int i=desenhos.size(); i >= 0; i--)
		{
			if(((Primitiva)desenhos.elementAt(i)).pontoInterno(x,y))
				return (Primitiva)desenhos.elementAt(i);
		}
		throw new Exception("Figura n�o existente");
	}
}