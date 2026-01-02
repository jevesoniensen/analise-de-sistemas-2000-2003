package gerenciadortarefas20;

import javax.swing.*;
import java.awt.datatransfer.*;
import java.io.*;

public class Icone extends JLabel implements Transferable,Serializable
{	
	public Icone(ImageIcon icone)
	{
		super(icone);
	}
	
	public Object getTransferData(DataFlavor flavor)
	{
		return this;
	}
	
	public DataFlavor[] getTransferDataFlavors()
	{
		return new DataFlavor[]{new DataFlavor(Icone.class,DataFlavor.javaJVMLocalObjectMimeType)};
	}
	
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{
		return flavor.getDefaultRepresentationClass() == Icone.class;
	}
}	