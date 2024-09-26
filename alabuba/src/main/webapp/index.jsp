<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUDZAUM CABULOSO</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Maloka enraivado</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="CreateAndFind">Lista de
							Clientes</a></li>
				</ul>
				<form class="d-flex" role="search" action="CreateAndFind">
					<input name="pesquisa" class="form-control me-2" type="search"
						placeholder="Digite o nome ou o CPF" aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Buscar</button>
				</form>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="cold-md-7">
				<hr>
				<h3>Cadastro de Clientes</h3>
				<hr>
				<form action="CreateAndFind" method="post">
					<div class="form-floating mb-3">
						<input name="nome" maxlength="40" type="text" class="form-control"
							id="floatingInput1"> <label>Nome completo</label>
					</div>
					<div class="form-floating mb-3">
						<input name="cpf" maxlength="11" type="text" class="form-control">
						<label>CPF (apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input name="nascimento" type="date" class="form-control"
							placeholder="Nascimento"> <label>Nascimento</label>
					</div>
					<select name="situacao" class="form-select mb-3"
						aria-label="Default select example">
						<option value="Inativo" selected>-- Selecione a situação</option>
						<option value="Ativo">Ativo</option>
						<option value="Inativo">Inativo</option>
					</select>

					<button class="btn btn-primary" type="submit">Cadastrar
						Cliente</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>

</body>
</html>