package persistence;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Disciplina;

public class DisciplinaDAO implements Dao<Disciplina> {

	private SessionFactory sf;
	
	public DisciplinaDAO(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void insert(Disciplina dp) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dp);
		transaction.commit();			
	}

	@Override
	public void update(Disciplina dp) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(dp);
		transaction.commit();			
	}

	@Override
	public void delete(Disciplina dp) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(dp);
		transaction.commit();			
	}

	@Override
	public Disciplina selectOne(Disciplina dp) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		dp = entityManager.find(Disciplina.class, dp.getCodDisciplina());
		return dp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Disciplina> selectAll() throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * ");
		sql.append("FROM disciplina ");

		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(sql.toString());
		List<Object[]> atendentesResultSet = query.getResultList();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		for (Object[] o : atendentesResultSet) {
			Disciplina dp = new Disciplina();
			dp.setCodDisciplina(Integer.parseInt(o[0].toString()));
			dp.setCargaHoraria(Integer.parseInt(o[1].toString()));
			dp.setNomeDisci(o[2].toString());
			disciplinas.add(dp);
		}
		
		return disciplinas;
	}

}
