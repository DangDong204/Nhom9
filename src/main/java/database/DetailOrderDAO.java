package database;

import java.util.ArrayList;

import model.DetailOrder;
import model.Order;

public class DetailOrderDAO implements DAOInterface<DetailOrder>{
	private ArrayList<DetailOrder> data = new ArrayList<>();
	
	@Override
	public ArrayList<DetailOrder> selectAll() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public DetailOrder selectById(DetailOrder t) {
		for (DetailOrder detailOrder : data) {
			if(data.equals(t)) {
				return detailOrder;
			}
		}
		return null;
	}

	@Override
	public int insert(DetailOrder t) {
		if(this.selectById(t) == null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<DetailOrder> arr) {
		int count = 0;
		for (DetailOrder detailOrder : arr) {
			count += this.insert(detailOrder);
		}
		return count;
	}

	@Override
	public int delete(DetailOrder t) {
		if(this.selectById(t) != null) {
			this.data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<DetailOrder> arr) {
		int count = 0;
		for (DetailOrder detailOrder : arr) {
			count += this.delete(detailOrder);
		}
		return count;
	}
	// Xóa tất cả chi tiết đơn hàng theo đơn hàng (quan hệ 1-n)
	public int deleteAll(Order order) {
		int count = 0;

		for (DetailOrder detailOrder : data) {
			if(detailOrder.getOrder().equals(order)) {
				count += this.delete(detailOrder);
			}
		}

		return count;
	}

	@Override
	public int update(DetailOrder t) {
		if(this.selectById(t) != null) {
			this.data.remove(t);
			this.data.add(t);
			return 1;
		}
		return 0;
	}
	
}
