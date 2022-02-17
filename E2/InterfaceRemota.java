import java.rmi.*;
import java.util.List;

public interface InterfaceRemota extends Remote{
    public double areaCirculo(double radio) throws RemoteException;
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException;
    public void verticesPoligonoIrregular(double abscisa, double ordenada) throws RemoteException;
    public double areaPoligonoIrregular(int lados) throws RemoteException;
}
