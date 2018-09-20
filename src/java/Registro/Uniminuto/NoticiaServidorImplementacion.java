package Registro.Uniminuto;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.jws.WebService;
import Registro.Uniminuto.Noticias;

@WebService(serviceName = "UsuarioServidorImplementacion")
public class NoticiaServidorImplementacion implements NoticiaServidor {

	private static Map<Integer,Noticias> Usuarios = new HashMap<Integer,Noticias>();
        
    @Override
    public boolean addNoticia(Noticias p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteNoticia(int idNoticia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Noticias getNoticia(int idNoticia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Noticias[] getAllNoticia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
