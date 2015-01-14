<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Bootstrap 101 Template</title>
<!-- mobile first -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">

<!-- bootstrap + jquery + respond script -->
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/bootstrap/css/bootstrap-theme.min.css">
<script src="/js/jquery-2.1.3.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container">

        <!-- Button trigger modal -->
        <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Launch demo modal</button>
        <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">Modal title</h4>
                    </div>
                    <div class="modal-body">...</div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>

        <!-- modal contorl -->
        <script>
		    $('#myModal').modal({
			show : false,
			backdrop : 'static',
			keyboard : false
		    });
		</script>

        <h1>Hello, world!</h1>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <c:forEach var="columns" items="${columns}">
                        <th>${columns.column_name}</th>
                    </c:forEach>
                </thead>
                <tbody class="table-hover">
                    <c:forEach var="list" items="${list}">
                        <tr>
                            <c:forEach var="columns" items="${columns}">
                                <td>${list[columns.column_name]}</td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <hr />
        <div class="row">
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
            <div class="col-md-1">.col-md-1</div>
        </div>
        <div class="row">
            <div class="col-md-8">.col-md-8</div>
            <div class="col-md-4">.col-md-4</div>
        </div>
        <div class="row">
            <div class="col-md-4">.col-md-4</div>
            <div class="col-md-4">.col-md-4</div>
            <div class="col-md-4">.col-md-4</div>
        </div>
        <div class="row">
            <div class="col-md-6">.col-md-6</div>
            <div class="col-md-6">.col-md-6</div>
        </div>

        <hr />


        <!-- 모바일에서 컬럼들이 하나는 꽉찬너비로, 다른 하나는 절반너비로 쌓이게 합니다. -->
        <div class="row">
            <div class="col-xs-12 col-md-8">.col-xs-12 col-md-8</div>
            <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
        </div>

        <!-- 컬럼들은 모바일에서 50% 너비로 시작하고 데스크탑에서는 33.3% 너비가 됩니다. -->
        <div class="row">
            <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
            <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
            <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
        </div>

        <!-- 컬럼들은 모바일과 데스크탑에서 항상 50% 너비가 됩니다. -->
        <div class="row">
            <div class="col-xs-6">.col-xs-6</div>
            <div class="col-xs-6">.col-xs-6</div>
        </div>

        <hr />

        <div class="row">
            <div class="col-md-4">.col-md-4</div>
            <div class="col-md-4 col-md-offset-4">.col-md-4 .col-md-offset-4</div>
        </div>
        <div class="row">
            <div class="col-md-3 col-md-offset-3">.col-md-3 .col-md-offset-3</div>
            <div class="col-md-3 col-md-offset-3">.col-md-3 .col-md-offset-3</div>
        </div>
        <div class="row">
            <div class="col-md-6 col-md-offset-3">.col-md-6 .col-md-offset-3</div>
        </div>

        <h1>
            h1. Bootstrap heading <small>Secondary text</small>
        </h1>
        <h2>
            h2. Bootstrap heading <small>Secondary text</small>
        </h2>
        <h3>
            h3. Bootstrap heading <small>Secondary text</small>
        </h3>
        <h4>
            h4. Bootstrap heading <small>Secondary text</small>
        </h4>
        <h5>
            h5. Bootstrap heading <small>Secondary text</small>
        </h5>
        <h6>
            h6. Bootstrap heading <small>Secondary text</small>
        </h6>
        <small>아래는 본문입니다</small>
        <p>월 14, 2015 10:27:04 오전 org.springframework.web.servlet.FrameworkServlet initServletBean 정보: FrameworkServlet 'dispatcherServlet': initialization completed in 302 ms 1월 14, 2015 10:27:04 오전 org.apache.coyote.AbstractProtocol start 정보: Starting ProtocolHandler ["http-bio-8080"] 1월 14, 2015 10:27:04 오전 org.apache.coyote.AbstractProtocol start 정보: Starting ProtocolHandler ["ajp-bio-8009"] 1월 14, 2015 10:27:04 오전 org.apache.catalina.startup.Catalina start 정보: Server startup in 2936 ms 1월 14, 2015 10:27:04 오전 org.springframework.web.servlet.DispatcherServlet noHandlerFound 경고: No mapping found for HTTP request with URI [/] in DispatcherServlet with name 'dispatcherServlet' [{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전
            org.apache.jasper.compiler.TldLocationsCache tldScanJar 정보: At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time. [{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_</p>

        <p class="text-muted">월 14, 2015 10:27:04 오전 org.springfra</p>
        <p class="text-primary">월 14, 2015 10:27:04 오전 org.springfra</p>
        <p class="text-success">월 14, 2015 10:27:04 오전 org.springfra.</p>
        <p class="text-info">월 14, 2015 10:27:04 오전 org.springfra</p>
        <p class="text-warning">월 14, 2015 10:27:04 오전 org.springfra</p>
        <p class="text-danger">월 14, 2015 10:27:04 오전 org.springfra</p>

        <!-- 약어 -->
        <abbr title="attribute">attr</abbr>

        <!-- 주소 -->
        <address>
            <strong>Twitter, Inc.</strong> 795 Folsom Ave, Suite 600 San Francisco, CA 94107 <abbr title="Phone">P:</abbr> (123) 456-7890
        </address>

        <address>
            <strong>Full Name</strong> <a href="mailto:#">first.last@example.com</a>
        </address>

        <!-- 인용구 -->
        <blockquote>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
            <!-- 출처 -->
            <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
        </blockquote>

        <!-- 코드 -->
        <pre class="pre-scrollable">
            <p>t.DispatcherServlet noHandlerFound
경고: No mapping found for HTTP request with URI [/] in DispatcherServlet with name 'dispatcherServlet'
[{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전 org.apache.jasper.compiler.TldLocationsCache tldScanJar
정보: At least one JAR was scanned for TLDs yet conth URI [/] in DispatcherServlet with name 'dispatcherServlet'
[{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전 org.apache.jasper.compiler.TldLocationsCache tldScanJar
정보: At least one JAR was scanned for TLDs yet cth URI [/] in DispatcherServlet with name 'dispatcherServlet'
[{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전 org.apache.jasper.compiler.TldLocationsCache tldScanJar
정보: At least one JAR was scanned for TLDs yet cth URI [/] in DispatcherServlet with name 'dispatcherServlet'
[{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전 org.apache.jasper.compiler.TldLocationsCache tldScanJar
정보: At least one JAR was scanned for TLDs yet cth URI [/] in DispatcherServlet with name 'dispatcherServlet'
[{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전 org.apache.jasper.compiler.TldLocationsCache tldScanJar
정보: At least one JAR was scanned for TLDs yet cth URI [/] in DispatcherServlet with name 'dispatcherServlet'
[{article_title=1, bbs_no=1, article_no=1, article_content=1, seq=1, user_id=1, reg_datetime=2015-01-15 00:00:00.0, writer=1}, {article_title=2, bbs_no=2, article_no=22, article_content=2, seq=2, user_id=22, reg_datetime=2015-01-16 00:00:00.0, writer=222}]1월 14, 2015 10:27:15 오전 org.apache.jasper.compiler.TldLocationsCache tldScanJar
정보: At least one JAR was scanned for TLDs yet ctained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
[{article_title=1, bbs_no=1, article_no=1, article_content=1,</p>
        </pre>


        <!-- form -->
        <form role="form">
            <div class="form-group">
                <label for="exampleInputEmail1">Email address</label> <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label> <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
            <div class="form-group">
                <label for="exampleInputFile">File input</label> <input type="file" id="exampleInputFile">
                <p class="help-block">Example block-level help text here.</p>
            </div>
            <div class="checkbox">
                <label> <input type="checkbox"> Check me out
                </label>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>

        <br />
        <!-- inline form -->
        <form class="form-inline" role="form">
            <div class="form-group">
                <label class="sr-only" for="exampleInputEmail2">Email address</label> <input type="email" class="form-control" id="exampleInputEmail2" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label class="sr-only" for="exampleInputPassword2">Password</label> <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Password">
            </div>
            <div class="checkbox">
                <label> <input type="checkbox"> Remember me
                </label>
            </div>
            <button type="submit" class="btn btn-default">Sign in</button>
        </form>

        <hr />

    </div>
</body>
</html>
