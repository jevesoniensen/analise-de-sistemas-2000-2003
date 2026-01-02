package paint;

import java.awt.*;

public class Triangulo extends Primitiva
{
	public Triangulo(int x1,int y1,int x2,int y2)
	{
		this(x1,y1,x2,y2,Color.black);
	}
	
	public Triangulo(int x1,int y1,int x2,int y2,Color cor)
	{
		super.desloca(x1,y1,x2,y2);
		super.trocaCor(cor);
	}
	
	public void desenha(Graphics g)
	{
		int x_meio = (x1 + x2)/2;
		g.setColor(this.cor);
		g.drawLine(x_meio,y1,x2,y2);
		g.drawLine(x2,y2,x1,y2);
		g.drawLine(x1,y2,x_meio,y1);
	}
	
	public boolean pontoInterno(int x, int y)
	{
		double tgbase = (y2 - y1) / (x2 - ((x2-x1)/2));
		
		double tgesq = (y - y2) / (x - x1);
		double tgdir = (y - y2) / (x2 - x);
		
		return ((tgesq <= tgbase && tgdir <= tgbase) && (x >= x1) && (x <= x2) && (y >= x1) && (y <= y2));
	}
}