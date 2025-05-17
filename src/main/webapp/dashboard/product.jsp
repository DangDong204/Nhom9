<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Product - NHOM 9</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="../assets/adimgs/favicon.png" rel="icon">
  <link href="../assets/adimgs/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="../assets/adcss/bootstrap.min.css" rel="stylesheet">
  <link href="../assets/adcss/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="../assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="../assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="../assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="../assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="../assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="../assets/adcss/style.css" rel="stylesheet">

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
      <h1>Quản lý sản phẩm</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
          <li class="breadcrumb-item">Tables</li>
          <li class="breadcrumb-item active">Quản lý sản phẩm</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Danh sách sản phẩm</h5>
              

              <!-- Table with stripped rows -->
              <table class="table datatable">
                <thead>
                  <tr>
                    <th>
                      <b>Mã sản phẩm</b>
                    </th>
                    <th>Tên sản phẩm</th>
                    <!-- <th>Ảnh</th> -->
                    <th>Số lượng</th>
                    <th>Giá bán</th>
                    <th>Mã danh mục</th>
                    <th>Mã NCC</th>
                    <th>Mô tả</th>
                    <!-- <th data-type="date" data-format="YYYY/DD/MM">Start Date</th>
                    <th>Completion</th> -->
                  </tr>
                </thead>
                <tbody>
			        <tr><td>P001</td><td>Áo thun basic nam</td><td>120</td><td>199000</td><td>C001</td><td>B001</td><td>Áo thun chất liệu cotton 100%, mềm mại, thoáng mát.</td></tr>
			        <tr><td>P002</td><td>Áo sơ mi trắng nữ</td><td>80</td><td>249000</td><td>C002</td><td>B002</td><td>Áo sơ mi nữ công sở, form slim-fit, dễ phối đồ.</td></tr>
			        <tr><td>P003</td><td>Áo khoác bomber nam</td><td>60</td><td>499000</td><td>C003</td><td>B003</td><td>Áo khoác bomber nam, vải dày dặn, phù hợp thời tiết thu đông.</td></tr>
			        <tr><td>P004</td><td>Quần jeans rách gối</td><td>90</td><td>399000</td><td>C004</td><td>B004</td><td>Quần jeans cá tính, phong cách trẻ trung, năng động.</td></tr>
			        <tr><td>P005</td><td>Quần short kaki nữ</td><td>70</td><td>179000</td><td>C005</td><td>B005</td><td>Short nữ thoải mái, hợp cho mùa hè, thiết kế đơn giản.</td></tr>
			        <tr><td>P006</td><td>Váy chữ A caro</td><td>40</td><td>289000</td><td>C006</td><td>B006</td><td>Váy caro trẻ trung, phù hợp đi học, đi chơi.</td></tr>
			        <tr><td>P007</td><td>Đầm dạ hội đỏ xẻ tà</td><td>20</td><td>1299000</td><td>C007</td><td>B007</td><td>Đầm dự tiệc thiết kế sang trọng, quyến rũ.</td></tr>
			        <tr><td>P008</td><td>Giày sneaker trắng</td><td>100</td><td>599000</td><td>C008</td><td>B008</td><td>Sneaker trắng dễ phối đồ, đế cao su êm ái.</td></tr>
			        <tr><td>P009</td><td>Túi xách da mini</td><td>50</td><td>350000</td><td>C009</td><td>B009</td><td>Túi xách nhỏ gọn, thích hợp cho nữ văn phòng.</td></tr>
			        <tr><td>P010</td><td>Kính mát tròn H&M</td><td>30</td><td>159000</td><td>C010</td><td>B002</td><td>Kính thời trang kiểu vintage, bảo vệ mắt.</td></tr>
			        <tr><td>P011</td><td>Áo thun Uniqlo Airism</td><td>100</td><td>259000</td><td>C001</td><td>B003</td><td>Áo thun công nghệ Airism, thoáng khí, siêu nhẹ.</td></tr>
			        <tr><td>P012</td><td>Áo sơ mi caro nam</td><td>50</td><td>229000</td><td>C002</td><td>B001</td><td>Áo sơ mi nam phong cách casual, dễ phối đồ.</td></tr>
			        <tr><td>P013</td><td>Áo khoác jean nữ</td><td>40</td><td>459000</td><td>C003</td><td>B011</td><td>Áo khoác jean thời trang, cá tính, form ôm body.</td></tr>
			        <tr><td>P014</td><td>Quần jeans skinny đen</td><td>60</td><td>329000</td><td>C004</td><td>B012</td><td>Quần jeans co giãn tốt, tôn dáng.</td></tr>
			        <tr><td>P015</td><td>Quần short thể thao</td><td>90</td><td>199000</td><td>C005</td><td>B010</td><td>Quần short thể thao nam, thấm hút mồ hôi tốt.</td></tr>
			        <tr><td>P016</td><td>Váy suông họa tiết</td><td>55</td><td>309000</td><td>C006</td><td>B013</td><td>Váy suông họa tiết hoa lá, trẻ trung, nhẹ nhàng.</td></tr>
			        <tr><td>P017</td><td>Đầm dạ hội đen lệch vai</td><td>15</td><td>1499000</td><td>C007</td><td>B007</td><td>Đầm dạ hội cao cấp, tôn dáng, đính đá sang trọng.</td></tr>
			        <tr><td>P018</td><td>Giày sneaker Adidas nam</td><td>85</td><td>899000</td><td>C008</td><td>B005</td><td>Sneaker Adidas chính hãng, mẫu thể thao năng động.</td></tr>
			        <tr><td>P019</td><td>Túi đeo chéo thể thao</td><td>40</td><td>199000</td><td>C009</td><td>B006</td><td>Túi nhỏ gọn, phù hợp đi chơi, tập gym.</td></tr>
			        <tr><td>P020</td><td>Dây chuyền thời trang nữ</td><td>70</td><td>159000</td><td>C010</td><td>B014</td><td>Phụ kiện thời trang tinh tế, phong cách Hàn Quốc.</td></tr>
			        <tr><td>P021</td><td>Áo thun tay lỡ Coolmate</td><td>100</td><td>209000</td><td>C001</td><td>B015</td><td>Áo thun tay lỡ unisex, form rộng, thoải mái.</td></tr>
			        <tr><td>P022</td><td>Áo sơ mi trắng oversize</td><td>60</td><td>239000</td><td>C002</td><td>B009</td><td>Áo sơ mi trắng freesize, unisex, chất vải mềm mịn.</td></tr>
			        <tr><td>P023</td><td>Áo khoác hoodie Hades</td><td>35</td><td>519000</td><td>C003</td><td>B014</td><td>Hoodie phong cách streetwear, form rộng.</td></tr>
			        <tr><td>P024</td><td>Quần jeans ống suông</td><td>70</td><td>359000</td><td>C004</td><td>B012</td><td>Phong cách retro, chất vải co giãn nhẹ.</td></tr>
			        <tr><td>P025</td><td>Quần short jean nữ</td><td>50</td><td>189000</td><td>C005</td><td>B004</td><td>Short jean nữ rách nhẹ, năng động.</td></tr>
			        <tr><td>P026</td><td>Váy maxi trắng</td><td>25</td><td>419000</td><td>C006</td><td>B013</td><td>Váy maxi nữ tính, thướt tha, phù hợp đi biển.</td></tr>
			        <tr><td>P027</td><td>Đầm dự tiệc ánh kim</td><td>10</td><td>1790000</td><td>C007</td><td>B008</td><td>Thiết kế nổi bật, ánh kim bắt sáng.</td></tr>
			        <tr><td>P028</td><td>Giày sneaker Nike Air</td><td>95</td><td>949000</td><td>C008</td><td>B006</td><td>Sneaker Nike Air cực êm, phong cách thể thao.</td></tr>
			        <tr><td>P029</td><td>Túi tote vải canvas</td><td>60</td><td>169000</td><td>C009</td><td>B010</td><td>Túi tote đơn giản, tiện dụng, thân thiện môi trường.</td></tr>
			        <tr><td>P030</td><td>Khuyên tai thời trang</td><td>80</td><td>99000</td><td>C010</td><td>B011</td><td>Khuyên tai nhỏ xinh, chất liệu không gây dị ứng.</td></tr>
                </tbody>
              </table>
              <!-- End Table with stripped rows -->

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
  <script src="../assets/adjs/apexcharts.min.js"></script>
  <script src="../assets/adjs/bootstrap.bundle.min.js"></script>
  <script src="../assets/adjs/chart.umd.js"></script>
  <script src="../assets/adjs/echarts.min.js"></script>
  <script src="../assets/vendor/quill/quill.js"></script>
  <script src="../assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="../assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="../assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="../assets/adjs/main.js"></script>

</body>

</html>