package persistence;

import java.sql.SQLException;import java.util.List;

import model.Matricula;

public interface IMatriculaDao {

	public List<Matricula> selectAll() throws SQLException;
	public void insert(Matricula mt) throws SQLException;
	public void delete(Matricula mt) throws SQLException;
}
