# spring-cloud-demo

### 启动 Kafka
1. 启动zookeeper服务，运行命令： bin\windows\zookeeper-server-start.bat config\zookeeper.properties
2. 启动kafka服务，运行命令： bin\windows\kafka-server-start.bat config\server.properties
3. 读取数据 bin\windows\kafka-console-consumer.bat --bootstrap-server 127.0.0.1:9092 --topic zipkin --from-beginning
4. 查看主题 bin\windows\kafka-topics.bat --list --zookeeper localhost:2181 