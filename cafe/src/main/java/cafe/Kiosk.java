package cafe;

import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);

    public void menu() {
        String menu = """
                ======= 카페 메뉴 =======
                1. 아메리카노
                2. 라떼
                3. 아이스티
                4. 캐모마일
                선택 : """;

        while (true) {
            System.out.println(menu);
            String choice = sc.nextLine();
            Order order = null;


            switch (choice) {

                case "1":
                    order = createOrder("아메리카노");
                    break;
                case "2":
                    order = creatOrder("라떼");
                    break;
                case "3":
                    order = creatOrder("아이스티");
                    break;
                case "4":
                    order = creatOrder("캐모마일");
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
                    return;

            }
            if(order != null) {
                System.out.println("");
            } else {
                System.out.println("주문을 취소했습니다.");
            }
        }
    }
}

