package paint;

import java.awt.*;

public class Quadrado extends Primitiva
{
	public Quadrado(int x1,int y1,int x2,int y2)
	{
		this(x1,y1,x2,y2,Color.black);
	}
	
	public Quadrado(int x1,int y1,int x2,int y2,Color cor)
	{
		super.desloca(x1,y1,x2,y2);
		super.trocaCor(cor);
	}
	
	public void desenha(Graphics g)
	{
		g.setColor(this.cor);
		g.drawRect(x1,y1,x2-x1,y2-y1);
	}
	
	public boolean pontoInterno(int x, int y)
	{
		
		return ((x>x1)&&(x<x2)&&(y>y1)&&(y<y2));
	}
}