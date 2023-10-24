package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IAutoable;
import model.TblAuto;

public class ClassCrudAutoImp implements IAutoable {

	@Override
	public void RegistrarAuto(TblAuto tblauto) {
		// establecemos con la unidad de persistencia.
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoMavenLPIIMartes");
		//para gestionar los procesos
		EntityManager manager=factory.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		//registramos
		manager.persist(tblauto);
		//confirmamos
		manager.getTransaction().commit();
		//cerramos
		manager.close();	
	}   //fin del metodo registrar auto

	@Override
	public void ActualizarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		
	}  //fin del metodo  actualizar auto

	@Override
	public void EliminarAuto(TblAuto tblauto) {
		// TODO Auto-generated method stub
		
	}   //fin del metodo eliminar auto

	@Override
	public List<TblAuto> ListadoAuto() {
		//establecemos la unidad de persistencia..
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ProyectoMavenLPIIMartes");
		EntityManager manager=factory.createEntityManager();
		//iniciamos la transaccion
		manager.getTransaction().begin();
		List<TblAuto> ListaAuto=manager.createQuery("select a from TblAuto a",TblAuto.class).getResultList();
		//cofirmamos
		manager.getTransaction().commit();
		//cerramos
		manager.close();
		//retornamos el listado
		return ListaAuto;
	}   //fin del metodo listado auto

	@Override
	public TblAuto BuscarAuto() {
		// TODO Auto-generated method stub
		return null;
	}  //fin del metodo buscar auto....

}
