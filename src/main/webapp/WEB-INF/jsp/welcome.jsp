<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Boot grid example</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.bootgrid.css" rel="stylesheet" />

</head>

<body>
    <script src="js/jquery-1.12.4.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.bootgrid.min.js"></script>
    <script src="js/jquery.bootgrid.fa.min.js"></script>

    <table id="grid-basic" class="table table-condensed table-hover table-striped">
        <thead>
            <tr>
                <th data-column-id="id" data-type="numeric">ID</th>
                <th data-column-id="name">Name</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>

    <script>
        $.ajax({url: "data", success: function(result){
                $("#grid-basic").bootgrid("append", result);
            }});
    </script>
</body>

</html>
