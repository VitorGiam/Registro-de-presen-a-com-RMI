import java.io.Serializable;

/**
 *
 * @author Kakugawa
 */
public class Resposta implements Serializable{
    private String mensagem;
    private boolean flag;
    
    public Resposta(){
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
