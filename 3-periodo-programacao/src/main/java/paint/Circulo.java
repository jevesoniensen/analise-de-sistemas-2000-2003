package paint;

import java.awt.*;

public class Circulo extends Primitiva
{
	private int lado;
	public Circulo(int x1,int y1,int x2,int y2)
	{
		this(x1,y1,x2,y2,Color.black);
	}
	
	public Circulo(int x1,int y1,int x2,int y2,Color cor)
	{
		if((y2 - y1) > (x2 - x1)) // halt > larg
		{
			lado = (y2 - y1);
			y2 = y1 + lado;
			x2 = x1 + lado;
		}
		else
		{
			lado = (x2 - x1);
			x2 = x1 + lado;
			y2 = y1 + lado;
		}
		super.desloca(x1,y1,x2,y2);
		super.trocaCor(cor);
	}
	
	public void desenha(Graphics g)
	{
		g.setColor(this.cor);
		g.drawOval(x1,y1,lado,lado);
	}
	
	public boolean pontoInterno(int x, int y)
	{
		int a = (x2-x1)/2;
		int b = (y2-y1)/2;
		int xcentro = x1 + a;
		int ycentro = y1 + b;
		x -= xcentro;
		y -= ycentro;
		return ((Math.pow(x,2)/Math.pow(b,2))+(Math.pow(y,2)/Math.pow(a,2))) <= 1;
	}
}