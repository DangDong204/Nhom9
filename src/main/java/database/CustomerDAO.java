package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Customer;

public class CustomerDAO implements DAOInterface<Customer>{
	//private ArrayList<Customer> data = new ArrayList<>();
	
	@Override
	public ArrayList<Customer> selectAll() {
		ArrayList<Customer> ketQua = new ArrayList<Customer>();
		try {
			// Bước 1: Tạo kết nối
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			String sql = "SELECT * FROM customer";
			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: Thực thi một câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			
			// Bước 4: xử lý kết quả 
			while(rs.next()) {
				String customerId = rs.getString("customerid");
				String userName = rs.getString("username");
				String passWord = rs.getString("password");
				String customerName = rs.getString("customername");
				String customerGender = rs.getString("customergender");
				Date customerDate = rs.getDate("customerdate");
				String customerAddress = rs.getString("customeraddress");
				String customerMobiphone = rs.getString("customermobiphone");
				String customerEmail = rs.getString("customeremail");
				Customer customer = new Customer(customerId, userName, passWord, customerName, customerGender, customerDate, customerAddress, customerMobiphone, customerEmail);
				ketQua.add(customer);
				
			}
	
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Customer selectById(Customer t) {
		Customer ketQua = null;
		try {
			// Bước 1: Tạo kết nối
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			String sql = "SELECT * FROM customer WHERE customerid=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getCustomerId());
			
			// Bước 3: Thực thi một câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			
			// Bước 4: xử lý kết quả 
			while(rs.next()) {
				String customerId = rs.getString("customerid");
				String userName = rs.getString("username");
				String passWord = rs.getString("password");
				String customerName = rs.getString("customername");
				String customerGender = rs.getString("customergender");
				Date customerDate = rs.getDate("customerdate");
				String customerAddress = rs.getString("customeraddress");
				String customerMobiphone = rs.getString("customermobiphone");
				String customerEmail = rs.getString("customeremail");
				ketQua = new Customer(customerId, userName, passWord, customerName,customerGender, customerDate,customerAddress,customerMobiphone,customerEmail);
				break;
			}
			
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int insert(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAll(ArrayList<Customer> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<Customer> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * @Override public Customer selectById(Customer t) { for (Customer customer :
	 * data) { if(data.equals(t)) { return customer; } } return null; }
	 * 
	 * @Override public int insert(Customer t) { if(this.selectById(t) == null) {
	 * this.data.add(t); return 1; } return 0; }
	 * 
	 * @Override public int insertAll(ArrayList<Customer> arr) { int count = 0; for
	 * (Customer customer : arr) { count += this.insert(customer); } return count; }
	 * 
	 * @Override public int delete(Customer t) { if(this.selectById(t) != null) {
	 * this.data.remove(t); return 1; } return 0; }
	 * 
	 * @Override public int deleteAll(ArrayList<Customer> arr) { int count = 0; for
	 * (Customer customer : arr) { count += this.delete(customer); } return count; }
	 * 
	 * @Override public int update(Customer t) { if(this.selectById(t) != null) {
	 * this.data.remove(t); this.data.add(t); return 1; } return 0; }
	 */
	
//	public static void main(String[] args) {
//		CustomerDAO bd = new CustomerDAO();
//
//		 Customer b = bd.selectById(new Customer("KH001", "nam02", "123456", "Trần Văn Nam", "Nam", null, "TP. Hồ Chí Minh", "0901123456", "nam02@gmail.com"));
//		 System.out.println(b.toString());
//
//		 
//	}


	
}
