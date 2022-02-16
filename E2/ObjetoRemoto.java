import java.lang.Math;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {
    private static final long  serialVersionUID = 1L;
    List<Double> distanciasCentro;
    List<Double> lados;

    protected ObjetoRemoto() throws RemoteException {
        super();
        lados = new ArrayList<>();
        distanciasCentro = new ArrayList<>();
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
    public void areaPoligonoIrregular(double lado, double distanciaCentro) throws RemoteException{
        lados.add(lado);
        distanciasCentro.add(distanciaCentro);
    }

    @Override
    public double calAreaPoligonoIrr() throws RemoteException{
        double area = 0.0;
        if (lados.size() != distanciasCentro.size()) {
            return -1.0;
        }
        for (int i = 0; i < lados.size(); i++) {
            area += (distanciasCentro.get(i) + lados.get(i)) / 2;
        }
        return area;
    }
    */
} 
