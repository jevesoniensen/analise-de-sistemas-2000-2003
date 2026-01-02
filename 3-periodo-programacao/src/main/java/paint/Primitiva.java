package paint;

import java.io.Serializable;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Primitiva implements Serializable
{	
		public int x1,y1,x2,y2;
		public Color cor;					
		public abstract void desenha(Graphics g);
		public void desloca(int x1, int y1,int x2, int y2)
		{
			if(x1 > x2)
			{
				this.x1 = x2;
				this.x2 = x1;
				//System.out.println("inverte x");
			}
			else
			{
				this.x1 = x1;
				this.x2 = x2;
				//System.out.println("mantem x");
			}
			if(y1 > y2)
			{
				this.y1 = y2;	
				this.y2 = y1;
				//System.out.println("inverte y");
			}
			else
			{
				this.y1 = y1;	
				this.y2 = y2;
				//System.out.println("mantem y");
			}
		}
		
		public void escala(int e)
		{
			float e2 = (float)e/100;
			float x = x2 - x1;
			float y = y2 - y1;
			
			x = x * e2;
			y = y * e2;
			x2 = (int) (x1 + x);
			y2 = (int) (y1 + y);
			desloca(x1,y1,x2,y2);
		}
		
		public void trocaCor(Color c)
		{
			cor = c;
		}
		
		public abstract boolean pontoInterno(int x, int y);

}