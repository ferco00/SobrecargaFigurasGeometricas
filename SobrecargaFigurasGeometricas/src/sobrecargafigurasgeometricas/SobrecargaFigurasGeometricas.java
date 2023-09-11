package sobrecargafigurasgeometricas;

public class SobrecargaFigurasGeometricas
{

    private double resultados, res;

    public SobrecargaFigurasGeometricas(double r)
    {
        Area(r);
        Resultado(resultados);
    }

    public SobrecargaFigurasGeometricas(float l)
    {
        Area(l);
        Resultado(resultados);
        
    }

    public SobrecargaFigurasGeometricas(double base, double altura)
    {
        Area(base, altura);
        Resultado(resultados);
    }

    public SobrecargaFigurasGeometricas(int l1, int l2)
    {
        Area(l1, l2);
        Resultado(resultados);
    }

    public SobrecargaFigurasGeometricas(double r, int p)
    {
        Area(r, p);
        Resultado(resultados);
    }

    public SobrecargaFigurasGeometricas(double lado, float q)
    {
        Area(lado, q);
        Resultado(resultados);

    }

    public void Area(double r)
    {
        resultados = Math.PI * (r * r);

    }

    public void Area(float l)
    {
        resultados = l * l;

    }

    public void Area(double base, double altura)
    {
        resultados = (base * altura) / 2;

    }

    public void Area(int l1, int l2)
    {
        resultados = l1 * l2;

    }

    public void Area(double r, int p)
    {
        res = Math.PI * (r * r);
        resultados = res * p;

    }

    public void Area(double lado, float q)
    {
        resultados = q * (lado * lado);
    }

    public void Resultado(double resultados)
    {
        System.out.println("******************************");
        System.out.println("*Resultado                   *");
        System.out.println("******************************");
        System.out.printf("El resultado es: %.5f", resultados);
        System.out.println("");
    }

}
