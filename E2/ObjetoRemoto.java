import java.lang.Math;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {
    private static final long  serialVersionUID = 1L;

    protected ObjetoRemoto() throws RemoteException {
        super();
    }
    
    @Override
    public double areaCirculo(double radio) throws RemoteException{
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException{
        return perimetro * apotema/2;
    }
    
    /*
    @Override
    public double areaPoligonoIrregular(List<double> X, List<double> Y, int lados) throws RemoteException{
        double area = 0.0;        
        int j = lados - 1;
        
        for (int i = 0; i < lados; i++){
            area += (X.get(j) + X.get(i)) * (Y.get(j) - Y.get(i));
            j = i; 
        }
        
        return Math.abs(area / 2.0);
    }
    */
} 
