package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.dao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection con;

	public SellerDaoJDBC(Connection con) {
		this.con = con;

	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer integer) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Seller sl = new Seller();
		try {
			ps = con.prepareStatement("SELECT * FROM seller WHERE seller.id = ?;");
			ps.setInt(1, integer);
			rs = ps.executeQuery();
			if (rs.next()) {
				sl.setId(rs.getInt("id"));
				sl.setName(rs.getString("name"));
				return sl;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sl;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
