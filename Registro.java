import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Kakugawa
 */
public interface Registro extends Remote{
    
    public Resposta insert(Aluno aluno) throws RemoteException;
}