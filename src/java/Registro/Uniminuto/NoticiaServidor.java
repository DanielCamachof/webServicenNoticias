package Registro.Uniminuto;


import Registro.Uniminuto.Noticias;

public interface NoticiaServidor {

	public boolean addNoticia(Noticias p);
	
	public boolean deleteNoticia(int idNoticia);
	
	public Noticias getNoticia(int idNoticia);
	
	public Noticias[] getAllNoticia();
}
