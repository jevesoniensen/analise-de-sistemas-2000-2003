package gerenciadordeciclos;

import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.io.*;

public class DragItem extends JLabel implements DragGestureListener,DragSourceListener,Serializable
{
	private transient DragSource dragSource = null;
	
	ImageIcon middleButtonIcon;
	
	public DragItem(ImageIcon middleButtonIcon)
	{
		super(middleButtonIcon);
		dragSource = new DragSource();
		dragSource.createDefaultDragGestureRecognizer(this,DnDConstants.ACTION_COPY_OR_MOVE,this);
	}
	
	public void dragGestureRecognized(DragGestureEvent e)
	{
		Icone imagem = new Icone(new ImageIcon("middle.gif"));
		dragSource.startDrag(e,DragSource.DefaultCopyDrop,imagem,this);
	}

	public void dragDropEnd(DragSourceDropEvent dsde) 
	{}
	
	public void dragEnter(DragSourceDragEvent dsde) 
	{}

	public void dragExit(DragSourceEvent dse) 
	{}
	
	public void dragOver(DragSourceDragEvent dsde) 
	{}

	public void dropActionChanged(DragSourceDragEvent dsde) 
	{}

}



	
	


