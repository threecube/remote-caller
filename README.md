# 关于该工程
该工程是远程调用rmi和HttpInvoker的例子，包括rmi/httpInvoker服务端，和rmi/httpInvoker的客户端。例子很简单，没有业务实现。
* remote_caller_api: 接口层，用于定义对外提供的接口。
* remote_caller_server: 服务端，用于接口的具体实现。
* remote_caller_client: 客户端，用于远程调用remote_caller_server提供的服务。


# 如何运行

## RMI
* 启动服务端

> 通过运行remote_caller_server工程中的RmiServiceStarter启动RMI的服务端。

* 运行客户端进行接口调用

> 通过运行remote_caller_client工程中的RmiServiceClient，实现对服务端RMI接口的调用。

## HttpInvoker
* 启动服务端

> 启动tomcat，对应的工程师remote_caller_server; tomcat配置根目录.

* 运行客户端进行接口调用

> 通过运行remote_caller_client工程中的InvokerServiceClient，实现对服务端HttpInvoker接口的调用。

# 关于配置
## 服务端
* RMI配置： applicationContext-rmi.xml文件
* HttpInvoker: applicationContext-invoker.xml， web.xml

## 客户端
* RMI配置：applicationContext-rmi.xml文件
* HttpInvoker：applicationContext-invoker.xml