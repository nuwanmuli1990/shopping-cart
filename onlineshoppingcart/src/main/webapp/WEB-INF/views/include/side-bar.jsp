<h1 class="my-4">Shop Name</h1>
<div class="list-group">

	<c:forEach items="${categories}" var="cat">
		<a id="cat_${cat.name}" href="${contextRoot}/Category/${cat.id}/Products" class="list-group-item">${cat.name}</a>
	</c:forEach>
	
</div>