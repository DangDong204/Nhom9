<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Product - NHOM 9</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="${pageContext.request.contextPath}/assets/adimgs/favicon.png" rel="icon">
  <link href="${pageContext.request.contextPath}/assets/adimgs/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="${pageContext.request.contextPath}/assets/adcss/bootstrap.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/assets/adcss/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="${pageContext.request.contextPath}/assets/adcss/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Updated: Apr 20 2024 with Bootstrap v5.3.3
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>


<body>

  <!-- ======= Header ======= -->
  <jsp:include page="parts/header.jsp" />

  <!-- ======= Sidebar ======= -->
  <jsp:include page="parts/sidebar.jsp" />

  <!-- ======= Nội dung chính của trang ======= -->
  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Quản lý đơn hàng</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
          <li class="breadcrumb-item active">Quản lý đơn hàng</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Danh sách đơn hàng</h5>
  
             <!-- Không có chức năng thêm đơn hàng -->
             <!--  <div class="text-end mb-3">
              		<button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#addBrandModal">
              			<i class="ri-add-circle-fill"> Thêm mới</i>
              		</button>
              </div> -->

              <!-- Table with stripped rows -->
              <table class="table datatable">
                <thead>
                  <tr>
                    <th> Mã đơn hàng</th>
                    <th>Mã khách hàng</th>
                    <th>Địa chỉ giao hàng</th>
                    <th>Trạng thái</th>
                    <th>Phương thức thanh toán</th>
                    <!-- <th>Ngày đặt hàng</th>
                    <th>Ngày nhận hàng</th> -->
                    <th>Thực hiện</th>
                  </tr>
                </thead>
                <tbody>
                	<c:forEach var="order" items="${listOrder}">
				      	<tr>
							<td>${order.orderId}</td>
							<td>${order.customer.customerId}</td>		<!-- order.customer.customerId -->
							<td>${order.deliveryAddress}</td>
							<td>${order.orderState}</td>
							
							<td>${order.paymentMethod}</td>
							<%-- <td>${order.createDate}</td>
							<td>${order.deliveryDate}</td> --%>
							<td>
					          	<!-- Nút xem chi tiết 1 NCC -->
					          	<button type="button" class="btn btn-primary"
									  data-bs-toggle="modal" data-bs-target="#viewOrderModal"
									  data-order-id="${order.orderId}"
									  data-customer-name="${order.customer.customerName}"
									  data-delivery-address="${order.deliveryAddress}"
									  data-order-state="${order.orderState}"
									  data-payment-method="${order.paymentMethod}"
									  data-create-date="${order.createDate}"
									  data-delivery-date="${order.deliveryDate}">
									  <i class="ri-eye-fill"></i>
								</button>

					          	
					          	<!-- Nút chỉnh sửa 1 NCC -->
						       	<button type="button" class="btn btn-warning" 
								    <%-- data-bs-toggle="modal" data-bs-target="#editBrandModal"
								    data-id="${brand.brandId}" data-name="${brand.brandName}"
								    data-address="${brand.brandAddress}" data-phone="${brand.brandMobiphone}" --%>>
								    <i class="ri-pencil-fill"></i>
								</button>
							
						       	<!-- Nút xóa 1 NCC -->
								<button type="button" 
								        class="btn btn-danger deleteBrandBtn" 
								        <%-- data-bs-toggle="modal" 
								        data-bs-target="#deleteBrandModal"
								        data-brand-id="${brand.brandId}" --%>>
								    <i class="ri-delete-bin-5-fill"></i>
								</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
              </table>
              <!-- End Table with stripped rows -->
				
				
				<!-- Modal Xem Chi Tiết Đơn Hàng -->
				<div class="modal fade" id="viewOrderModal" tabindex="-1"
				     aria-labelledby="viewOrderModalLabel" aria-hidden="true">
				    <div class="modal-dialog modal-dialog-centered modal-xl">
				        <div class="modal-content border-0 shadow-lg rounded-4">
				            <div class="modal-header bg-info text-white rounded-top-4">
				                <h5 class="modal-title" id="viewOrderModalLabel">
				                    <i class="ri-eye-line me-2"></i>Chi tiết đơn hàng
				                </h5>
				                <button type="button" class="btn-close btn-close-white"
				                        data-bs-dismiss="modal" aria-label="Đóng"></button>
				            </div>
				            <div class="modal-body px-4 pt-4">
				                <!-- Thông tin chung về đơn hàng -->
				                <div class="row g-3 mb-4">
				                    <div class="col-md-4">
				                        <label class="form-label">
				                            <i class="ri-hashtag me-1 text-primary"></i> Mã đơn hàng
				                        </label>
				                        <input type="text" class="form-control" id="orderIdText" readonly>
				                    </div>
				                    <div class="col-md-4">
				                        <label class="form-label">
				                            <i class="ri-user-3-line me-1 text-success"></i> Tên khách hàng
				                        </label>
				                        <input type="text" class="form-control" id="customerNameText" readonly>
				                    </div>
				                    <div class="col-md-4">
				                        <label class="form-label">
				                            <i class="ri-flag-line me-1 text-warning"></i> Trạng thái
				                        </label>
				                        <input type="text" class="form-control" id="orderStateText" readonly>
				                    </div>
				                    <div class="col-md-6">
				                        <label class="form-label">
				                            <i class="ri-map-pin-line me-1 text-danger"></i> Địa chỉ giao hàng
				                        </label>
				                        <input type="text" class="form-control" id="deliveryAddressText" readonly>
				                    </div>
				                    <div class="col-md-6">
				                        <label class="form-label">
				                            <i class="ri-bank-card-line me-1 text-info"></i> Phương thức thanh toán
				                        </label>
				                        <input type="text" class="form-control" id="paymentMethodText" readonly>
				                    </div>
				                    <div class="col-md-6">
				                        <label class="form-label">
				                            <i class="ri-calendar-line me-1 text-muted"></i> Ngày đặt hàng
				                        </label>
				                        <input type="text" class="form-control" id="createDateText" readonly>
				                    </div>
				                    <div class="col-md-6">
				                        <label class="form-label">
				                            <i class="ri-truck-line me-1 text-secondary"></i> Ngày nhận hàng
				                        </label>
				                        <input type="text" class="form-control" id="deliveryDateText" readonly>
				                    </div>
				                </div>
				
				                <!-- Bảng chi tiết sản phẩm -->
				                <div class="table-responsive">
				                    <table class="table table-bordered table-striped">
				                        <thead class="table-light">
				                            <tr>
				                                <th><i class="ri-barcode-line me-1"></i> Mã sản phẩm</th>
				                                <th><i class="ri-shirt-line me-1"></i> Tên sản phẩm</th>
				                                <th><i class="ri-numbers-line me-1"></i> Số lượng</th>
				                                <th><i class="ri-price-tag-3-line me-1"></i> Đơn giá</th>
				                                <th><i class="ri-calculator-line me-1"></i> Thành tiền</th>
				                            </tr>
				                        </thead>
				                        <tbody id="orderDetailsBody">
				                            <!-- Dữ liệu sẽ được thêm bằng JavaScript -->
				                        </tbody>
				                    </table>
				                </div>
				            </div>
				            <div class="modal-footer px-4 pb-4">
				                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
				                    <i class="ri-close-line"></i> Đóng
				                </button>
				            </div>
				        </div>
				    </div>
				</div>


				
        </div>
      </div>
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright <strong><span>NiceAdmin</span></strong>. All Rights Reserved
    </div>
    <div class="credits">
      <!-- All the links in the footer should remain intact. -->
      <!-- You can delete the links only if you purchased the pro version. -->
      <!-- Licensing information: https://bootstrapmade.com/license/ -->
      <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
      Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="${pageContext.request.contextPath}/assets/adjs/apexcharts.min.js"></script>
  <script src="${pageContext.request.contextPath}/assets/adjs/bootstrap.bundle.min.js"></script>
  <script src="${pageContext.request.contextPath}/assets/adjs/chart.umd.js"></script>
  <script src="${pageContext.request.contextPath}/assets/adjs/echarts.min.js"></script>
  <script src="${pageContext.request.contextPath}/assets/vendor/quill/quill.js"></script>
  <script src="${pageContext.request.contextPath}/assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="${pageContext.request.contextPath}/assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="${pageContext.request.contextPath}/assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="${pageContext.request.contextPath}/assets/adjs/main.js"></script>
	
	<!-- <script>
		const viewOrderModal = document.getElementById('viewOrderModal');
		viewOrderModal.addEventListener('show.bs.modal', async function (event) {
		    const button = event.relatedTarget;
	
		    // Lấy dữ liệu từ data-*
		    const orderId = button.getAttribute('data-order-id');
		    const customerName = button.getAttribute('data-customer-name');
		    const deliveryAddress = button.getAttribute('data-delivery-address');
		    const orderState = button.getAttribute('data-order-state');
		    const paymentMethod = button.getAttribute('data-payment-method');
		    const createDate = button.getAttribute('data-create-date');
		    const deliveryDate = button.getAttribute('data-delivery-date');
	
		    // Gán vào input
		    document.getElementById('orderIdText').value = orderId;
		    document.getElementById('customerNameText').value = customerName;
		    document.getElementById('deliveryAddressText').value = deliveryAddress;
		    document.getElementById('orderStateText').value = orderState;
		    document.getElementById('paymentMethodText').value = paymentMethod;
		    document.getElementById('createDateText').value = createDate;
		    document.getElementById('deliveryDateText').value = deliveryDate;
	
		    // Load chi tiết đơn hàng
		    const tbody = document.getElementById('orderDetailsBody');
		    tbody.innerHTML = '';
	
		    try {
		        const response = await fetch(`quanly-donhang?action=getOrderDetails&orderId=${orderId}`);
		        const orderDetails = await response.json();
	
		        orderDetails.forEach(item => {
		            const tr = document.createElement('tr');
		            tr.innerHTML = `
		                <td>${item.productId}</td>
		                <td>${item.productName}</td>
		                <td>${item.quantity}</td>
		                <td>${item.unitPrice}</td>
		                <td>${item.quantity * item.unitPrice}</td>
		            `;
		            tbody.appendChild(tr);
		        });
		    } catch (err) {
		        console.error('Lỗi khi load chi tiết đơn hàng:', err);
		        tbody.innerHTML = `<tr><td colspan="5" class="text-danger">Không thể tải dữ liệu</td></tr>`;
		    }
		});
	</script> -->
		
		<script>
document.addEventListener('DOMContentLoaded', function () {
    const modal = document.getElementById('viewOrderModal');
    modal.addEventListener('show.bs.modal', function (event) {
        const button = event.relatedTarget;

        // Lấy dữ liệu từ các thuộc tính data-*
        const orderId = button.getAttribute('data-order-id');
        const customerName = button.getAttribute('data-customer-name');
        const deliveryAddress = button.getAttribute('data-delivery-address');
        const orderState = button.getAttribute('data-order-state');
        const paymentMethod = button.getAttribute('data-payment-method');
        const createDate = button.getAttribute('data-create-date');
        const deliveryDate = button.getAttribute('data-delivery-date');

        // Gán vào các trường trong modal
        document.getElementById('orderIdText').value = orderId;
        document.getElementById('customerNameText').value = customerName;
        document.getElementById('deliveryAddressText').value = deliveryAddress;
        document.getElementById('orderStateText').value = orderState;
        document.getElementById('paymentMethodText').value = paymentMethod;
        document.getElementById('createDateText').value = createDate;
        document.getElementById('deliveryDateText').value = deliveryDate;

        // Gọi servlet để lấy chi tiết sản phẩm trong đơn hàng
        fetch('quanly-donhang?action=getOrderDetails&orderId=' + orderId)
        .then(response => response.text())
        .then(html => {
            document.getElementById('orderDetailsBody').innerHTML = html;
        });

    });
});
</script>
		


</body>

</html>