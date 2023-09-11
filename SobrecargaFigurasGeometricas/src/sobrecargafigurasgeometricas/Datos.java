package sobrecargafigurasgeometricas;

import javax.swing.JOptionPane;

public class Datos
{

    private int opcion;
    SobrecargaFigurasGeometricas sc;

    public void Menu()
    {
        double r, b, h, radio,lado;
        int l1, l2, p;
        float l, q;
        while (true)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que opcion deseas elegir de las siguientes: \n1.-Circulo\n2.-Cuadrado \n3.-Triangulo\n4.-Rectangulo\n5.-Esfera\n6.-Cubo\n7.-Salir"));
            //SobrecargaFigurasGeometricas sc = new SobrecargaFigurasGeometricas();
            switch (opcion)
            {
                case 1:
                    r = Double.parseDouble(JOptionPane.showInputDialog("Dame el radio de tu circulo: "));
                    sc = new SobrecargaFigurasGeometricas(r);
                    
                    break;

                case 2:

                    l = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mide el lado de tu cuadrado: "));
                    sc = new SobrecargaFigurasGeometricas(l);
                    break;
                case 3:
                    b = Double.parseDouble(JOptionPane.showInputDialog("¿Cuales la base de tu triangulo?:"));
                    h = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la altura de tu triangulo?:"));
                    sc = new SobrecargaFigurasGeometricas(b,h);
                    break;
                case 4:
                    l1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide su lado 1?:"));
                    l2 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto mide su lado 2?:"));
                    sc = new SobrecargaFigurasGeometricas(l1,l2);
                    break;
                case 5:
                    radio = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el radio de su cubo ?:"));
                    p = 4;
                    sc = new SobrecargaFigurasGeometricas(radio,p);
                    break;
                case 6:
                    lado = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide el lado de su cubo?:"));
                    q = 6;
                    sc = new SobrecargaFigurasGeometricas(lado,q);
                    break;
            }
            if (opcion == 7)
            {
                break;
            }
        }

    }
}
