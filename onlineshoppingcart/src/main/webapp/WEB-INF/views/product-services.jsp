<div class="container">
	<div class="row">

		<!-- Side bar div -->
		<div class="col-md-3">
			<%@include file="./include/side-bar.jsp"%>
		</div>

		<!-- content bar div -->
		<div class="col-md-9">

			<nav aria-label="breadcrumb">
			
				<c:if test="${isAllProducts}">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
					<li class="breadcrumb-item active" aria-current="page">All Products</li>
				</ol>
			</c:if>
			
				<c:if test="${isCategoryProducts}">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
					<li class="breadcrumb-item" aria-current="page">Category</li>
					<li class="breadcrumb-item active" aria-current="page" >${category.name}</li>
				</ol>
			</c:if>
				
				
				
			</nav>

		</div>

	</div>

</div>