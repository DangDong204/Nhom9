package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Brand;
import model.Customer;
import model.Order;

public class OrderDAO implements DAOInterface<Order>{
	//private ArrayList<Order> data = new ArrayList<>();
	
	@Override
	public ArrayList<Order> selectAll() {
		ArrayList<Order> ketQua = new ArrayList<Order>();
		try {
			// Bước 1: Tạo kết nối
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			String sql = "SELECT * FROM `order`";
			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: Thực thi một câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			
			// Bước 4: xử lý kết quả 
			while(rs.next()) {
				String orderId = rs.getString("orderid");
				String customerId = rs.getString("customerid");
				String deliveryAddress = rs.getString("deliveryaddress");
				String orderState = rs.getString("orderstate");
				String paymentMethod = rs.getString("paymentmethod");
				Date createDate = rs.getDate("creatorder");
				Date deliveryDate = rs.getDate("deliverydate");
				
				Customer customer = new CustomerDAO().selectById(new Customer(customerId, "", "", "", "", null, "", "", ""));
				
				Order order = new Order(orderId, customer, deliveryAddress, orderState, paymentMethod, createDate, deliveryDate);
				ketQua.add(order);
			}
			
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
		    System.err.println("Lỗi khi truy vấn dữ liệu bảng order: " + e.getMessage());
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public Order selectById(Order t) {
		Order ketQua = null;
	    try {
	        // Bước 1: Tạo kết nối
	        Connection con = JDBCUtil.getConnection();
	        
	        // Bước 2: Tạo ra đối tượng statement
	        String sql = "SELECT * FROM `order` WHERE orderid = ?";
	        PreparedStatement st = con.prepareStatement(sql);
	        st.setString(1, t.getOrderId());
	        
	        // Bước 3: Thực thi câu lệnh SQL
	        ResultSet rs = st.executeQuery();
	        
	        // Bước 4: xử lý kết quả
	        while(rs.next()) {
	            String orderId = rs.getString("orderid");
	            String customerId = rs.getString("customerid");
	            String deliveryAddress = rs.getString("deliveryaddress");
	            String orderState = rs.getString("orderstate");
	            String paymentMethod = rs.getString("paymentmethod");
	            Date createDate = rs.getDate("creatorder");
	            Date deliveryDate = rs.getDate("deliverydate");
	            
	            // Lấy thông tin khách hàng qua CustomerDAO
	            Customer customer = new CustomerDAO().selectById(new Customer(customerId, "", "", "", "", null, "", "", ""));
	            
	            ketQua = new Order(orderId, customer, deliveryAddress, orderState, paymentMethod, createDate, deliveryDate);
	            break; // tìm thấy thì dừng vòng lặp
	        }
	        
	        // Bước 5: ngắt kết nối
	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        System.err.println("Lỗi khi truy vấn dữ liệu bảng order: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return ketQua;
	}

	@Override
	public int insert(Order t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAll(ArrayList<Order> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Order t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<Order> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Order t) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public Order selectById(Order t) {
//		for (Order order : data) {
//			if(data.equals(t)) {
//				return order;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public int insert(Order t) {
//		if(this.selectById(t) == null) {
//			this.data.add(t);
//			return 1;
//		}
//		return 0;
//	}
//
//	@Override
//	public int insertAll(ArrayList<Order> arr) {
//		int count = 0;
//		for (Order order : arr) {
//			count += this.insert(order);
//		}
//		return count;
//	}
//
//	@Override
//	public int delete(Order t) {
//		if(this.selectById(t) != null) {
//			// B1:Xóa chi tiết đơn hàng -> B2: Xóa đơn hàng
//			DetailOrderDAO dtod = new DetailOrderDAO();
//			dtod.deleteAll(t);
//			
//			this.data.remove(t);
//			return 1;
//		}
//		return 0;
//	}
//
//	@Override
//	public int deleteAll(ArrayList<Order> arr) {
//		int count = 0;
//		for (Order order : arr) {
//			count += this.delete(order);
//		}
//		return count;
//	}
//
//	@Override
//	public int update(Order t) {
//		if(this.selectById(t) != null) {
//			this.data.remove(t);
//			this.data.add(t);
//			return 1;
//		}
//		return 0;
//	}
	public static void main(String[] args) {
		OrderDAO bd = new OrderDAO();
		ArrayList<Order> kq = bd.selectAll();
		for (Order order : kq) {
			System.out.println(order);
		}

		 
	}
}
