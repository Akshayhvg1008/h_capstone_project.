<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<div id="app">
  <nav class="navbar navbar-expand navbar-dark bg-dark">
    <ul class="navbar-nav mr-auto" >
      <li class="nav-item">
        <a href="/home" class="nav-link">Home </a>
      </li>
      <li class="nav-item"  >
        <a href="account.jsp" class="nav-link" >Accounts</a>
      </li>
      <li class="nav-item"  >
        <a href="transfer_money.html" class="nav-link" >Transfer</a>
      </li>
      <li class="nav-item">
        <a href="/" class="nav-link" >Request Checkbook</a>
      </li>
    </ul>


    <ul class="navbar-nav ml-auto" >
     
      <li class="nav-item">
        <a href class="nav-link" >LogOut</a>
      </li>
    </ul>
  </nav>

  <div class="container">
    <router-outlet></router-outlet>
  </div>
</div>
