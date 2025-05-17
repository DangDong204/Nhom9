package database;

import java.util.ArrayList;

import model.Order;

public class OrderDAO implements DAOInterface<Order>{
	private ArrayList<Order> data = new ArrayList<>();
	
	@Override
	public ArrayList<Order> selectAll() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public Order selectById(Order t) {
		for (Order order : data) {
			if(data.equals(t)) {
				return order;
			}
		}
		return null;
	}

	@Override
	public int insert(Order t) {
		if(this.selectById(t) == null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<Order> arr) {
		int count = 0;
		for (Order order : arr) {
			count += this.insert(order);
		}
		return count;
	}

	@Override
	public int delete(Order t) {
		if(this.selectById(t) != null) {
			// B1:Xóa chi tiết đơn hàng -> B2: Xóa đơn hàng
			DetailOrderDAO dtod = new DetailOrderDAO();
			dtod.deleteAll(t);
			
			this.data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<Order> arr) {
		int count = 0;
		for (Order order : arr) {
			count += this.delete(order);
		}
		return count;
	}

	@Override
	public int update(Order t) {
		if(this.selectById(t) != null) {
			this.data.remove(t);
			this.data.add(t);
			return 1;
		}
		return 0;
	}
	
}
