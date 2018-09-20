package Registro.Uniminuto;

import java.io.Serializable;

public class Noticias implements Serializable{

	private static final long serialVersionUID = -5577579081118070434L;
	
	private int idNoticia;
        private String tituloNoticia;
	private int puntajeNoticia;
	private int horaNoticia;

    public int getidNoticia() {
        return idNoticia;
    }

    public void setidNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String gettituloNoticia() {
        return tituloNoticia;
    }

    public void settituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public int getpuntajeNoticia() {
        return puntajeNoticia;
    }

    public void setpuntajeNoticia(int puntajeNoticia) {
        this.puntajeNoticia = puntajeNoticia;
    }

    public int gethoraNoticia() {
        return horaNoticia;
    }

    public void sethoraNoticia(int horaNoticia) {
        this.horaNoticia = horaNoticia;
    }
    
	
	@Override
	public String toString(){
		return idNoticia+"::"+tituloNoticia+"::"+puntajeNoticia+"::"+horaNoticia;
	}
}