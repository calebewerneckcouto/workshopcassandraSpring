# Endpoints

Abaixo estão listados os endpoints disponíveis neste controller:

### GET /departments
- Retorna a lista de todos os departamentos cadastrados.

### GET /departments/{id}
- Retorna as informações de um departamento específico com base no ID fornecido.

### POST /departments
- Cria um novo departamento com base nos dados fornecidos no corpo da requisição.

### PUT /departments/{id}
- Atualiza as informações de um departamento específico com base no ID fornecido e nos dados fornecidos no corpo da requisição.

### DELETE /departments/{id}
- Remove um departamento específico com base no ID fornecido.

Para mais detalhes sobre os parâmetros necessários e as respostas esperadas de cada endpoint, consulte a documentação da API correspondente.
## Endpoints

### GET /departaments
- Retorna a lista de todos os departamentos cadastrados.

### GET /departaments/{id}
- Retorna o departamento com o ID especificado.

### POST /departaments
- Cria um novo departamento com base nos dados enviados no corpo da requisição.

### PUT /departaments/{id}
- Atualiza as informações do departamento com o ID especificado, com base nos dados enviados no corpo da requisição.

#### Exemplo de corpo da requisição para criação ou atualização de um departamento:
```json
{
  "name": "Departamento de TI",
  "description": "Responsável por cuidar da infraestrutura e sistemas de tecnologia da empresa."
}
```

### DELETE /departaments/{id}
- Exclui o departamento com o ID especificado.

#### Observação:
- Os endpoints retornam um status de sucesso 200 após a execução da operação.
- Em caso de erro, é retornado um status de erro com uma mensagem explicativa.
# Department Service

Simple CRUD operations for managing departments.

## Endpoints

- GET /departments
   - Retrieves a list of all departments.
- POST /departments
   - Creates a new department.
- GET /departments/{id}
   - Retrieves a specific department by ID.
- PUT /departments/{id}
   - Updates an existing department by ID.
- DELETE /departments/{id}
   - Deletes a department by ID.
# Endpoints

- GET /departaments
  - Retorna todos os departamentos

- GET /departaments/{id}
  - Retorna o departamento com o ID especificado

- POST /departaments
  - Insere um novo departamento

- PUT /departaments/{id}
  - Atualiza um departamento existente com o ID especificado

- DELETE /departaments/{id}
  - Deleta o departamento com o ID especificado
# Endpoints

Abaixo estão listados os endpoints disponíveis na API:

## Departaments

### GET /departaments
Retorna a lista de todos os departamentos cadastrados.

### GET /departaments/{id}
Retorna os detalhes de um departamento específico com base no ID fornecido.

### POST /departaments
Cria um novo departamento com base nos dados fornecidos no corpo da requisição.

### PUT /departaments/{id}
Atualiza as informações de um departamento específico com base no ID fornecido.

### DELETE /departaments/{id}
Remove um departamento específico com base no ID fornecido.


Criado por [Nome do desenvolvedor] - [Data da criação]
# Endpoints

## Get product by ID
- GET /products/{id}
- Description: Get a product by its ID
- Parameters:
  - id: Product ID (path variable)
- Response:
  - Status 200 OK
  - Body: ProductDTO

## Get all products
- GET /products
- Description: Get all products
- Response:
  - Status 200 OK
  - Body: List of ProductDTO

## Create a new product
- POST /products
- Description: Create a new product
- Parameters:
  - ProductDTO in request body
- Response:
  - Status 201 Created
  - Body: ProductDTO

## Update a product
- PUT /products/{id}
- Description: Update a product by its ID
- Parameters:
  - id: Product ID (path variable)
  - ProductDTO in request body
- Response:
  - Status 200 OK
  - Body: Updated ProductDTO

## Delete a product
- DELETE /products/{id}
- Description: Delete a product by its ID
- Parameters:
  - id: Product ID (path variable)
- Response:
  - Status 204 No Content
## Endpoints

### Get Product By ID
- Description: Retrieves a product by its ID
- Method: GET
- URL: /products/{id}
- Request Parameters:
  - id (UUID): ID of the product
- Response: ProductDTO

### Get Products By Department
- Description: Retrieves a list of products by department
- Method: GET
- URL: /products
- Request Parameters:
  - department (String): Name of the department
- Response: List of ProductDTO

### Get Products By Description
- Description: Retrieves a list of products by description
- Method: GET
- URL: /products/description
- Request Parameters:
  - description (String): Description of the product
- Response: List of ProductDTO
Endpoints disponíveis no diretório "exceptions":

1. GET /exceptions/byDescription
   - Descrição: Retorna uma lista de produtos com base na descrição fornecida.
   - Parâmetros:
     - text (String, defaultValue = ""): Texto a ser pesquisado na descrição dos produtos.
   - Exemplo de uso:
     - GET /exceptions/byDescription?text=notebook

Lembre-se de iniciar o servidor e acessar os endpoints utilizando um cliente HTTP, como o Postman, para testar as funcionalidades.
