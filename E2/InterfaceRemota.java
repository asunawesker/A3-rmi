import java.rmi.*;
import java.util.List;

public interface InterfaceRemota extends Remote{
    public double areaCirculo(double radio) throws RemoteException;
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException;
    public void areaPoligonoIrregular(double lados, double distCentro) throws RemoteException;
    public double calAreaPoligonoIrr() throws RemoteException;
}
