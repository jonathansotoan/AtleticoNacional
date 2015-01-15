import java.awt.*;
import java.awt.event.*;

public class atlNacional extends Frame implements WindowListener {

   public static void main(String[] args) {
      atlNacional x = new atlNacional();
      x.setSize(360,600);
      x.setTitle("Escudo de Atlético Nacional");
      x.setVisible(true);
   }

   public atlNacional() {
      addWindowListener(this);
   }

   public void paint(Graphics g) {
      //g.drawString("Hola", 100, 100);
     //contorno
      g.drawLine(50,200,310,200);//especial2
      g.drawLine(50,140,310,140);//especial1
      g.drawLine(20,510,180,570);
      g.drawLine(20,200,20,510);
      g.drawLine(50,200,20,200);
      g.drawLine(50,140,50,200);
      g.drawLine(30,110,50,140);//izq diagonal
      g.drawLine(30,50,30,110);
      g.drawLine(30,50,90,50);//inicio
      g.drawLine(90,50,90,110);
      g.drawLine(90,110,150,110);
      g.drawLine(150,110,150,50);
      g.drawLine(150,50,210,50);
      g.drawLine(210,50,210,110);
      g.drawLine(210,110,270,110);
      g.drawLine(270,110,270,50);
      g.drawLine(270,50,330,50);
      g.drawLine(330,50,330,110);
      g.drawLine(330,110,310,140);//der diagonal
      g.drawLine(310,140,310,200);
      g.drawLine(310,200,340,200);
      g.drawLine(340,200,340,510);
      g.drawLine(340,510,180,570);
     //interior
      //ladrillos
      g.drawLine(50,160,310,160);
      g.drawLine(50,180,310,180);
      g.drawLine(102,140,102,160);
      g.drawLine(102,180,102,200);
      g.drawLine(154,140,154,160);
      g.drawLine(154,180,154,200);
      g.drawLine(206,140,206,160);
      g.drawLine(206,180,206,200);
      g.drawLine(258,140,258,160);
      g.drawLine(258,180,258,200);
      g.drawLine(76,160,76,180);
      g.drawLine(128,160,128,180);
      g.drawLine(180,160,180,180);
      g.drawLine(232,160,232,180);
      g.drawLine(284,160,284,180);
      //cuadro
      g.drawLine(50,490,320,490);
      g.drawLine(320,490,320,230);
      g.drawLine(50,490,320,230);
      g.drawLine(40,490,320,220);//linea media
      g.drawLine(310,220,40,220);
      g.drawLine(40,220,40,480);
      g.drawLine(40,480,310,220);
      //letras
       //A
       g.drawLine(80,230,80,370);
       g.drawLine(80,370,110,370);
       g.drawLine(110,370,110,340);
       g.drawLine(110,340,185,340);
       g.drawLine(80,230,110,230);
       g.drawLine(110,230,204,321);
       g.drawLine(110,310,110,268);
       g.drawLine(110,310,150,310);
       g.drawLine(150,310,110,268);
       //N
       g.drawLine(194,470,194,351);
       g.drawLine(194,470,224,470);
       g.drawLine(224,470,224,385);
       g.drawLine(224,385,284,470);
       g.drawLine(284,470,310,470);
       g.drawLine(310,470,310,329);
       g.drawLine(310,329,284,329);
       g.drawLine(284,329,284,410);
       g.drawLine(284,410,219,329);
   }

   public void windowClosing(WindowEvent e) {
      System.exit(0);
   }

   public void windowOpened(WindowEvent e){}
   public void windowClosed(WindowEvent e){}
   public void windowActivated(WindowEvent e){}
   public void windowDeactivated(WindowEvent e){}
   public void windowIconified(WindowEvent e){}
   public void windowDeiconified(WindowEvent e){}

}
