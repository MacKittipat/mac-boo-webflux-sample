### Sample APIs

Create new user
```
curl --location --request POST 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Mac fd457360-7ee2-471e-bed9-83df23cf9ac4",
    "email": "mac@mac.com"
}
```

Get all users
```
curl --location --request GET 'http://localhost:8080/users'
```

Get user by id
```
curl --location --request GET 'http://localhost:8080/users/2
```

Get user's name by id
```
curl --location --request GET 'http://localhost:8080/users/2/name
```
