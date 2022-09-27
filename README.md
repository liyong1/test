## 代码练习:  
1、leetcode代码练习;  
2、大话设计模式代码练习;  

---
通过命令查看项目的remote到底是什么  
```git config --get remote.origin.url```  
```https协议会每次要求你输入账户密码，而git协议才可以使用ssh-keys文件，实现git push自由。```
<h3>在clone的时候采用的是https协议。</h3>
更改remote协议:
```git remote set-url origin git@github.com:liyong1/test.git```  
再次尝试git push，一键到位