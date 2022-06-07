package persistence;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Aluno;

public class AlunoDAO implements Dao<Aluno> {

	private SessionFactory sf;
	
	public AlunoDAO(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void insert(Aluno al) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(al);
		transaction.commit();			
	}

	@Override
	public void update(Aluno al) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(al);
		transaction.commit();			
	}

	@Override
	public void delete(Aluno al) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(al);
		transaction.commit();			
	}

	@Override
	public Aluno selectOne(Aluno al) throws SQLException {
		EntityManager entityManager = sf.createEntityManager();
		al = entityManager.find(Aluno.class, al.getRaAluno());
		return al;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Aluno> selectAll() throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ra_aluno, nome_aluno, email_aluno ");
		sql.append("FROM aluno ");

		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(sql.toString());
		List<Object[]> alunosResultSet = query.getResultList();
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (Object[] o : alunosResultSet) {
			Aluno al = new Aluno();
			al.setEmailAluno(o[0].toString());
			al.setNomeAluno(o[1].toString());
			al.setRaAluno(o[2].toString());
			
			
			alunos.add(al);
		}
		
		return alunos;
	}

}
