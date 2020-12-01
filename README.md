# partner-design
解决 idea 无法push代码到 github 问题
因为本地挂了 Shadowsocks, 经查询需要配置git的 http 代理
1. 先查看 shadowsocks 代理的地址和端口
2. 然后设置 git 参数
git config --global http.proxy http://127.0.0.1:1087
git config --global https.proxy https://127.0.0.1:1087

git config --global --unset http.proxy http://127.0.0.1:1087
git config --global --unset https.proxy https://127.0.0.1:1087


git config --global http.https://github.com.proxy http://127.0.0.1:1087
git config --global https.https://github.com.proxy http://127.0.0.1:1087
