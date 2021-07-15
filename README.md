# DB起動方法

以下のコマンドを順番に実行

`cd db`

`docker build -t myh2-db .`

`docker run -d -p 8082:8082 -p 9092:9092 myh2-db`

ブラウザで http://localhost:8082/ にアクセスするとH2Consoleが確認できる

ブラウザでログインする場合、  
JDBC URL: `jdbc:h2:/h2-data/t25-db`  
ユーザー名: `sa`  
パスワード: `sa`  


# AOP demo
ブラウザで以下のURLにアクセスするごとに、コンソールにAOPのファイルで指定した文字列が表示されます。

http://localhost:8081/test1  
http://localhost:8081/test2

コンソールに「ログテスト前」「ログテスト後」が表示される。

# JPA demo
ブラウザで以下のURLにアクセスすると画面にJSON形式で以下のように表示されます。
http://localhost:8081/test-jpa