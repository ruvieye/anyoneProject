<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Hello, world!</h1>
<div class="table-responsive">
    <table class="table">
        <thead>
            <c:forEach var="columns" items="${articleColumnList}">
                <th>${columns.column_name}</th>
            </c:forEach>
        </thead>
        <tbody class="table-hover">
            <c:forEach var="list" items="${articleList}">

                <tr id="${list.seq}" class="article_seq">
                    <c:forEach var="columns" items="${articleColumnList}">
                        <td><a href="/article/${list.seq}">${list[columns.column_name]}</a></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>


<div class="pagination">
    <ul>
        <c:forEach begin="1" end="${page.pageSize}" varStatus="st">
            <li><a href="/article/list?pageNo=${st.index}">${st.index}</a></li>
        </c:forEach>
    </ul>
</div>


<p>
    <a href="/article/post"><button id="btn_post" type="button" class="btn btn-primary">POST</button></a>
</p>




<script>
    $(document).pjax('a', '#container');
    /*
     $(document).ready(function() {

    $('#btn_post').click(function() {
        var url = "/article/post";
        anyone.goPage(url);
    });

    $('.article_seq').click(function() {
        var url = "/article/" + $(this).attr('id');
        anyone.goPage(url);
    });
     });

     function movePage(pageNo) {
    var url = "/article/list?pageNo=" + pageNo;
    anyone.goPage(url);
     }
     */
</script>

