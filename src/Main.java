
import service.LoginService;

import java.util.Scanner;
/**
 * @author hongxiaozheng
 * @date 2021/4/28 8:05
 */

/**
 * 主程序，从这里开始运行程序
 */
public class Main {

        Scanner scanner = new Scanner(System.in);
        public Main() {}
        boolean flag = true;


    // 启动菜单
    public void menu() {
        while (flag) {
            System.out.println("*******************************");
            System.out.println("\t\t欢迎使用快递系统 \t\t");
            System.out.println("*******************************");
            System.out.println("1 用户注册");
            System.out.println("2 登录系统");
            System.out.println("3 商品查看");
            System.out.println("4 退出系统");
            LoginService loginService = new LoginService(scanner);
            System.out.println("请输入：");
            int funNo = scanner.nextInt(); // 功能编号

            switch (funNo) {
                case 1:
                    // 用户注册
                    loginService.resgister(scanner);
                    break;
                case 2:
                    // 登录系统
                    loginService.login();
                    break;
                case 3:
                    // 商品查看
                    break;
                case 4:
                default:
                    System.out.println("退出系统");//资源在不再使用的时候一定要进行释放
                    this.scanner.close(); // 关闭输入流
                    flag = false;
                    System.exit(0);  // 0 正常退出 非0参数，不正常中断
            }
        }
    }

    public static void main(String[] args) {
        new Main().menu();  // new Main() 匿名对象


    }

}
