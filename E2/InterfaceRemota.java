import java.rmi.*;
import java.util.List;

public interface InterfaceRemota extends Remote{
    public double areaCirculo(double radio) throws RemoteException;
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException;
    //public double areaPoligonoIrregular(List<double> X, List<double> Y,int lados) throws RemoteException;
}
