Build steps
1) mvn clean package
2) sam build
3) sam local start-api

Below curl command for post request
    curl -d "@product.json"  -X POST http://localhost:3000/v1/product

curl command to get user
curl -X GET http://localhost:3000/api/v1/users -H "Content-Type: application/json"
