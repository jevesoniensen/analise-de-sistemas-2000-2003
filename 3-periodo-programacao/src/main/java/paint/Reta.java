package paint;

import java.awt.*;
import java.awt.geom.*;

public class Reta extends Primitiva
{
	public Reta(int x1,int y1,int x2,int y2)
	{
		this(x1,y1,x2,y2,Color.black);
	}
	
	public Reta(int x1,int y1,int x2,int y2,Color cor)
	{
		this.desloca(x1,y1,x2,y2);
		super.trocaCor(cor);
	}
	
	public void desloca(int x1,int y1,int x2,int y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void desenha(Graphics g)
	{
		g.drawLine(x1,y1,x2,y2);
	}
	
	public boolean pontoInterno(int x, int y)
	{
		return (Line2D.ptLineDist (x1,y1,x2,y2,x,y) < 3);
	}
}