```
$  curl -u bar:foo localhost:8080 -H "Content-Type: application/json" -d "{\"message\":\"hoge\"}"
$  curl -u bar:foo localhost:8080 
[{"id":1,"message":"hoge","updatedBy":"bar"}]
```