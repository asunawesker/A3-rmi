import java.lang.Math;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {
    
    private static final long  serialVersionUID = 1L;
    List<Double> abscisas;
    List<Double> ordenadas;

    protected ObjetoRemoto() throws RemoteException {
        super();
        abscisas = new ArrayList<>();
        ordenadas = new ArrayList<>();
    }
    
    @Override
    public double areaCirculo(double radio) throws RemoteException{
        return Math.PI * Math.pow(radio,2);
    }
    
    @Override
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException{
        return perimetro * apotema/2;
    }
    
    @Override
    public void verticesPoligonoIrregular(double abscisa, double ordenada) throws RemoteException{
        abscisas.add(abscisa);
        ordenadas.add(ordenada);
    }
    
    @Override
    public double areaPoligonoIrregular(int lados){
        double area = 0.0;        
        int j = lados - 1;
        
        for (int i = 0; i < lados; i++){
            area += (abscisas.get(j) + abscisas.get(i)) * (ordenadas.get(j) - ordenadas.get(i));
            j = i; 
        }
        
        return Math.abs(area / 2.0);
    }
    
} 
