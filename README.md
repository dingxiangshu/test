# test
本程序目标是实现一个功能：输入一个数字，输出其各位的和。
目前已经实现了用于求解的application类，有三个函数：getnumber是从控制台读入一个数字，IsNumber作用是判断读入的是不是数字，caculate作用是进行各位之和的计算。
目前代码总共有两个版本，版本一初步但不完全地实现了目标功能，暂未发现问题，
版本二在对caculate函数进行测试时注入了一个小错误，在测试时出现了缺陷。
本项目的代码仓库在http://localhost/JenkinsTest.git中，使用的持续集成测试工具是jenkins。如果代码有所改动则可以push到代码仓库中，jenkins会很快接受到变动并开始测试。
缺陷管理工具使用的是github中的issuetracking，如果需要记录缺陷则可以在https://github.com/dingxiangshu/test/ 目录下记录缺陷。
