# XlogDecoder
微信Mars中的xlog文件解密程序java版本，且增加支持多线程调用

# Build Artifacts
```sh
zip -d XlogDecoder.jar 'META-INF/.SF' 'META-INF/.RSA' 'META-INF/*SF' 'META-INF/*DSA'
java -jar /path/to/XlogDecoder.jar /path/to/x.xlog
```

### 友情链接
微信Mars库源码 [https://github.com/Tencent/mars/](!https://github.com/Tencent/mars/)
